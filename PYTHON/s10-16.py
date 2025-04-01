import requests, json

def get_hero():
    url='https://game.gtimg.cn/images/lol/act/img/js/heroList/hero_list.js'
    headers = {
        'user-agent':
        'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0'
    }

    hero_res = requests.get(url, headers=headers)
    hero_json = hero_res.json()
    hero_list = hero_json['hero']
    return hero_list

def get_skin(hero_list):
    for h in hero_list:
        url = 'https://game.gtimg.cn/images/lol/act/img/js/hero/{}.js'.format(str(h['heroId']))
        headers = {
            'user-agent':
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0'
        }
        skin_res = requests.get(url, headers = headers)
        skin_json = skin_res.json()
        skin_list = skin_json['skins']
        for s in skin_list:
            if s['mainImg']:
                file_path = r'C:\\Users\\User\\Documents\\s9\LolSkins\\' + str(s['skinId']) + '.jpg'
                download(file_path, s['mainImg'])
    
def download(file_path, picture_url):
    headers = {
        'user-agent':
            'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 OPR/114.0.0.0'
    }
    r = requests.get(picture_url, headers=headers)
    with open(file_path, 'wb') as f:
        f.write(r.content)

hero_list = get_hero()
print(hero_list)

hero_list = get_hero()
get_skin(hero_list)