/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.AyarlarEkrani;
import Gui.GirisEkrani;
import Gui.HavaleEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.OdemelerEkrani;
import Gui.ParaCekmeEkrani;
import Gui.ParaYatirmaEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Emre
 */
public class KullaniciHesapEkraniActions extends Actions {

    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    GirisEkrani girisEkrani = null;
    AyarlarEkrani ayarlarEkrani = null;
    SourceController sourceControl = null;
    UyariMesajlari uyariMesajlari = null;

    public KullaniciHesapEkraniActions(KullaniciHesapEkrani kullaniciHesapEkrani) {
        setKullaniciHesapEkrani(kullaniciHesapEkrani);
    }

    public void setKullaniciHesapEkrani(KullaniciHesapEkrani kullaniciHesapEkrani) {
        this.kullaniciHesapEkrani = kullaniciHesapEkrani;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    public GirisEkrani girisEkrani() {
        if (girisEkrani == null) {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
    }

    public SourceController sourceController() {
        if (sourceControl == null) {
            sourceControl = new SourceController();
        }
        return sourceControl;
    }

    public UyariMesajlari uyariMesajlari() {
        if (uyariMesajlari == null) {
            uyariMesajlari = new UyariMesajlari();
        }
        return uyariMesajlari;
    }

    public AyarlarEkrani ayarlarEkrani() {
        if (ayarlarEkrani == null) {
            ayarlarEkrani = new AyarlarEkrani();
        }
        return ayarlarEkrani;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sourceController().setSource(e.getSource());
        kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false); //sadece buton actionlari oldugu icin sadece buraya yazalim 
        
        /*Para Cek Butonu*/
        if (sourceController().buttonSource(kullaniciHesapEkrani().getParaCekButton())) {
            ParaCekmeEkrani paraCekmeEkrani = new ParaCekmeEkrani();
            paraCekmeEkrani.getParaCekmeEkraniFrame().setVisible(true);
        }
        /**/
        
        /*Para Yatir Butonu*/
        if(sourceController().buttonSource(kullaniciHesapEkrani().getParaYatirButton())) {
            ParaYatirmaEkrani paraYatirmaEkrani = new ParaYatirmaEkrani();
            paraYatirmaEkrani.getParaYatirmaEkraniFrame().setVisible(true);
        }
        /**/
        
        /*Havale Buton*/
        if(sourceController().buttonSource(kullaniciHesapEkrani().getHavaleButton())) {
            HavaleEkrani havaleEkrani = new HavaleEkrani();
            havaleEkrani.getHavaleEkraniFrame().setVisible(true);
        }
        /**/
        
        /*Odemeler Buton*/
        if(sourceController().buttonSource(kullaniciHesapEkrani().getOdemelerButton())) {
            OdemelerEkrani odemelerEkrani = new OdemelerEkrani();
            odemelerEkrani.getOdemelerEkraniFrame().setVisible(true);
        }
        /**/
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        sourceController().setSource(e.getSource());
        iconlariKontrolEt("");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        sourceController().setSource(e.getSource());
        iconlariKontrolEt("2");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());

        if (labelSourceControl(kullaniciHesapEkrani().getCikisIcon())) {
            if (uyariMesajlari().onayMesajiGoster(kullaniciHesapEkrani().getKullaniciHesapEkraniFrame(), "Hesabınızdan çıkış yapmak istiyor musunuz?", "UYARI") == 1) {
                kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
                girisEkrani();
            }
        }
        if (labelSourceControl(kullaniciHesapEkrani().getAyarlarIcon())) {
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(false);
            ayarlarEkrani();
        }
    }

    public boolean buttonSourceControl(JButton button) {
        return sourceController().buttonSource(button);
    }

    public boolean labelSourceControl(JLabel label) {
        return sourceController().labelSource(label);
    }

    public void iconlariKontrolEt(String iconNumber) { //iconNumber ayarlamasi yapilarak olusturulmus methoddur
        if (buttonSourceControl(kullaniciHesapEkrani().getParaCekButton())) {
            kullaniciHesapEkrani().getParaCekIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraCekIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getParaYatirButton())) {
            kullaniciHesapEkrani().getParaYatirIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/paraYatirIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getHavaleButton())) {
            kullaniciHesapEkrani().getHavaleIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/havaleIcon" + iconNumber + ".png")));
        }

        if (buttonSourceControl(kullaniciHesapEkrani().getOdemelerButton())) {
            kullaniciHesapEkrani().getOdemelerIcon().setIcon(new ImageIcon(getClass().getResource("/Gui/Image/odemelerIcon" + iconNumber + ".png")));
        }
    }
}
