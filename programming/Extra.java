import java.util.Arrays;
public class Extra {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3=merge(arr1,arr2);
        // for(int i=0;i<arr3.length;i++){
        //     System.out.print(arr3[i] +" ");
        // }
        System.out.println(Arrays.toString(arr3));//to print array without for loop
        
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int j=0;
        for(int i=arr1.length;i<arr3.length;i++){
            arr3[i]=arr2[j];
            j++;
        }
        return arr3;
    }
}
