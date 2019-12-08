/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.KullaniciHesapEkrani;
import Gui.ParaCekmeEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Emre
 */
public class ParaCekmeEkraniActions extends Actions {

    ParaCekmeEkrani paraCekmeEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SourceController sourceController = null;
    UyariMesajlari uyariMesajlari = null;

    public ParaCekmeEkraniActions(ParaCekmeEkrani paraCekmeEkrani) {
        setParaCekmeEkrani(paraCekmeEkrani);
    }

    public void setParaCekmeEkrani(ParaCekmeEkrani paraCekmeEkrani) {
        this.paraCekmeEkrani = paraCekmeEkrani;
    }

    public ParaCekmeEkrani paraCekmeEkrani() {
        if (paraCekmeEkrani == null) {
            paraCekmeEkrani = new ParaCekmeEkrani();
        }
        return paraCekmeEkrani;
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

        if (sourceController().buttonSource(paraCekmeEkrani().getParaCekButton())) {

            if (!paraCekmeEkrani().getParaCekmeTutariText().getText().equals("")) {

            } else {
                uyariMesajlari().uyariMesajiGoster(paraCekmeEkrani().getParaCekmeEkraniFrame(), "Bir Tutar Girmelisiniz!");
            }

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());

        if (sourceController().labelSource(paraCekmeEkrani().getGeriLabel())) {
            paraCekmeEkrani().getParaCekmeEkraniFrame().setVisible(false);
            kullaniciHesapEkrani().getKullaniciHesapEkraniFrame().setVisible(true);
        }
    }

}
