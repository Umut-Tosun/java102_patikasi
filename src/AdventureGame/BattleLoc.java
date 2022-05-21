package AdventureGame;

import java.util.Random;

public class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    Random random = new Random();

    public BattleLoc(Player player, String name, int id, String description,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name, id, description);
        this.award=award;
        this.obstacle=obstacle;
        this.maxObstacle=maxObstacle;
    }
    //region setGetMethods

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    public Obstacle getObstacle() {
        return obstacle;
    }
    //endregion

    @Override
    public Boolean onLocation() {
            int obsNumber = this.randomObstacleNumber();
            System.out.println(ANSI_KIRMIZI + "Dikkatli Ol! Burası " + this.obstacle.getName() + " Mekanı " + this.obstacle.getName() + " Sayısı : " + obsNumber + ANSI_RESET);
            System.out.println("\n              Kaybetmeden Kazanmayı Ögrenemezsin              \n");
            System.out.println("\n              Düşmanlarının Korkulu Rüyası Ol !              \n");
            System.out.print(ANSI_KIRMIZI + "\n<S>" + ANSI_RESET + "avaş Yada " + ANSI_KIRMIZI + "<K>" + ANSI_RESET + "aç : ");
            String selectBattleCase = Location.input.next().toUpperCase();
            if (selectBattleCase.equals("S") && combat(obsNumber)) {
                if (!this.getAward().equals("")) {
                    System.out.println();
                    System.out.println("Bölgeye Özel Ödülün : " + this.getAward() + " Kazanıldı !");
                } else {
                    int number = randomNumber(1,101);
                    int chosenid;
                    if (number < 15)
                    {
                        number = randomNumber(1,101);
                        chosenid = number < 21 ? 3 : number < 51 ? 2 : number < 101 ? 1 : 0;
                        changeWeapon(chosenid);
                    } else if (number < 30)
                    {
                        number = randomNumber(1,101);
                        chosenid = number < 21 ? 3 : number < 51 ? 2 : number < 101 ? 1 : 0;
                        changeArmor(chosenid);
                    } else if (number < 55)
                    {
                        number = randomNumber(1,101);
                        chosenid = number < 21 ? 10 : number < 51 ? 5 : 1;
                        addMoney(chosenid);
                    } else {
                        System.out.println("Bölgeden Hiçbirşey Kazanamadınız !");
                    }

                }
                Game.territoriesWon.add(this.getName());
                System.out.println("ORTALIK TOZ DUMAN ! Düşmanları Bölgeden Temizledin");
                return true;
            }
            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("Kanlar içinde yerlerde kalıyorsun herşeyin bir sonu var !");
                return false;
            }
            return true;
    }
    public void changeWeapon(int id) {
        Weapon selectedWeapon=Weapon.getWeaponObjById(id);
        this.getPlayer().getInventory().setWeapon(selectedWeapon);
    }
    public void changeArmor(int id) {
        Armor selectedArmor=Armor.getArmorObjById(id);
        this.getPlayer().getInventory().setArmor(selectedArmor);
    }
    public void addMoney(int money)
    {
        this.getPlayer().setMoney(this.getPlayer().getMoney()+money);
    }
    public int randomNumber(int origin,int bound) {
        Random rnd = new Random();
        int number = rnd.nextInt(origin,bound);
        return number;
    }

    public boolean combat(int obsNumber)
    {
        int number;
        for (int i=obsNumber;i>=1;i--) {
            System.out.println(i+" "+this.obstacle.getName()+ " Kaldı !");
            this.obstacle.setHealth(this.obstacle.getDefHealth());
            playerStats();
            obstacleStats();
            while (this.getPlayer().getHealth()>0 && this.obstacle.getHealth()>0) {
                System.out.print(ANSI_KIRMIZI + "\n<V>" + ANSI_RESET + "ur Yada " + ANSI_KIRMIZI + "<K>" + ANSI_RESET + "aç : ");
                String selectCombat = Location.input.next().toUpperCase();
                System.out.println();
                while (!(selectCombat.equals("V")|| selectCombat.equals("K"))) {
                    System.out.print(ANSI_KIRMIZI + "\n<V>" + ANSI_RESET + "ur Yada " + ANSI_KIRMIZI + "<K>" + ANSI_RESET + "aç : ");
                    selectCombat = Location.input.next().toUpperCase();
                    System.out.println();
                 }
                if (selectCombat.equals("V")) {
                    number = randomNumber(0,2);
                    if (number==0) {
                        attack();
                        obstacleAttack();
                    }
                    else
                    {
                        obstacleAttack();
                        attack();
                    }
                }
                else return false;
            }
            if (this.getObstacle().getHealth()<this.getPlayer().getHealth())
            {
                System.out.println(ANSI_YEŞİL+"\nDüşman Avlandı !");
                System.out.println(this.getObstacle().getAward()+" Altın Kazandın !");
                this.getPlayer().setMoney(this.getObstacle().getAward()+this.getPlayer().getMoney());
                System.out.println("\nYeni Paranız : "+this.getPlayer().getMoney()+ANSI_RESET+"\n");
            }
            else return false;
        }
        return true;
    }
    public void attack() {
        System.out.println(ANSI_YEŞİL+"-----------------------------------------------------------");
        System.out.println("Saldırıyorsun ! Artık Geri Adım Atmak Yok !\n");
        this.obstacle.setHealth(this.obstacle.getHealth()-this.getPlayer().gettotalDamage());
        System.out.println(this.getPlayer().gettotalDamage()+" Hasar Verdin");
        afterHit();
        System.out.println(ANSI_RESET);
    }
    public void obstacleAttack() {
        if (this.getObstacle().getHealth()>0) {
            System.out.println();
            System.out.println(ANSI_KIRMIZI+"Hey Düşmanların Canına Kastediyor !\n");
            int obstacleDamage=this.obstacle.getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
            System.out.println(obstacleDamage+" Hasar Aldın !");
            if (obstacleDamage<0)
                obstacleDamage=0;
            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
            afterHit();
            System.out.println("-----------------------------------------------------------"+ANSI_RESET);
        }
    }
    public void obstacleStats()
    {
        System.out.println(ANSI_KIRMIZI+this.getObstacle().getName()+" Değerleri  \n");
        System.out.println("Sağlık : "+this.getObstacle().getHealth());
        System.out.println("Hasar : "+this.getObstacle().getDamage());
        System.out.println("Ödül: "+this.getObstacle().getAward());
        System.out.println("-----------------------------------------------------------");
        System.out.println(ANSI_RESET);
    }
    public void playerStats()
    {
        System.out.println(ANSI_YEŞİL+"-----------------------------------------------------------");
        System.out.println("Değerlerin : "+getPlayer().getName()+"\n");
        System.out.println("Sağlık : "+this.getPlayer().getHealth());
        System.out.println("Sağlık : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Silah : "+this.getPlayer().getWeapon().getName());
        System.out.println("Hasar : "+this.getPlayer().getDamage());
        System.out.println("Bloklama: "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : "+this.getPlayer().getMoney());
        System.out.println(ANSI_RESET);
    }
    public void afterHit()
    {
        System.out.println("Canınız : "+this.getPlayer().getHealth());
        System.out.println(this.obstacle.getName()+" Canı : "+this.obstacle.getHealth());
        System.out.println();
    }
    public int randomObstacleNumber()
    {
        Random r = new Random();
        return r.nextInt(this.maxObstacle)+1;
    }

}
