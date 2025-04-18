class Engine{
    String power;
    Engine(String power){
        this.power=power;
    }
    Engine(Engine eng){//Copy Constructor
        this.power=eng.power;
    }
}