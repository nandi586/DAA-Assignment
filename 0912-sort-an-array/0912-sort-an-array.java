class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[],int low,int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }
    public void merge(int[] arr,int low,int high,int mid){
        int i=low,j=mid+1,k=0;
        int result[] = new int[high-low+1];
             while(i<=mid && j<=high){
                if(arr[i]<arr[j]){
                    result[k]=arr[i];
                    k++;
                    i++;
                }else{
                     result[k]=arr[j];
                    k++;
                    j++;
                }
             }

             while(i<=mid){
                 result[k]=arr[i];
                    k++;
                    i++;
             }
             while(j<=high){
                 result[k]=arr[j];
                    k++;
                    j++;
             }
            int index=0;
             for(int s=low;s<=high;s++){
                arr[s]=result[index];
                index++;
            }
    }
}