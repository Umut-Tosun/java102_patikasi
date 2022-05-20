package AdventureGame;

import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private int defHealth;

    private Inventory inventory;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Player(String name)
    {
        this.name=name;
        this.inventory=new Inventory();
    }
    public void printInfo()
    {
        System.out.println("\nSilah : "+this.getInventory().getWeapon().getName()+"\t Zırh : "+this.getInventory().getArmor().getName()+"\t Engelleme : "+this.getInventory().getArmor().getBlock()
                +"\t Hasar : "+this.gettotalDamage()+"\t Sağlık : "+this.getHealth()+" Para : "+this.money);
    }

    //region getSetMethods
    public int gettotalDamage()
    {
        return damage+this.inventory.getWeapon().getDamage();
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public Weapon getWeapon()
    {
        return this.inventory.getWeapon();
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }
    //endregion

    public  void selectChar() {
        GameCharacter[] gameCharacters={new Samurai(),new Archer(),new Knight()};

        System.out.println(ANSI_CYAN+"\n------------------Karakter Listesi---------------------------------------------");
        for (GameCharacter gc:gameCharacters) {
            System.out.println("\n"+"Karakter No : "+gc.getId()+"\t Karakter Adı : "+gc.getName()+"\t Hasar : "+gc.getDamage()+"\t Sağlık : "
                    +gc.getHealth()+"\t Para : "+gc.getMoney());
        }
        System.out.println("\n-------------------------------------------------------------------------------"+ANSI_RESET);

        System.out.print("\nKarakter Seçiminiz [ID] : ");
        int selectChar=input.nextInt();

        switch (selectChar)
        {
            case 1: initPlayer(new Samurai()); break;
            case 2: initPlayer(new Archer()); break;
            case 3: initPlayer(new Knight()); break;
            default:
                initPlayer(new Samurai()); break;
        }

    }
    public void  initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getName());
        this.setDefHealth(gameCharacter.getHealth());
    }

}
