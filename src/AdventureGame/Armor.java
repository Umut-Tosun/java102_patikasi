package AdventureGame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Armor {
    private  int id;
    private String name;
    private int block;
    private int price;

    private static final AtomicInteger atomicInteger = new AtomicInteger(-1);
    private static final List<Armor> armorList = new ArrayList<>();

    public Armor(String name, int block, int price) {
        this.id = atomicInteger.incrementAndGet();
        this.name = name;
        this.block = block;
        this.price = price;
        armorList.add(this);
    }
    static {
        new Armor("Hafif Zırh",1,15);
        new Armor("Orta Zırh",3,25);
        new Armor("Ağır Zırh",5,40);
        // bunlar direkt listeye eklendi ve id için elle müdahale gerekmiyor
    }

    //region getSetMethods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    //endregion

    public static List<Armor> armors() {
        return armorList;
    }

    public static Armor getArmorObjById(int id) {
        // list.get methodu uygun objeyi bulamazsa null dönderir
        return armorList.get(id);
    }

}
