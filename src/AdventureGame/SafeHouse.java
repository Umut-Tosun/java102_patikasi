package AdventureGame;

import java.util.Arrays;

public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev",1,"Savaştan yorulduysan Aradığın Yer Burası");
    }
    @Override
    public Boolean onLocation() {
        System.out.println("\nGüvenli Evdesin ! Canın Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        if (Game.territoriesWon.contains("Mağara")&&Game.territoriesWon.contains("Maden")&&Game.territoriesWon.contains("Nehir")&&Game.territoriesWon.contains("Orman"))
        {
            System.out.println();
            System.out.println(ANSI_CYAN+this.getPlayer().getName()+ANSI_YEŞİL+" Tebrikler ! Oyunu Başarıyla Tamamladın");
            System.out.println();
            System.out.println(ANSI_KIRMIZI+"Zanka'da "+ANSI_YEŞİL+" Tüm Bölgelerdeki Düşmanları Temizledin ! "+ANSI_RESET);
            System.out.println();
            System.out.println(ANSI_CYAN+"Kanlar içinde kalan düşmanların arasından yorgun bir şekilde geçiyorsun ! Yeni Bir Macerada Görüşmek Üzere");
            System.exit(0);
        }
        return true;
    }
}
