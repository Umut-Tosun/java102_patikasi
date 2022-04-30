package ObjectOrientedProgramming.Polymorphism;

public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }
    @Override
    public String talk()
    {
        return (this.getName()+" Kişniyor...");
    }
}
