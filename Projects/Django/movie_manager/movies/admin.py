from django.contrib import admin
from .models import CensorInfo,MovieInfo,Director,Actor
# Register your models here.
admin.site.register(MovieInfo)
admin.site.register(CensorInfo)
admin.site.register(Director)
admin.site.register(Actor)