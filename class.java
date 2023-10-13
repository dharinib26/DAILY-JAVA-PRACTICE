class HelloWorld {
    public static void main(String[] args) {
        int arr[]={23,43,53,33,88,77};
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max){
                max2 = arr[i];
            }
        
        }
        System.out.println(max2);
    }
}
