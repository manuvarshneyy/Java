public class Bikedriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bike b1=new Bike(100,new BikeEngine("100Hp"));
        Bike b2=(Bike) b1.clone();
        b2.eng.power="20HP";
        System.out.println("Bike 1 : "+b1.eng.power);
        System.out.println("Bike 2 : "+b2.eng.power);
    }
}
