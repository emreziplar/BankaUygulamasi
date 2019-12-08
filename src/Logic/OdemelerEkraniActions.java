/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.KullaniciHesapEkrani;
import Gui.OdemelerEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Emre
 */
public class OdemelerEkraniActions extends Actions {

    OdemelerEkrani odemelerEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SourceController sourceController = null;
    UyariMesajlari uyariMesajlari = null;

    public OdemelerEkraniActions(OdemelerEkrani odemelerEkrani) {
        setOdemelerEkrani(odemelerEkrani);
    }

    public void setOdemelerEkrani(OdemelerEkrani odemelerEkrani) {
        this.odemelerEkrani = odemelerEkrani;
    }

    public OdemelerEkrani OdemelerEkrani() {
        if (odemelerEkrani == null) {
            odemelerEkrani = new OdemelerEkrani();
        }
        return odemelerEkrani;
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

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}
