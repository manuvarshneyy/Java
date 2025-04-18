import java.util.Arrays;

class Intro{
    public static void main(String[] args) {//tostring , hashcode and equals are overridden in each wrapper class 
        Object o=20;//20 will get converted to Integer and 
        //parent of Integer is Number then upcasting will happen
        // o=10.21;
        o="Anything";
        System.out.println(o);//output will be 20

        Integer i=10;
        System.out.println(i);

        Object [] arr =new Object[5];
        arr[0]=10;
        arr[1]=false;
        arr[2]=10.21;
        arr[3]="String";
        arr[4]="Not";
        System.out.println(Arrays.toString(arr));
    }
}