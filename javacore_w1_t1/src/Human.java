public class Human {
    public String name;
    public int age;
    public int weight ;
    public String address;
    public String work ;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 70;
        this.address = null;
        this.work = null;
    }
    public Human (String name, String address) {
        this.name = name;
        this.age = 40;
        this.weight = 70;
        this.address = address;
        this.work = null;}
    public Human (String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.work = null;}

    public Human (String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 70;
        this.address = null;
        this.work = work;}
    public Human (int age, int weight, String address, String work) {
        this.name = "Name";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;}
}
