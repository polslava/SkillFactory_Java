class Battle {
    int countZombie=0;
    //String[] ZombieName = new String[5];
    Monster[] ZombieName = new Monster[5];


    //TODO

    public void add(Monster monster){
        if (countZombie<5)
        {
            //Zombie zombie=new Zombie();
            // System.out.println("Monster "+monster.name+" the Zombie was created");
            //ZombieName[countZombie]= monster.name;
            ZombieName[countZombie]=monster;
                    countZombie++;
        }else
        {
            System.out.println("No more monsters!");
        }
    }

    void start(){
        run();
    }
    void run(){
        attack();
    }
    void attack(){
for (int i=0;i< countZombie;i++)
{
    //Monster monster=new Monster(ZombieName[i], 5);
    //monster.attack();
    ZombieName[i].attack(ZombieName[i]);
}
    }

}
/*не используется в тестере этот класс*/