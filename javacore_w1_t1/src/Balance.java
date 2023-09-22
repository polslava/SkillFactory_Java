public class Balance {
    int vesR = 0;
    int vesL =0;
    char ves = ' ';
    public  void addRight(int n)
    {
        this.vesR =this.vesR+ n;
        System.out.println("vesR: "+this.vesR);
    }
    public  void addLeft(int n)
    {
        this.vesL =this.vesL+ n;
        System.out.println("vesL: "+this.vesR);
    }


    public  char getSituation() {

        if (this.vesL>this.vesR)
        {this.ves='L';
        }
        else if (this.vesL<this.vesR)
        {this.ves='R';
        }
        else if (this.vesL==this.vesR)
        {this.ves='=';
        }
        System.out.println("ves: "+this.ves);
        return this.ves;
    }
}
