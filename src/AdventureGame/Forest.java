package AdventureGame;

public class Forest extends BattleLoc{
    public Forest(Player player) {
        super(player, "Orman", 4, "Ormanların Kralını Merak Mı Ediyorsun ? Kral Burada !",new Vampire() , "Odun",2);
    }
}
