
public class CalcAdvance extends CalcBasic {
    public double calculate(double a,double b,char ch){
        double d=switch(ch){
            case '^'->Math.pow(a,b);
            case '%'->(a%b);
            default -> super.calculate(a, b, ch);
        };
        return d;
    }
}
