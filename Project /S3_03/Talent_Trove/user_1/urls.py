# user_1/urls.py
from django.urls import path
from . import views  # Import views from the current app

urlpatterns = [
    path('', views.profile_view, name='profile'),  # Profile page
    # path('edit/', views.edit_profile_view, name='edit_profile'),  # Edit profile page
    # path('messages/', views.messages_view, name='messages'),  # Messages page
    # path('notifications/', views.notifications_view, name='notifications'),  # Notifications page
    # Add other user-related views here
]

