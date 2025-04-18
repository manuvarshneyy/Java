public class Phone {
    String name;
    String price;
    String ram;
    String storage;
    public Phone(String name,String price,String ram,String storage){
        this.name=name;
        this.price=price;
        this.ram=ram;
        this.storage=storage;
    }
    public String toString(){//Overriding
        String d1="[ Name : " + this.name + " | Price : " + this.price + " | RAM : " + this.ram + " | Storage : " + this.storage + " ]" ;
        return (d1);
    }
    public boolean equals(Object obj){//Overriding
        if(obj instanceof Phone){
            Phone p1=(Phone) obj;//Downcasting
            if(this.name.equals(p1.name) && this.price.equals(p1.price) && this.ram.equals(p1.ram) && this.storage.equals(p1.storage) ){
                return true;
            }
        }
        return false;
    }

   
    
    

    
}
