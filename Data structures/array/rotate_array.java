public class rotate_array {
    public void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void rotate(int arr[],int num){
        for(int i=0;i<num%arr.length;i++){
            System.out.println(i+" "+num);
            int f = arr[0];
            int s = arr[arr.length-1];
            for(int j=0;j<arr.length-1;j++){ 
                int s1 = arr[arr.length-1-j-1];
                arr[arr.length -j -2] = s;
                s = s1;
                System.out.println("j="+j + " " +"s="+ s+" "+s1);
                print(arr);
            }
            arr[arr.length-1] = f;
        }
    }
    public static void main(String args[]){
        rotate_array ra = new rotate_array();
        int arr[] = new int[]{1,2,3,4,5,6};
        ra.rotate(arr, 2000000);
        ra.print(arr);
    }
}