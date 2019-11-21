public static void bubbleSort(int[] nums) {
	for(int i = 0; i < num.length-2; i++) {
		for(int j = 0; j < nums.length-2-i; j++) {
			if(nums[j] > nums[j+1]) {
				temp = numbers[j];
				numbers[j] = numbers[j+1];
				numbers[j+1] = temp;
			}
		}
	}
}