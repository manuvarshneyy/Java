import java.util.Arrays;

public class Arguments {
    public static void main(String[] args) {
        m1();//No argument
        add(7,5);//Parameterized(ACTUAL ARGUMENT)
        add(1,2,3,4,5,6,7,7);// Variable argument
    }
    public static void m1(){
        System.out.println("No Argument in m1");
    }
    public static void add(int x, int y){//FORMALM ARGUMENT
        int sum=x+y;
        System.out.println(x+"+"+y+"="+sum);
    }
    public static void add(int ... a){//Variable ARGUMENT
        System.out.println(Arrays.toString(a));
    }
}
