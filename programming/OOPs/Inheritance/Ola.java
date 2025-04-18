import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        System.out.println("1:Auto");
        System.out.println("2:Bike");
        System.out.println("3:Sedan");
        Scanner sc =new Scanner(System.in);
        int type=sc.nextInt();
        Cab cab=null;
        switch (type) {
            case 1:{
                cab=new Auto("Auto");//upcasting
            }break;
            case 2:{
                cab=new Bike("Bike");//upcasting
            }break;
            case 3:{
                cab=new Sedan("Sedan");//upcasting
            }break;
            default:
                break;
        }
        if(cab instanceof Auto){
            Auto auto=(Auto) cab;//downcasting
            System.out.println(auto.type);
            System.out.println(auto.price);
        }
        else  if(cab instanceof Bike){
            Bike bike=(Bike) cab;//downcasting
            System.out.println(bike.type);
            System.out.println(bike.price);
        }
        else  if(cab instanceof Sedan){
            Sedan sedan=(Sedan) cab;//downcasting
            System.out.println(sedan.type);
            System.out.println(sedan.price);
        }
    }
}
