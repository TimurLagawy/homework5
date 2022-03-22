public class Book {
    private int id;
    private String name;
    private int year;
    Book(){   }

    public Book (int id, String name, int year) {
    this.id = id;
    this.name = name;
    this.year = year;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getYear(int year) {
        this.year = year;
    }

    public int setYear() {
        return year;
    }
    @Override
    public String toString(){
        return "Book{" +
                "id=" +id +
                ", name='" +name+'\''+
                ",year="+year+
                '}';
    }
}

