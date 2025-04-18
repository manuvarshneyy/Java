public class Driver {
    public static void main(String[] args) {
        Engine engine=new Engine(4,"A4","Petrol");//HAS-A relationship
        Car c1=new Car("Audi",engine);
        System.out.println(c1.getBrand());
        System.out.println(c1.getEngine().getType());
        System.out.println(c1.tyres[0].brand);
        c1.getMirror();
        System.out.println(c1.mirrors[0].company);

    }
}
