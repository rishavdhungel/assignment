# Generated by Django 3.2.9 on 2022-01-10 04:01

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('college', '0028_auto_20220110_0337'),
    ]

    operations = [
        migrations.AddField(
            model_name='application',
            name='student_profile',
            field=models.ImageField(default=1, upload_to='images'),
            preserve_default=False,
        ),
    ]