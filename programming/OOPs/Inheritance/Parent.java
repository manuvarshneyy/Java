class Parent{
    static int a=10;
    int b=20;
    static{
        System.out.println("parent static block");
    }
    {
        System.out.println("parent non-static block");
    }
    Parent(){
        System.out.println("parent constructor");
    }
    public static void m1(){
        System.out.println("parent static method");
    }
    public void m2(){
        System.out.println("parent non-static method");
    }
}