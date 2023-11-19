 class AddTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int len=nums.length;
        if(len == 0) {
            throw new IllegalArgumentException("Array is empty");
            }
        for(int i=0;i<len;i++){
            int complement=target-nums[i];
             if(numMap.containsKey(complement))
             {
                return new int[]{numMap.get(complement), i};
             }
             numMap.put(nums[i], i);
        }
        return new int[]{};
        
    }

    public static void main(String[] args){
        AddTwoSum s = new AddTwoSum();
        int[] num = {};
        int tar = 7;
        int[] res = s.twoSum(num, tar);
        System.out.println(res);
    }
}
