public class Main {
    public static void main(String args[]) {
        Student student1 = new Student(Петя, Иванов, 21, 4, true);
        Student student2 = new Student(Мария, Лепешко, 18, 1, false);
        Student student3 = new Student(Виктор, Макаревич, 19, 2, true);
        Student student4 = new Student(Оксана, Петрова, 17, 1, true);
        Head_teacher head_teacher = new Head_teacher(Мария, Жукова, 42);

        student1.say();
        student2.say();
        student3.say();
        student4.say();
        head_teacher.say();

    }
}