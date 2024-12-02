class Solution:
    def isPrefixOfWord(self, sentence: str, prefix: str) -> int:
        words=sentence.split()
        count=0 
        for word in words:
            if(len(word)>=len(prefix) and word[:len(prefix)].find(prefix)!=-1):
                # print(word)
                return count+1
            count+=1
        return -1