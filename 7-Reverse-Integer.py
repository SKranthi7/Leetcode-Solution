class Solution(object):
    def reverse(self, x):
        sum=0
        t=x
        if 0>x:
            x=-x

        while x>0:
            rem=x%10
            sum=sum*10+rem
            x=x//10
        if sum<2**31-1 and sum>-2**31:      
            if t>0:
                return sum
            else:
                return -sum
        return 0
