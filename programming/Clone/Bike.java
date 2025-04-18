public class Bike implements Cloneable {
    int price;
    BikeEngine eng;
    Bike(int price,BikeEngine eng){
        this.price=price;
        this.eng=eng;
    }
    public Object clone() throws CloneNotSupportedException{
        BikeEngine newEng=new BikeEngine(this.eng.power);
        Bike newBike=new Bike(this.price, newEng);
        return newBike;
    }
}
