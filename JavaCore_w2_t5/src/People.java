public abstract class People {
    /*строковое поле name;
целочисленное поле age;
строковое поле profession;
конструктор, принимающий переменную String name, int age, String profession;
абстрактный метод getProfession(), возвращающий строку — профессию человека;
абстрактный метод getAge(), возвращающий целое число — возраст человека;
абстрактный метод getName(), возвращающий строку — имя человека.
     */
    public String name;
    public int age;
    public String profession;
    public People (String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }




    public abstract String getProfession();
    public abstract int getAge();
    public abstract String getName();
}
