from typing import Text
from django import forms
from django.db.models import fields
from django.forms import widgets
from .models import Application

class ApplicationForm(forms.ModelForm):
    class Meta:
        model = Application
        exclude = ('user', 'Application_Status', 'message',)
        fields = "__all__"
        widgets = {
            'name': forms.TextInput(attrs={'class': 'form-control'}),
            'user' : forms.TextInput(attrs={'class': 'form-control'}), 
            'name' : forms.TextInput(attrs={'class': 'form-control'}), 
            'email' : forms.TextInput(attrs={'class': 'form-control'}),  
            'phone_no' : forms.TextInput(attrs={'class': 'form-control'}),  
            'address' : forms.TextInput(attrs={'class': 'form-control'}),  
            'SLC_percentage':forms.TextInput(attrs={'class': 'form-control'}),
            'high_percentage':forms.TextInput(attrs={'class': 'form-control'}),

            }
