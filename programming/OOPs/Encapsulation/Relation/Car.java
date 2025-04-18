public class Car {
    private String brand;
    private Engine engine;

    Tyre[] tyres=new Tyre[4];
    {
        for(int i=0;i<tyres.length;i++){
            tyres[i]=new Tyre();
        }
    }
    Car(String brand,Engine engine){
        this.brand=brand;
        this.engine=engine;
    }
    public Engine getEngine(){
        return this.engine;
    }
    public String getBrand(){
        return this.brand;
    }
    
    Mirror[] mirrors;
    public void getMirror(){
        mirrors=new Mirror[4];
        for(int i=0;i<mirrors.length;i++){
            mirrors[i]=new Mirror();
        }
    }


}
