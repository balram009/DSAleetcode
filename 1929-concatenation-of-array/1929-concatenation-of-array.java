class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int j=0;
        int []res= new int[2*n];
        for(int i=0; i<n;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0; i<n;i++){
            res[j]=nums[i];
            j++;
        }
        return res;
    }
}