public class Student {
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){//overriding with object class
        String data= "[ Name : " + this.name + ", Age : " + this.age + " ]"; 
        return data;
    }
}
