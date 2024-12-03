class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        # i=0
        # for x in spaces:
        #     # print(s[:x])
        #     s=s[:x+i:]+" "+s[x+i::]
        #     i+=1
        # return s

        arr=[]
        prev=0
        for x in spaces:
            arr.append(s[prev:x])
            prev=x
        arr.append(s[prev:len(s)])
        # for str1 in arr:
        #     print(str1)
        return ' '.join(arr)  