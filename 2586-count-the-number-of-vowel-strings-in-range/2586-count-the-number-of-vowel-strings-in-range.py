class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        str1="aeiou"
        count=0
        for x in range(left,right+1):
            if str1.find(words[x][0]) != -1 and str1.find(words[x][-1]) != -1:
                count += 1
        return count