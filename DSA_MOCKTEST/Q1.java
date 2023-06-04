public class Q1 {

	public static void main(String[] args) {


		//int[] nums = {0,1,0,3,12};
		int[] nums = {0};
		int len=nums.length;
		for(int i=0;i<nums.length;i++) {
			
			if((i+1<nums.length) && (nums[i]>nums[i+1])) {
				int temp = nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
			//System.out.println(nums[i]);
		}
		
		int i=0;
		for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
		
		for(int k:nums) {
			System.out.println(k);
		}

	}

}
