
public class Mage {
    String name ;
    int level ;
    int damage ;
    String  type; //(fire, ice, earth);

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }
    public String getInfo()
    {
        return (this.name+", "+this.level+", "+this.damage+", "+this.type);
    }
    public String fight(Mage mage)
    {
        String winner = "";
        if (this.type.equals(mage.type)) {
            if (this.level == mage.level) {
                if (this.damage > mage.damage) {
                    winner = this.name;
                } else if (this.damage < mage.damage) {
                    winner = mage.name;
                } else {
                    winner = "draw";
                }
            } else if (this.level > mage.level){
                winner = this.name;
        } else {winner = mage.name;}

        }
        switch (mage.type){
            case "fire":
                switch (this.type) {
                    case "ice":
                        winner = mage.name;
                        break;
                    case "earth":
                        winner = this.name;
                        break;
                }

              break;
            case "ice":
                switch (this.type) {
                    case "earth":
                        winner = mage.name;
                    break;
                    case "fire":
                        winner = this.name;
                    break;
                }

                break;
            case "earth":
                switch (this.type) {
                    case "fire":
                        winner = mage.name;
                    break;
                    case "ice":
                        winner = this.name;
                    break;
                }

                break;
        }

        return winner ;
    }
}
