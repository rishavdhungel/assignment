# Generated by Django 3.1.7 on 2021-07-13 16:18

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('college', '0006_remove_application_status_status'),
    ]

    operations = [
        migrations.DeleteModel(
            name='Application_Status',
        ),
    ]
