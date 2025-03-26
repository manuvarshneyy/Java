import java.util.*;

public class input {
     public static void main( String[] args){
        Scanner src=new Scanner(System.in);
        int age= src.nextInt();
        String a= age>18?"Allowed":"Under Age" ;
        System.out.println(a);
     }
}
