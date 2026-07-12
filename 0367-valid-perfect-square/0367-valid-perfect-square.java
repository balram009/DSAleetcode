class Solution {
    public boolean isPerfectSquare(int num) {
        long n =num;
        long low=1;
        long high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==(long)n) return true;
            else if(mid*mid>(long)n) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}