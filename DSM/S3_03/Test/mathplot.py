import matplotlib.pyplot as plt

d = [25, 30, 45, 10,50]
e = [1,2,3,4,5]
f = [2,1,4,3,5]
g = [3,1,5,4,2]
h = [2,5,4,1,3]
plt.subplot(2,2,1)
plt.plot(d,e)

plt.subplot(2,2,2)
plt.hist(f)

plt.subplot(2,2,3)
plt.bar(d,g,color="red",edgecolor="green")
plt.subplot(2,2,4)
plt.pie(h,autopct='%1.1f%%')
plt.show
