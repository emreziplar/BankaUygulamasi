/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

/**
 *
 * @author Emre
 */
public class BasvuruEkraniActions extends Actions {

    BasvuruEkrani basvuruEkrani = null;
    GirisEkrani girisEkrani = null;
    SourceController sourceController = null;
    UyariMesajlari uyariMesajlari = null;

    public BasvuruEkraniActions(BasvuruEkrani basvuruEkrani) {
        setBasvuruEkrani(basvuruEkrani);
    }

    public void setBasvuruEkrani(BasvuruEkrani basvuruEkrani) {
        this.basvuruEkrani = basvuruEkrani;
    }

    public BasvuruEkrani basvuruEkrani() {
        if (basvuruEkrani == null) {
            basvuruEkrani = new BasvuruEkrani();
        }
        return basvuruEkrani;
    }

    public GirisEkrani girisEkrani() {
        if (girisEkrani == null) {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
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
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());
        /*Başvuru Ekranı Geri Iconu*/
        if (sourceController().labelSource(basvuruEkrani().getGeriLabel())) {
            girisEkrani();
            basvuruEkrani().getBasvuruEkraniFrame().setVisible(false);
        }
        /**/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sourceController().setSource(e.getSource());
        /*Basvuru Ekrani Basvur Buttonu*/
        if (sourceController().buttonSource(basvuruEkrani().getBasvurButton())) {

            if (!JTextFieldLimit.isMinLimit(basvuruEkrani().getTelNoText())) {
                uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "Tel No 11 Haneli Olmalı");
            } else {
                uyariMesajlari().uyariMesajiGoster(basvuruEkrani().getBasvuruEkraniFrame(), "BAŞARILI");
            }
        }
        /**/
    }
}
