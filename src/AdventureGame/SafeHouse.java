package AdventureGame;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev",1,"Savaştan yorulduysan Aradığın Yer Burası");
    }
    @Override
    public Boolean onLocation() {
        System.out.println("\nGüvenli Evdesin ! Canın Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        return true;
    }
}
