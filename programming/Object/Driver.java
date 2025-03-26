public class Driver {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=s1;
        System.out.println("Name   : "+s1.name);
        System.out.println("RollNo : "+s1.rollNo);
        s1.name="Vasuli Bhai";
        s1.rollNo=40;
        s2.name="Munna Bhai";
        s2.rollNo=50;
        System.out.println("Name   : "+s2.name);
        System.out.println("RollNo : "+s2.rollNo);
        System.out.println("Name   : "+s3.name);
        System.out.println("RollNo : "+s3.rollNo);
    }
}
