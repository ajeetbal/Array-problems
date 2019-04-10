class Solution {
    public int dominantIndex(int[] array) {
        int index = 0;
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[index] < array[i + 1]) {
				index = i + 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}
			if (array[index] >= 2 * array[i]) {
				count++;
			}
		}
		if (count == (array.length) - 1) {
			return index;

		}
        else{
            return -1;
        }
    }
}
