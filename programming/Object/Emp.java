public class Emp {
    int id;
    String name;
    String department;
    String salary;
    int age;
    Emp(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    Emp(int id,String name,String department,String salary,int age){
        this(id,name,department);
        this.salary=salary;
        this.age=age;
    }
    void print(){
        if(this.id!=0)
        System.out.println("Id         :"+this.id);
        if(this.name!=null)
        System.out.println("Name       :"+this.name);
        if(this.department!=null)
        System.out.println("Department :"+this.department);
        if(this.salary!=null)
        System.out.println("Salary     :"+this.salary);
        if(this.age!=0)
        System.out.println("Age        :"+this.age);
        
    }
}
