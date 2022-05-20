package AdventureGame;

public class Weapon {
    private int id;
    private int damage;
    private int price;
    private String name;

    public Weapon(int id, int damage, int price, String name) {
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.name = name;
    }
    //region getSetMethods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
    public static Weapon[] weapons()
    {
        Weapon[] weapons = {new Weapon(1,3,25,"Tabanca"),new Weapon(2,2,20,"Kılıç"),
                new Weapon(3,7,45,"Tüfek")};
        return weapons;
    }
    public static Weapon getWeaponObjById(int id)
    {
        for (Weapon w:Weapon.weapons())
        {
            if (w.getId()==id)
            {
                return w;
            }
        }
        return null;
    }
}
