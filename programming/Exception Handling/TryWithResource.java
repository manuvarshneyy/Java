import java.util.Scanner;

class TryWithResource{
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            int num=sc.nextInt();
            System.out.println(num);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}