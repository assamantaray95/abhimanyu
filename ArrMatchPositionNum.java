class ArrMatchPositionNum {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(arr[i] == i+1){
                result.add(i+1);
            }
        }
        return result;
     }
}