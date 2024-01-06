package method.Encapsulation;

import method.exer3.Student;

import java.util.Scanner;


public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要存储的个数：");
        int n = scanner.nextInt();
        int id ,price;
        String name;
        String author;
        String publisher;
        Book[] books = new Book[20];
        for (int i = 0; i < n; i++){
            books[i] = new Book();
            System.out.println("请依次输入“书名”、“作者名”、“出版社”、“价格”");
            id = scanner.nextInt();
            name = scanner.next();
            author = scanner.next();
            publisher = scanner.next();
            price = scanner.nextInt();
            books[i].set(id,name,author,publisher,price);
        }
//        System.out.println(books[0].toString());
        for (int j = 0; j < n; j++){
            if(books[j].getID() == 10){
                books[j].get();
            }
        }

    }


}
