# Generated by Django 3.1.7 on 2021-07-13 16:16

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('college', '0005_auto_20210713_1839'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='application_status',
            name='status',
        ),
    ]