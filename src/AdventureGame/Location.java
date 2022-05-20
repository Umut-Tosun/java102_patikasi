package AdventureGame;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    private int id;
    private String description;

    public static Scanner input = new Scanner(System.in);

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YEŞİL = "\u001B[32m";

    public Location(Player player,String name,int id,String description) {
        this.player = player;
        this.name = name;
        this.id=id;
        this.description=description;
    }

    //region getSetMethods
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //endregion

   public abstract Boolean onLocation();
}
