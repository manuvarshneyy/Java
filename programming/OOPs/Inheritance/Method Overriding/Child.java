public class Child extends Parent{
    public Parent marry(){//method overriding 
        System.out.println("Child method");
        return null;
    }
    public static void main(String[] args) {
        Parent p=new Child();
        p.marry();
    }
}
