public class Head_teacher {
    String name;
    String family;
    int age;


    Head_teacher(){    }
    Head_teacher(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
    void say() {
        System.out.println("Привет, я  завуч, " + this.name + " " + this.family + " . Мне " + this.age + " лет.  " );
    }
}


