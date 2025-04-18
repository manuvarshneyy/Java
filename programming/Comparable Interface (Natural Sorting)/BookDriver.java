import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Book[] books=new Book[6];
        books[0]=new Book(10,"abc",4.5);
        books[1]=new Book(11,"acd",3.0);
        books[2]=new Book(22,"zxk",4.8);
        books[3]=new Book(8,"mno",2.6);
        books[4]=new Book(8,"mno",3.9);
        books[5]=new Book(8,"mno",1.0);
        for(Book i: books){
            System.out.println(i);
        }
        System.out.println("====================================");
        Arrays.sort(books);
        for(Book i: books){
            System.out.println(i);
        }
    }
}
