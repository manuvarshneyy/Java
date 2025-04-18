public class PhoneDetails {
    public static void main(String[] args) {
        Phone p=new Phone("Iphone", "1.5 Lakhs", "12GB", "256GB");
        Phone p2=new Phone("Iphone", "1.5 Lakhs", "12GB", "256GB");
        System.out.println("=====================================================================");
        System.out.println(p);
        System.out.println("=====================================================================");
        System.out.println(p.equals(p2));
    }
}
