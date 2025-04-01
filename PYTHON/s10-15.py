import requests, json

s = requests.session()

headers = {
    "User-Agent":"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0"
}

def read_cookie():
    cookie_txt = open(r"C:\Users\User\Documents\s9\cookie.txt", 'r')
    b = cookie_txt.read()
    cookies_dict = json.loads(b)
    cookies = requests.utils.cookiejar_from_dict(cookies_dict)
    s.cookies = cookies

def login():
    url = 'https://www.miaocode.com/core/user/login'
def decrypt(pwd):
    user_pwd = ""
    for i in pwd:
        user_pwd+=str(ord(i)-23)
    return user_pwd
headers = {
'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36'
,'Referer':'https://course.miaocode.com/'   
}
params = {
    'phone': '18829897923',
    'userPassword': decrypt("123456")
}
login_in = requests.get(url, params=params, headers=headers)
cookies = login_in.cookies

def send_msg():
    url_1 = "https://www.miaocode.com/core/projCo/addComment"
    data = {
        "projectId": '3589',
        "content": input("请输入评论: ")
    }
    s.post(url_1, headers=headers, data=data)
    print("发表成功!")

try:
    read_cookie()

except FileNotFoundError:
    login()

send_msg()