import requests
url = "https://course.miaocode.com/core/user"

def decrypt(pwd):
    user_pwd = ""
    for i in pwd:
        user_pwd += str(ord(i)-23)
    return user_pwd

params = {
    'phone':"3397613018",
    'userPassword': decrypt('Chen3351787168')
}

headers = {
    'user-agent':
    'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0'
}

a = requests.get(url, params=params, headers=headers)

print(a)

cookies = a.cookies

url = 'https://www.miaocode.com/core/projCo/addComment'

data = {
    "projectid": '3589',
    'content' : '12'
}

comment = requests.post(url, headers = headers, data=data, cookies = cookies)
print("commented")