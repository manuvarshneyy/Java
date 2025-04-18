public class Charger implements Comparable{
    int price;
    String name;

    Charger(int price,String name){
        this.price=price;
        this.name=name;

    }
    public String toString(){
        return "[ price "+ this.price+" name  "+this.name+"]"; 
    }
    public int compareTo(Object o){
        Charger c=(Charger) o;
        return this.price-c.price;
    }
}
