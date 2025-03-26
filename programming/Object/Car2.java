public class Car2 {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();
        c1.name="BMW";
        c1.model="M4";
        c1.price="80 Lakhs";
        c2.name="Audi";
        c2.model="A7";
        c2.price="90 Lakhs";
        c3.name="Alto";
        c3.model="LXI";
        c3.price="4 Lakhs";
        System.out.println("Name  : "+c1.name);
        System.out.println("Model : "+c1.model);
        System.out.println("Price : "+c1.price);
        System.out.println("Name  : "+c2.name);
        System.out.println("Model : "+c2.model);
        System.out.println("Price : "+c2.price);
        System.out.println("Name  : "+c3.name);
        System.out.println("Model : "+c3.model);
        System.out.println("Price : "+c3.price);
    }
}
