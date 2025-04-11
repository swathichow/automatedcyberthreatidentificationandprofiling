from django.db.models import Count, Avg from django.shortcuts import render, redirect from django.db.models import Count from django.db.models import Q import datetime
import xlwt
from django.http import HttpResponse


import pandas as pd
from sklearn.feature_extraction.text import CountVectorizer from sklearn.metrics
import accuracy_score, confusion_matrix, classification_report from sklearn.metrics import accuracy_score from sklearn.tree import DecisionTreeClassifier

from nltk.tokenize import word_tokenize import string from nltk.stem import WordNetLemmatizer import nltk nltk.download('stopwords')
from nltk.corpus import stopwords # Create your views here.
from Remote_User.models import ClientRegister_Model,cyber_threat_identification,detection_ratio,detection_accuracy

def serviceproviderlogin(request):
 
if request.method == "POST":
admin = request.POST.get('username') password
= request.POST.get('password')



if admin == "Admin" and password
=="Admin": detection_accuracy.objects.all().delete() return redirect('View_Remote_Users')
return render(request,'SProvider/serviceproviderlogin.html') def
View_Predicted_Cyber_Threat_Identification_Type_Ratio(request)
: detection_ratio.objects.all().delete() ratio = ""
kword = 'Cyber Threat Found' print(kword)
obj = cyber_threat_identification.objects.all().filter(Q(Prediction=kword)) obj1
= cyber_threat_identification.objects.all() count = obj.count(); count1
= obj1.count();


obj = detection_ratio.objects.all() return render(request,
'SProvider/View_Predicted_Cyber_Threat_Identification_Type_Ratio.html',
{'objs': obj}) 28
def View_Remote_Users(request):


obj=ClientRegister_Model.objects.all()
return render(request,'SProvider/View_Remote_Users.html',{'objects':obj}) def charts1(request,chart_type):
chart1 = detection_accuracy.objects.values('names').annotate(dcount=Avg('rat
 
io')) return render(request,"SProvider/charts1.html",
{'form':chart1, 'chart_type':chart_type}) def apply_results(label):
if (label == 0):
return 0 # No Threat elif (label
== 1):
return

