public class ConstOverloading2 {
    public static void main(String[] args) {
        ConstOverloading c1=new ConstOverloading("HP","Ryzen 7","70k");
        ConstOverloading c2=new ConstOverloading("Dell","I9");
        ConstOverloading c3=new ConstOverloading("Lenovo");
        c1.data();
        c2.data();
        c3.data();
    }
}
