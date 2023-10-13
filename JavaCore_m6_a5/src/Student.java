public class Student extends Person{
    String name;
    int age;
    int grade;

    /*public Student(String name, int age, int grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    } почему-то этот конструктор тестеру не нравится*/
public Student (String name, int age){
        super(name, age);
}

    public void giveGrade(){}

    public void praise() {

    }
}

