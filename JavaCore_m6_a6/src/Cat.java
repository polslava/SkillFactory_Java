public class Cat {
    String name;
    int age;
    String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
         }
 public String toString(){
     return "The cat "+name+" is already "+age+". Her master "+owner+" takes care of her.";

 }
}
