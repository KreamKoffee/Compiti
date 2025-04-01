import requests
from bs4 import BeautifulSoup

# 模拟浏览器请求头
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36'
}

# 目标 URL
url = 'https://www.ygdy8.com/html/tv/oumeitv/index.html'

# 发起请求
response = requests.get(url, headers=headers)

# 确保响应成功
if response.status_code == 200:
    # 解析 HTML 内容
    soup = BeautifulSoup(response.content.decode('gbk'), 'html.parser')

    # 找到所有的链接标签
    links = soup.find_all('a', attrs={'class': None, 'href': True})

    print("电视剧名和 URL：")
    for link in links:
        # 获取电视剧名和 URL
        name = link.text.strip()
        href = link['href']

        # 过滤不相关的链接
        if href.startswith('/html/tv/oumeitv'):
            full_url = f"https://www.ygdy8.com{href}"
            print(f"{name}: {full_url}")
else:
    print(f"请求失败，状态码: {response.status_code}")