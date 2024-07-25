public class Commi extends Entity implements Seller {


    public Commi(String name, int force, int hp, int agility, int exp, int gold) {
        super(name, force, hp, agility, exp, gold);
    }

    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }
    //Энам для товаров
    public enum Goods {
        POTION
    }

}