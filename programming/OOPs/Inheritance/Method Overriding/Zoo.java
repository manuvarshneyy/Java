import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("1.dog");
        System.out.println("2.cat");
        System.out.println("3.cow");
        Animal a=null;
        int n=sc.nextInt();
        switch (n) {
            case 1:{
                a=new Dog();
            }break;
            case 2:{
                a=new Cat();
            }break;
            case 3:{
                a=new Cow();
            }break;
            default:
                break;
        }
        a.sound();

    }
}
