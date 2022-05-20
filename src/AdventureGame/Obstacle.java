package AdventureGame;

public class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int award;
    private int defHealth;

    public Obstacle(int id,String name,int damage, int health,int award) {
        this.id = id;
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.award=award;
        this.defHealth=health;
    }
    //region getSetMethods

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }

    public int getId() {return id;}


    public void setId(int id) {
        this.id = id;
    }

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
        if (health<0)health=0;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }
    //endregion
}
