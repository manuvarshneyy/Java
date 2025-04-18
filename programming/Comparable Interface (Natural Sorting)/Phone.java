public class Phone implements Comparable{
    int price;
    String name;
    Double rating;
    Phone(int price,String name,Double rating){
        this.price=price;
        this.name=name;
        this.rating=rating;
    }
    public String toString(){
        return "[ price "+ this.price+" name  "+this.name+" rating "+this.rating+"]"; 
    }
    public int compareTo(Object o){
        Phone p=(Phone) o;
        if(this.price!=p.price){
            return this.price-p.price;
        }
        if(!this.rating.equals(p.rating)){
            return this.rating.compareTo(p.rating);
        }
        return this.name.compareTo(p.name);
    }
}
