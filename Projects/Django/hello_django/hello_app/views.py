from django.shortcuts import render
# from django.http import HttpResponse
# from django.shortcuts import render
# Create your views here.
def print_hello(request):
    movie_data ={'movies': [
        {
        'title': "The Shawshank Redemption",
        'year': 1994,
        'summary': "The story of a man's redemption and friendship in prison.",
        'success': True
    },
    {
        'title': "Inception",
        'year': 2010,
         'success': True
    },
    {
        'title': "The Matrix",
        'year': 1999,
        'success': True
    },
    {
        'title': "Pulp Fiction",
        'year': 1994,
        'summary': "Interconnected stories of crime in Los Angeles.",
        'success': False
    },
    {
        'title': "The Godfather",
        'year': 1972,
        'summary': "The powerful saga of a crime family and their rise to power.",
        'success': True
    }
]}
    return render(request,'hello.html',movie_data)
  
