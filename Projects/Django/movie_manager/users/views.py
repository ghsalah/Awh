from django.shortcuts import render,redirect
from django.contrib.auth.models import User
# Create your views here.
from django.contrib.auth import authenticate, login as authlogin, logout as authlogout



def login(request):
     error_massage=None
     if request.POST:
        username = request.POST['username']
        password = request.POST['password'] 
        user=authenticate(username=username,password=password)
        if user:
            authlogin(request,user)
            return redirect('list')
        else:
            error_massage="invalid user"


     return render(request,'users/login.html')

def logout(request):
    authlogout(request)
    return redirect('login')


def signup(request):
    user=None
    error_massage=None
    if request.POST:
        username = request.POST['username']
        password = request.POST['password']        
        try:
            user=User.objects.create_user(username=username,password=password)
        except Exception as e:
            error_massage=str(e)
    return render(request,'users/create.html',{'user':user,'error_massage':error_massage})


