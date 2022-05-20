package AdventureGame;

public abstract class GameCharacter {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameCharacter(String name,int damage, int health, int money,int id) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name=name;
        this.id=id;
    }

    //region getSetMethods

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //endregion
}
