import java.util.List;

public class Library {
    private List<Book> books;

    public void setBooks(List<Book> books) {
    this.books=books;
    }
    public  Library(List<Book> books){
        this.books=books;
    }
    public void printNameById(int id){
        for (int i = 0; i < books.size(); i++) {
            if (id==books.get(i).getId()){
                System.out.println(books.get(i));
            }
        }
    }
}