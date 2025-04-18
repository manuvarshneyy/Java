class Book implements Comparable{
    int price;
    String name;
    Double rating;
    Book(int price,String name,Double rating ){
        this.price=price;
        this.name=name;
        this.rating=rating;
    }
    public String toString(){
        return "[ price "+ this.price+" name  "+this.name+" rating "+this.rating+"]"; 
    }
    public int compareTo(Object o){
        Book b1=(Book) o;//downcasting
        if(this.price!=b1.price)
        return this.price-b1.price;
        return this.rating.compareTo(b1.rating);//for double done internally
    }
}