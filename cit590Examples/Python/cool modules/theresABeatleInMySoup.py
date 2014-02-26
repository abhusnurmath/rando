import requests
r = requests.get("http://abbeyrd.best.vwh.net/songs.htm")
data = r.text
soup = BeautifulSoup(data)
listOfBeatlesSongs = []
for li in soup.find_all('li'):
	listOfBeatlesSongs.append(''.join(li.findAll(text=True)))

f = open('beatlesSongs.txt', 'w')
f.writelines(listOfBeatlesSongs)
f.close()
