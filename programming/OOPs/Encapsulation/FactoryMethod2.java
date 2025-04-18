public class FactoryMethod2 {
    public static void main(String[] args) {
        Factorymethod f1=Factorymethod.getStudentObject("Raju", 26);
        System.out.println(f1.getName());
        System.out.println(f1.getAge());
    }
}
