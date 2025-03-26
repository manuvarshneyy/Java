class ConstOverloading{
    String company;
    String model;
    String price;
    ConstOverloading(String company){
        this.company=company;
    }
    ConstOverloading(String company,String model){
        this(company);
        this.model=model;
    }
    ConstOverloading(String company,String model,String price){
        this(company,model);
        this.price=price;
    }
    void data(){
        if(this.company!=null)
        System.out.println("Company :"+this.company);
        if(this.model!=null)
        System.out.println("Model   :"+this.model);
        if(this.price!=null)
        System.out.println("Price   :"+this.price);
    }
}