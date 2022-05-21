package AdventureGame;

public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player,"Savaş Mağazası",2,"Silahların ve Zırhların Mekanına Hoşgeldin !");
    }
    @Override
    public Boolean onLocation() {
        System.out.println(Location.ANSI_CYAN+"\n------------------------------Mağazaya Hoşgeldin ! "+Location.ANSI_KIRMIZI+getPlayer().getName()+ANSI_CYAN+" -----------------");
        System.out.println("\n1-) Silahlar  --> Düşmanlarına Gücün Yetmiyor mu ? Dert Etme Biz Varız !");
        System.out.println("2-) Zırhlar --> Gücüne Güç Katmaya Geldik !");
        System.out.println("3-> Çıkış Yap ");
        System.out.println("\n--------------------------------------------------------------------------\n"+Location.ANSI_RESET);

        System.out.print("Seçiminiz : ");
        int selectCase=Location.input.nextInt();

        while (selectCase<1 || selectCase>3)
        {
            System.out.print("Seçiminiz : ");
            selectCase=Location.input.nextInt();
        }
        switch (selectCase)
        {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                System.out.println("Bir Daha Bekleriz");
                return true;
        }
        return true;
    }
    public void printWeapon()
    {
        System.out.println("Mevcut Bakiye : "+this.getPlayer().getMoney());
        System.out.println("\n------------------ Silahlar -----------------------------\n");
        for (Weapon w:Weapon.weapons()) {
            if (w.getDamage()>0)
            System.out.println("Silah No : "+w.getId()+"\t Tür : "+w.getName()+"\t Hasar : "+w.getDamage()+"\t Fiyat : "+w.getPrice());
        }
        System.out.println("Çıkış : "+(Weapon.weapons().size()-1));
        System.out.println("\n---------------------------------------------------------\n");
    }
    public void buyWeapon()
    {
        System.out.print("\nSeçiminiz : ");
        int selectGun=Location.input.nextInt();
        while (selectGun<0 || selectGun>Weapon.weapons().size()+1)
        {
            System.out.print("Seçiminiz : ");
            selectGun=Location.input.nextInt();
        }

        Weapon selectedWeapon=Weapon.getWeaponObjById(selectGun);
        if(this.getPlayer().getInventory().getWeapon().getName().equals(selectedWeapon.getName())) {
            System.out.println("\nBu Silah Zaten Envanterinde Takılı !\n");
        }
        else {
            if (selectedWeapon != null && selectGun != 4) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz Bakiye !");
                } else {
                    System.out.println(selectedWeapon.getName() + " İtemi Envanterine Eklendi.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());

                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }
    }
    public void printArmor()
    {
        System.out.println("Mevcut Bakiye : "+this.getPlayer().getMoney());
        System.out.println("\n------------------ Zırhlar -----------------------------\n");
        for (Armor a:Armor.armors()) {
            if (a.getBlock()>0)
            System.out.println("Zırh No : "+a.getId()+"\t Tür : "+a.getName()+"\t Engelleme : "+a.getBlock()+"\t Fiyat : "+a.getPrice());
        }
        System.out.println("Çıkış : "+(Armor.armors().size()-1));
        System.out.println("\n---------------------------------------------------------\n");
    }
    public void buyArmor()
    {
        System.out.print("\nSeçiminiz : ");
        int selectArmor=Location.input.nextInt();
        while (selectArmor<0 || selectArmor>Armor.armors().size()+1)
        {
            System.out.print("Seçiminiz : ");
            selectArmor=Location.input.nextInt();
        }
        Armor selectedArmor=Armor.getArmorObjById(selectArmor);
        if(this.getPlayer().getInventory().getArmor().getName().equals(selectedArmor.getName())) {
            System.out.println("\nBu Zırh Zaten Sizde Takılı !\n");
        }
        else {
            if (selectedArmor != null && selectArmor != 4) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yetersiz Bakiye !");
                } else {
                    System.out.println(selectedArmor.getName() + " İtemi Envanterine Eklendi.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }
}
