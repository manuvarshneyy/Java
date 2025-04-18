import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Book[] books=new Book[6];
        books[0]=new Book(10,"abc",4.5);
        books[1]=new Book(11,"acd",3.0);
        books[2]=new Book(22,"zxk",4.8);
        books[3]=new Book(8,"mno",2.6);
        books[4]=new Book(8,"mno",3.9);
        books[5]=new Book(8,"mno",1.0);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        switch (s) {
            case "name":{
                Arrays.sort(books,new NameComparator());
                for(Book i : books){
                    System.out.println(i);
                }
            }break;
            case "rating":{
                Arrays.sort(books,new RatingComparator());
                for(Book i : books){
                    System.out.println(i);
                }
            }break;
            default:
                break;
        }
    }
}
class RatingComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return b1.rating.compareTo(b2.rating);
    }
}
class NameComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return b1.name.compareTo(b2.name);
    }
}
class Book{
    int price;
    String name;
    Double rating;
    Book(int price,String name,Double rating ){
        this.price=price;
        this.name=name;
        this.rating=rating;
    }
    public String toString(){
        return "[ price "+ this.price+" name  "+this.name+" rating "+this.rating+"]"; 
    }
}
