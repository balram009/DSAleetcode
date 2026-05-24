class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int ele: nums){
            if(set.contains(ele)==true) return true;
            else set.add(ele);
        }
        return false;
    }
}