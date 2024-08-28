from django.shortcuts import render, redirect
from .models import MovieInfo
from .forms import MovieForm
from django.contrib.auth.decorators import login_required

@login_required(login_url='login/')
def create(request):
    if request.method == 'POST':
        frm = MovieForm(request.POST, request.FILES)  # Include request.FILES for file uploads
        if frm.is_valid():
            frm.save()
            return redirect('list')  # Redirect to the list view after saving
    else:
        frm = MovieForm()
    
    return render(request, 'create.html', {'frm': frm})

@login_required(login_url='login/')
def list(request):
    recent_visits=request.session.get('recent_visits',[])
    count=request.session.get('count',0)
    count=int(count)
    count=count+1
    request.session['count']=count
    recent_movie_set=MovieInfo.objects.filter(pk__in=recent_visits)
    movie_set = MovieInfo.objects.all()
    response=render(request, 'list.html', {
        'recent_movies': recent_movie_set,
        'movies': movie_set,'visits':count})

    return response

@login_required(login_url='login/')
def edit(request, pk):
    instance_to_be_edited = MovieInfo.objects.get(pk=pk)
    if request.method == 'POST':
        frm = MovieForm(request.POST, request.FILES, instance=instance_to_be_edited)
        if frm.is_valid():
            frm.save()
            return redirect('list')  # Redirect to the list view after saving
    else:
        recent_visits=request.session.get('recent_visits',[])
        recent_visits.insert(0,pk)
        request.session['recent_visits']=recent_visits
        frm = MovieForm(instance=instance_to_be_edited)
    return render(request, 'create.html', {'frm': frm})

@login_required(login_url='login/')
def delete(request, pk):
    instance = MovieInfo.objects.get(pk=pk)
    instance.delete()
    return redirect('list')  # Redirect to the list view after deletion