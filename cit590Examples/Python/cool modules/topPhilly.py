#this is a silly program that just returns the top headline on
#www.philly.com
#it uses BeautifulSoup and css selectors
import requests
from bs4 import BeautifulSoup
r = requests.get("http://www.philly.com")
data = r.text
soup = BeautifulSoup(data)
leadLinks = soup.select(".toppage-content-unit-biggie a")
leadLinksText = [link.getText().strip() for link in leadLinks if link.getText().strip() != '']
print leadLinksText[0]
