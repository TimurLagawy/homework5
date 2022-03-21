import java.util.List;

public class Student {
    String name;
    String family;
    int age;
    int course;
    boolean do_homework;

    Student(){    }
   Student(String name, String family, int age, int course, boolean do_homework) {
       this.name = name;
       this.family = family;
       this.age = age;
       this.course = course;
       this.do_homework=do_homework;

   }
    void say() {
        System.out.println("Привет, я  " + this.name + " " + this.family + " . Мне " + this.age + " лет.  " +this.do_homework);
    }
}

