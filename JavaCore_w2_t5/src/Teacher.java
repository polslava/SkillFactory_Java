public class Teacher extends People{


    /*строковое поле subject (преподаваемый предмет);
    конструктор принимающий имя, возраст, профессию и преподаваемый предмет;
    метод getProfession должен возвращать  строку — профессию;
    метод getAge() должен возвращать целое число — возраст;
    метод getName() должен возвращать строку — имя;
    метод getSubject() должен возвращать строку — преподаваемый предмет;
    метод giveALesson() должен вернуть строку "The lesson was ended".*/
    public String subject;
    public Teacher(String name, int age, String profession, String subject){
        super(name,age,profession); /*не понял про super: зачем он тут*/

        this.name = name;
        this.age = age;
        this.profession = profession;
        this.subject = subject;
    }

    public Teacher(String name, int age, String profession) {
        super(name, age, profession);
    }

    @Override
    public String getProfession() {
        return this.profession;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }
    public String getSubject() {
        return this.subject;
    }

    public String giveALesson(){
        return "The lesson was ended";}
}
