class Solution {
    public int fib(int n) {
        if(n == 0)return 0;
        int first = 0;
        int second = 1;
        int next = 1;
        int i = 2;
        while(i<=n){
            next = first + second;
            first = second;
            second = next;
            i++;
        }
        System.out.println(i);
        return next;
    }
}