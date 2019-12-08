/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.HavaleEkrani;
import Gui.KullaniciHesapEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Emre
 */
public class HavaleEkraniActions extends Actions {

    HavaleEkrani havaleEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SourceController sourceController = null;
    UyariMesajlari uyariMesajlari = null;

    public HavaleEkraniActions(HavaleEkrani havaleEkrani) {
        setHavaleEkrani(havaleEkrani);
    }

    public void setHavaleEkrani(HavaleEkrani havaleEkrani) {
        this.havaleEkrani = havaleEkrani;
    }

    public HavaleEkrani havaleEkrani() {
        if (havaleEkrani == null) {
            havaleEkrani = new HavaleEkrani();
        }
        return havaleEkrani;
    }

    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if (kullaniciHesapEkrani == null) {
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        }
        return kullaniciHesapEkrani;
    }

    public SourceController sourceController() {
        if (sourceController == null) {
            sourceController = new SourceController();
        }
        return sourceController;
    }

    public UyariMesajlari uyariMesajlari() {
        if (uyariMesajlari == null) {
            uyariMesajlari = new UyariMesajlari();
        }
        return uyariMesajlari;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sourceController().setSource(e.getSource());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());
        
        if (sourceController().labelSource(havaleEkrani().getGeriLabel())) {
            havaleEkrani().getHavaleEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
    }
}
