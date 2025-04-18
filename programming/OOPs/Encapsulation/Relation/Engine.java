public class Engine {
    private int NoOfPiston;
    private String power;
    private String type;

    Engine(int NoOfPiston,String power,String type){
        this.NoOfPiston=NoOfPiston;
        this.power=power;
        this.type=type;
    }

    public int getNoOfpiston(){
        return this.NoOfPiston;
    }
    
    public String getPower(){
        return this.power;
    }
    
    public String getType(){
        return this.type;
    }
    // public void setNoOfPiston(int NoOfPiston){
    //     this.NoOfPiston=NoOfPiston;
    // }
    // public void setPower(String power){
    //     this.power=power;
    // }
    // public void setType(String type){
    //     this.type=type;
    // }

}