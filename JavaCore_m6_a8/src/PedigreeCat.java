/*не сдано*/
public class PedigreeCat extends Cat{
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;

    public PedigreeCat(String name, int age, String owner, String breed) {
        super(name, age, owner);

        this.breed=getBreed();
    }
    public String toString ()
    {
        return "The cat "+getName()+" is very beautiful, although she is now "+getAge()+", she belongs to the breed "+getBreed()+", and her owner "+getOwner()+" is very proud of her.";
/*тестеру не правится этот метод*/
    }

}
