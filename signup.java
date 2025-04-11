import React, { useState } from 'react';

from django.db.models import Count, Avg from
django.shortcuts import render, redirect from django.db.models
import Count from django.db.models import Q import
datetime import xlwt
from django.http import HttpResponse





import pandas as pd

from sklearn.feature_extraction.text import CountVectorizer from
sklearn.metrics

import accuracy_score, confusion_matrix, classification_report
from sklearn.metrics import accuracy_score from sklearn.tree
 
import DecisionTreeClassifier



from nltk.tokenize import word_tokenize import
string from nltk.stem import WordNetLemmatizer
import nltk nltk.download('stopwords') from nltk.corpus import stopwords
# Create your views here.

from Remote_User.models import

ClientRegister_Model,cyber_threat_identifi cation,detection_ratio,detection_accuracy
import { Card,
CardContent, Typography, Button, Dialog, DialogTitle,
 
DialogContent, DialogActions, List,
ListItem, ListItemText,
} from '@mui/material';

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

{'objs': obj})

def serviceproviderlogin(request):

if request.method == "POST":
admin = request.POST.get('username') password

= request.POST.get('password')



if admin == "Admin" and password

=="Admin": detection_accuracy.objects.all().delete() return redirect('View_Remote_Users')
return render(request,'SProvider/serviceproviderlogin.html') print(kword)
obj = cyber_threat_identification.objects.all().filter(Q(Prediction=kword)) obj1

= cyber_threat_identification.objects.all() count = obj.count(); count1
= obj1.count(); obj =
detection_ratio.objects.all() return render(request,
'SProvider/View_Predicted_Cyber_Threat_Identification_Type_Ratio.html',
 
{'objs': obj})



def View_Remote_Users(request): obj=ClientRegister_Model.objects.all()
return render(request,'SProvider/View_Remote_Users.html',{'objects':obj}) def charts1(request,chart_type):
chart1 = detection_accuracy.objects.values('names').annotate(dcount=Avg('rat io')) return
render(request,"SProvider/charts1.html",
{'form':chart1, 'chart_type':chart_type}) def apply_results(label):
if (label == 0):

return 0 # No Threat elif (label

== 1):

return 1



from sklearn.tree import ExtraTreeClassifier etc_clf = ExtraTreeClassifier() etc_clf.fit(X_train,
y_train) etcpredict = etc_clf.predict(X_test) print("ACCURACY")
print(accuracy_score(y_test, etcpredict)

* 100) print("CLASSIFICATION REPORT")
print(classification_report(y_test, etcpredict)) print("CONFUSION MATRIX")
 
print(confusion_matrix(y_test, etcpredict)) # SVM Model print("SVM")
from sklearn import svm

lin_clf = svm.LinearSVC() lin_clf.fit(X_train, y_train) predict_svm = lin_clf.predict(X_test)


svm_acc = accuracy_score(y_test, predict_svm) * 100 print(svm_acc) print("CLASSIFICATION REPORT")
print(classification_report(y_test, predict_svm)) print("CONFUSION MATRIX") print(confusion_matrix(y_test, predict_svm))

svm_acc = accuracy_score(y_test, predict_svm) * 100 print(svm_acc)





print("CLASSIFICATION REPORT")
print(classification_report(y_test, predict_svm)) print("CONFUSION MATRIX") print(confusion_matrix(y_test, predict_svm))


models.append(('svm', lin_clf)) detection_accuracy.objects.create(names="SVM", ratio=svm_acc) print("Logistic Regression")
Regression”

ratio=accuracy_score(y_test, y_pred) * 100)



from sklearn.linear_model import LogisticRegression
 
reg = LogisticRegression(random_state=0,solver='lbfgs').fit(X_train, y_train) y_pred = reg.predict(X_test) detection_accuracy.objects.create(names="Logistic


print("Gradient Boosting Classifier")

from sklearn.linear_model import LogisticRegression

reg = LogisticRegression(random_state=0, solver='lbfgs').fit(, y_train) y_pred

= reg.predict(X_test) print("ACCURACY")
print(accuracy_score(y_test, y_pred) * 100) print("CLASSIFICATION REPORT")
print(classification_report(y_test, y_pred)) print("CONFUSION MATRIX")
print(confusion_matrix(y_test, y_pred)) models.append(('logistic', reg)) detection_accuracy.objects.create(names="LogisticRegression", ratio=accuracy_score(y_test, y_pred) * 100)
obj = detection_accuracy.objects.all()

return render(request,'SProvider/train_model.html', {'objs': obj}) }

