from django.shortcuts import HttpResponse


# 编写视图函数
def hello(request):
    return HttpResponse("<h1>你好 Django</h1>")
