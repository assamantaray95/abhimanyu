public class BubbleSort
{
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < (arr.length - 1); i++){
            for(int j = 0; j < (arr.length - i - 1); j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
	public static void main(String[] args) {
		int[] arr = {4, 1, 5, 9, 2};
	    int[] sortedArray = bubbleSort(arr);
	    for(int ar : sortedArray){
	        System.out.print(ar+" ");
	    }
	}
}
