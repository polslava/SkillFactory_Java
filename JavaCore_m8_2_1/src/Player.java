import java.util.ArrayList;

public class Player extends Human {

    //public String[] bag ={"","",""};
    public ArrayList<String> bag = new ArrayList<>(); /*такой тип массива для динамического массива с целью добавления элемента массива в цикле*/
    public Player(String name) {
        super(name);
        backpack=new Backpack(); /*обязательно добавить для "добавьте ему рюкзак, объект класса Backpack", подсмотрел в ответах*/
    }
    public Backpack backpack; /*требуемый параметр класса Player*/
    class Backpack { /*тот самый класс рюкзака*/
         //public ArrayList<String> bag = new ArrayList<String>();
        public String toString() /*подмена вывода println, так как println получает в параметр строку из функции toString, подсмотрел в ответах про toSring*/
        {
            if (bag.size()<1)
            {
                return "the backpack is empty";
            } else {
                String bag_items="";
                for (int i=0;i< bag.size();i=i+1)
                {
                    bag_items=bag_items+bag.get(i);
                    if (i<bag.size()-1){
                        bag_items=bag_items+",";
                    }
                }
                return bag_items+" in the backpack";
            }
        }


    }
    public void take (String text)
    {
        int n = 0;
        if (bag.size() > 0)
        {n=bag.size();
        }

        bag.add(text);

    }
       // @Override
        /*public void println(String text1){
            if (bag.size()<1)
            {
                System.out.println("the backpack is empty");
            } else {
                String bag_items="";
                for (int i=0;i< bag.size();i=i+1)
                {
                   bag_items=bag.get(i);
                   if (i<bag.size()-1){
                       bag_items=bag_items+",";
                   }
                }
                System.out.println(bag_items+" in the backpack");
            }*/

    }
