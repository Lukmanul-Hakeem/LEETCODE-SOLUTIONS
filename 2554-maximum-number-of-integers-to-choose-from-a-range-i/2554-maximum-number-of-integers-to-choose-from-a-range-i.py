class Solution:
    def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:
        Booleanlist=[False]*n
        for x in banned:
            if x <= n:
                Booleanlist[x-1]=True
        count=0 
        for i in range(0,n):
            if(not Booleanlist[i] and i+1 <=maxSum):
                count+=1
                maxSum-=(i+1)
            elif i+1 > maxSum:
                return count
        
        return count