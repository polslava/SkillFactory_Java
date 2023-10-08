public class Programmer {
    String name;
    String company;
    String position =  "intern";
    public Programmer (String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }
    public void work ()
    {
        String pos1 = this.position;
        switch (pos1)
        {
            case "intern":
                pos1 = "junior";
                break;
            case "junior":
                pos1 = "middle";
                break;
            case "middle":
                pos1 = "senior";
                break;
            case "senior":
                pos1 = "lead";
                break;
            case "lead":
                pos1 = "lead";
                break;
        }
        this.position = pos1;

    }

}
