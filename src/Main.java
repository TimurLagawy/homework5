import java.util.ArrayList;
import java.util.List;

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

         */
        Book book1 = new Book(12, "Oruel1984", 1948);
        Book book2 = new Book(34, "Peace by Peace", 1952);
        Book book3 = new Book(23, "Marvel", 2010);
        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library=new Library(books);
        library.printNameById(12);

        System.out.println();
    }}