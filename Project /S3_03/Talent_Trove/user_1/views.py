# user_1/views.py
from django.shortcuts import render

def profile_view(request):
    return render(request, 'user_1/profile.html')  # Ensure this path matches your template location
