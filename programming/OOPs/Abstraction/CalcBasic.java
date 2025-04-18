public class CalcBasic extends Calc{
    public double calculate(double a,double b,char ch){
        double d=switch(ch){
            case '+'-> (a+b);
            case '-'-> (a-b);
            case '*'-> (a*b);
            case '/'-> (a/b);
            default-> -1;
        };
        return d;
    }
    
}
