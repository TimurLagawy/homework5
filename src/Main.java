import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /*

        Student student1 = new Student("Петя", "Иванов", 20, 4, true);
        Student student2 = new Student("Мария", "Лепешко", 18, 1, false);
        Student student3 = new Student("Виктор", "Макаревич", 19, 2, true);
        Student student4 = new Student("Оксана", "Петрова", 17, 1, true);
        Head_teacher head_teacher = new Head_teacher("Мария", "Жукова", 40);

        student1.say();
        student2.say();
        student3.say();
        student4.say();
        head_teacher.say();

    }
}

         *//*


        Book book1 = new Book(12, "Oruel1984", 1948);
        Book book2 = new Book(34, "Peace by Peace", 1952);
        Book book3 = new Book(23, "Marvel", 2010);
        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library=new Library(books);
        library.printNameById(12);

        System.out.println(books);
    }}*/
        Customer customer1=new Customer(1,"Gvin","Tim","Jonovich","Minesota", 1234567,3017278);
        Customer customer2=new Customer(2,"Bonn", "Tom", "Georgievch", "Washingthon", 2345667,9865436);
        Customer customer3=new Customer(3,"Edison", "Ann", "Abusovich", "New York", 6574382,7372892);
        Customer customer4=new Customer(4, "Jonson", "David", "Rubinovich", "Israel", 466738,9276345);
        Customer customer5=new Customer(5, "Boris","Boris","Nikolajevich", "Moskow", 9039000,3456789);
        Customer customer6=new Customer(6, "Prokopovich", "Piotr","Piotrovich","Dupa",3029000, 3452678);
        Customer customer7=new Customer(7, "Azaronak", "Grisha", "Fisherovich", "Dupa", 1110000, 3645665);
        Customer customer8=new Customer(8, "Jordan", "Mik", "Davidovich", "Nevada", 7583999,4356362);
        Customer customer9=new Customer(9, "Lukash","Senja", "Lopuhovich", "London",4837283,465738);
        List<Customer> customers=new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);
        Base_of_customers base_of_customers=new Base_of_customers(customers);
        Base_of_customers.printNameById(1);
        System.out.println((customers));
       }}