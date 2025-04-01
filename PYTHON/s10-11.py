import requests
import json
res = requests.get('https://www.miaocode.com/core/project/getProjectWithLikedPage?type=-1&status=P&orderBy=CT&size=25&currentPage=1&isRec=true&t=1732954481632')

print(type(res))
print(type(res.text))

res = json.loads(res.text)
print(type(res))
da = res['data']['list']

for i in da:
    print(i['projectName'])
    print(i['user']['userName'])
    print(i['likeQty'])
    print(i['runQty'])
