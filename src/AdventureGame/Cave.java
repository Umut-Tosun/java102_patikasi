package AdventureGame;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Mağara", 3, "Zombiler Seni Oyuna Çağırıyor ? Yoksa Korktun mu ? ", new Zombie(), "Yemek",3);
    }
}
