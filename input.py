num = int(input())
data = 'Hello python3.8'
f = open("data.txt", "w")

for i in range(num):
	print(data)
	f.write(data+'\n')

f.close()
