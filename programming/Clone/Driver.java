public class Driver {
    public static void main(String[] args) {
        Engine eng=new Engine("1000HP");
        Car c1=new Car(12000,eng);
        Car c2=new Car(c1);//copy
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Power : "+c1.eng.power+" | Price : "+c1.price);
        System.out.println("Power : "+c2.eng.power+" | Price : "+c2.price);
    }
}
