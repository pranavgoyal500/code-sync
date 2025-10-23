class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            int difference=target-number;
            if(mpp.containsKey(difference)){
                int[] result=new int[2];
                int index=mpp.get(difference);
                result[0]=index;
                result[1]=i;
                return result;

            }
            mpp.put(number,i);
        }
        return new int[0];
    }
}