import java.util.Arrays;

public class PlCdriver {
    public static void main(String[] args) {
        Phone[] p=new Phone[7];
        p[0]=new Phone(50,"OPPO",4.5);
        p[1]=new Phone(400,"Sansung",3.8);
        p[2]=new Phone(250,"Apple",4.6);
        p[3]=new Phone(50,"Micromax",4.0);
        p[4]=new Phone(50,"Lava",1.1);
        p[5]=new Phone(50,"Vivo",1.1);
        p[6]=new Phone(50,"Mi",1.1);
        for(Object i: p){
            System.out.println(i);
        }
        System.out.println("==================");
        Arrays.sort(p);
        for(Object i: p){
            System.out.println(i);
        }
    }

}