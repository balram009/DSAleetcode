class Solution {
    public int[] searchRange(int[] nums, int target) {
      int n=nums.length;
        int low=0;
        int high=n-1;
        int fi=-1;//first index of k
        int li=-1;
        int[]res=new int [2]; 
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                fi=mid; //abhi ke liye if yahi hoga
                high=mid-1; // always go in the left half for first occurence
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                li=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
        }  
        else{
                low=mid+1;
            }
        }
             res[0]=fi;
             res[1]=li;
            return res;
    }
}