s = "ababcbacadefegdehijhklij"
n = len(s)
last = [0]*26
for i in range(n):
    last[ord(s[i])-ord('a')] = i

start = 0
end = 0
res = []
for i in range(n):
    end = max(last[ord(s[i])-ord('a')],end)
    if i == end:
        res.append(end - start+1);
        start = i+1
print(res)