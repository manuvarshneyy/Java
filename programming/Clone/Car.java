public class Car {
    int price;
    Engine eng;
    Car(int price,Engine eng){
        this.price=price;
        this.eng=eng;
    }
    Car(Car oldcar){//Copy Constructor
        this.price=oldcar.price;//in oldcar we have the address of Car object
        this.eng=new Engine(oldcar.eng);//calling copy contructor of engine class
        //deep copy
    }
}
