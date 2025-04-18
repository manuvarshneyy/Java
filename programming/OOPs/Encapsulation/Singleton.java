public class Singleton {
    private static Singleton singleton;//Static variable so it will beloaded only once
    private String dbName;
    private String userName;
    private Singleton(String dbName,String username){
        this.dbName=dbName;
        this.userName=username;
    }
    public String getdbName(){
        return this.dbName;
    }
    public String getuserName(){
        return this.userName;
    }
    public static Singleton getObject(String dbName,String userName){
        if(singleton==null){
            singleton= new Singleton(dbName, userName);
        }
        return singleton;
    }   
}
