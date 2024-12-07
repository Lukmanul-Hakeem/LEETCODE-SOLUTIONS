class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice=2**31 - 1
        maxProfit=0
        for price in prices:
            if price < minPrice : minPrice=price
            else :
                # print(price)
                maxProfit=max(maxProfit,price-minPrice)

        return maxProfit        