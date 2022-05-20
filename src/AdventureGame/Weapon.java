package AdventureGame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Weapon {
    private int id;
    private int damage;
    private int price;
    private String name;

    private static final AtomicInteger atomicInteger = new AtomicInteger(-1);
    private static final List<Weapon> weaponList = new ArrayList<>();

    public Weapon(int damage, int price, String name) {
        this.id = atomicInteger.incrementAndGet();
        weaponList.add(this);
        this.damage = damage;
        this.price = price;
        this.name = name;


        // oluşturulan tüm weapon objeleri direkt weaponList içine eklenir.
        // private olduğu için dışardan ekleme mümkün değil
        // id 1'den başlayarak artan sırada gidiyor ve her eklenen
        // objenin list içinde sahip olacağı index, id ile aynı olacak
        // list.get(id) direkt doğru weapon objesini verecek
    }

    static {
        new Weapon(3,25,"Tabanca");
        new Weapon(2,20,"Kılıç");
        new Weapon(7,45,"Tüfek");
        // bunlar direkt listeye eklendi ve id için elle müdahale gerekmiyor
    }

    public static List<Weapon> weapons() {
        return weaponList;
    }

    public static Weapon getWeaponObjById(int id) {
        // list.get methodu uygun objeyi bulamazsa null dönderir
        return weaponList.get(id);
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
}
