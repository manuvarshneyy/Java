class Arithmetic{
    public static void main( String[] args){
        int a = 123;
        int n=a,rev=0;
        for(int i=0;i<3;i++){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        System.out.println("reverse="+rev);
    }
}
// class X{
//     public static void main( String[] args){
//         int a=123;
//         System.out.print(a%10);
//         a=a/10;
//         System.out.print(a%10);
//         a=a/10;
//         System.out.print(a%10);
//     }
// }