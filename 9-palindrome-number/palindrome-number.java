class Solution {
    public boolean isPalindrome(int x) {
        int i,lastD,rev=0;
        for(i=x;i>0;i=i/10){
            lastD = i%10;
            rev = rev*10+lastD;
        }
        if(rev == x)
            return true;
        else
            return false;
    }
}