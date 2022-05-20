package AdventureGame;

public abstract class NormalLocation extends Location {

    public NormalLocation(Player player,String name,int id,String description) {
        super(player,name,id,description);
    }

    @Override
   public Boolean onLocation() {
        return true;
    }
}
