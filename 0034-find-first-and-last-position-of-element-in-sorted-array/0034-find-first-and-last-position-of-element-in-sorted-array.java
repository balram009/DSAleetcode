class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int []res= new int[2];
        int low=0;
        int high=n-1;
        int fi=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                fi=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        low=0;
        high=n-1;
        int li=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                li=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        res[0]=fi;
        res[1]=li;
        return res;
    }
}