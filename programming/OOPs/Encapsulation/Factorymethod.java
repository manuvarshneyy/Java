public class Factorymethod {
    private String name;
    private int age;
    private Factorymethod(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public static Factorymethod getStudentObject(String name,int age){
        return new Factorymethod(name, age);
    }
    
}
