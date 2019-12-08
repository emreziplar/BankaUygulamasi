/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.KullaniciHesapEkrani;
import Gui.ParaYatirmaEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Emre
 */
public class ParaYatirmaEkraniActions extends Actions {

    ParaYatirmaEkrani paraYatirmaEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SourceController sourceController = null;
    UyariMesajlari uyariMesajlari = null;

    public ParaYatirmaEkraniActions(ParaYatirmaEkrani paraYatirmaEkrani) {
        setParaYatirmaEkrani(paraYatirmaEkrani);
    }

    public void setParaYatirmaEkrani(ParaYatirmaEkrani paraYatirmaEkrani) {
        this.paraYatirmaEkrani = paraYatirmaEkrani;
    }

    public ParaYatirmaEkrani paraYatirmaEkrani() {
        if (paraYatirmaEkrani == null) {
            paraYatirmaEkrani = new ParaYatirmaEkrani();
        }
        return paraYatirmaEkrani;
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
        
        if (sourceController().labelSource(paraYatirmaEkrani().getGeriLabel())) {
            paraYatirmaEkrani().getParaYatirmaEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
    }

}
