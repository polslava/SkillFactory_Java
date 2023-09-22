public class Dog {
    private String name;
    private int age;
public Dog (String name, int age)
{
    setName(name);
    setAge(age);
}
public String bark()
{
    return "woof";
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
