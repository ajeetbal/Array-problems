class Solution {
    public int pivotIndex(int[] array) {
        int size = array.length;
		int leftSum = 0;
		int rightSum = 0;
		int pivot = 0;
        int index=0;
        if(size==0){
            return -1;
        }
		for (int i = 0; i < array.length; i++) {
			pivot = i ;
			for (int j = 0; j < pivot; j++) {
				leftSum += array[j];
			}
			for (int j = pivot + 1; j < size; j++) {
				rightSum += array[j];
			}
			if(leftSum==rightSum) {
				index= pivot;
				break;
			}
			else if(i==size-1) {
				index=-1;
				
			}
			else {
				leftSum=0;
				rightSum=0;
			}
		}
   
return index;    }
}
