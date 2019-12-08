/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.AyarlarEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.SifreYenilemeEkrani;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Emre
 */
public class AyarlarEkraniActions extends Actions {

    AyarlarEkrani ayarlarEkrani = null;
    SourceController sourceController = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    UyariMesajlari uyariMesajlari = null;

    public AyarlarEkraniActions(AyarlarEkrani ayarlarEkrani) {
        setAyarlarEkrani(ayarlarEkrani);
    }

    public void setAyarlarEkrani(AyarlarEkrani ayarlarEkrani) {
        this.ayarlarEkrani = ayarlarEkrani;
    }

    public AyarlarEkrani ayarlarEkrani() {
        if (ayarlarEkrani == null) {
            ayarlarEkrani = new AyarlarEkrani();
        }
        return ayarlarEkrani;
    }

    public SourceController sourceController() {
        if (sourceController == null) {
            sourceController = new SourceController();
        }
        return sourceController;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    public UyariMesajlari uyariMesajlari() {
        if (uyariMesajlari == null) {
            uyariMesajlari = new UyariMesajlari();
        }
        return uyariMesajlari;
    }

    boolean onaylaIcon = false; //telNoIcon'una tiklanip tiklanmadigini kontrol etmek icin

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());

        /*Geri Iconu*/
        if (sourceController().labelSource(ayarlarEkrani().getGeriLabel())) {
            ayarlarEkrani().getAyarlarEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
        /**/

 /*Tel No Degistirme Iconu*/
        if (sourceController().labelSource(ayarlarEkrani().getTelNoDegistirIcon())) {
            if (!onaylaIcon) { //yani icon'a tiklanmamissa
                ayarlarEkrani().getTelNoText().setEditable(true);
                ayarlarEkrani().getTelNoDegistirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/onaylaIcon.png")));
                this.onaylaIcon = true;
            } else {
                if (!telNoTextIsEmpty() && JTextFieldLimit.isMinLimit(ayarlarEkrani().getTelNoText())) { //eger telNoText bos degilse ve minLimit true ise
                    uyariMesajlari().uyariMesajiGoster(ayarlarEkrani().getAyarlarEkraniFrame(),
                            "Telefon numaranız " + ayarlarEkrani().getTelNoText().getText() + " olarak değiştirilmiştir.");
                    ayarlarEkrani().getTelNoText().setEditable(false);
                    ayarlarEkrani().getTelNoDegistirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/degistirIcon.png")));
                    this.onaylaIcon = false;
                } else {
                    uyariMesajlari().uyariMesajiGoster(ayarlarEkrani().getAyarlarEkraniFrame(), "Geçerli bir telefon numaralı girmelisiniz!");
                }
            }
        }
        /**/

 /*Sifre Degistirme Iconu*/
        if (sourceController().labelSource(ayarlarEkrani().getSifreDegistirIcon())) {
            ayarlarEkrani().getAyarlarEkraniFrame().setVisible(false);
            SifreYenilemeEkrani sifreYenileme = new SifreYenilemeEkrani();
        }
        /**/
    }

    public boolean telNoTextIsEmpty() {
        return ayarlarEkrani().getTelNoText().getText().equals(""); //bos ise true donecek
    }

}
