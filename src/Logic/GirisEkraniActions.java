package Logic;

import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.SifreYenilemeEkrani;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;

public final class GirisEkraniActions extends Actions {

    GirisEkrani girisEkrani = null;
    BasvuruEkrani basvuruEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    SourceController sourceController = null;

    /*Giriş Ekranı*/
    public GirisEkraniActions(GirisEkrani girisEkrani) {
        setGirisEkrani(girisEkrani);
    }

    public void setGirisEkrani(GirisEkrani girisEkrani) {
        this.girisEkrani = girisEkrani;
    }

    public GirisEkrani girisEkrani() {
        if (girisEkrani == null) {
            girisEkrani = new GirisEkrani();
        }
        return girisEkrani;
    }

    /**/
    public BasvuruEkrani basvuruEkrani() {
        if (basvuruEkrani == null) {
            basvuruEkrani = new BasvuruEkrani();
        }
        return basvuruEkrani;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        sourceController().setSource(e.getSource());

        /*Giriş Ekranı Giriş Button*/
        if (sourceController().buttonSource(girisEkrani().getGirisButton())) { //giriş butonuna tıklanmışsa
            kullaniciHesapEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/

 /*Giriş Ekranı Başvur Button*/
        if (sourceController().buttonSource(girisEkrani().getBasvuruButton())) {
            basvuruEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/
    }

    @Override
    public void focusGained(FocusEvent e) {
        sourceController().setSource(e.getSource());

        /*Giriş Ekranı Müşteri No Text*/
        if (sourceController().textSource(girisEkrani().getMusteriNo_TcNoText())) {
            if (girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("T.C. No / Müşteri No")) {
                girisEkrani().getMusteriNo_TcNoText().setText("");
            } else {
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.gray);
            }
        }
        /**/

 /*Giriş Ekranı Şifre Text*/
        if (sourceController().textSource(girisEkrani().getSifreText())) {
            if (girisEkrani().getSifreText().getText().trim().equals("**********")) {
                girisEkrani().getSifreText().setText("");
            } else {
                girisEkrani().getSifreText().setForeground(Color.gray);
            }
        }
        /**/
    }

    @Override
    public void focusLost(FocusEvent e) {
        sourceController().setSource(e.getSource());

        /*Giriş Ekranı Müşteri No Text*/
        if (sourceController().textSource(girisEkrani().getMusteriNo_TcNoText())) {
            if (girisEkrani().getMusteriNo_TcNoText().getText().trim().equals("")) {
                girisEkrani().getMusteriNo_TcNoText().setText("T.C. No / Müşteri No");
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.gray);
            } else {
                girisEkrani().getMusteriNo_TcNoText().setForeground(Color.black);
            }

        }
        /**/

 /*Giriş Ekranı Şifre Text*/
        if (sourceController().textSource(girisEkrani().getSifreText())) {
            if (girisEkrani().getSifreText().getText().trim().equals("")) {
                girisEkrani().getSifreText().setText("**********");
                girisEkrani().getSifreText().setForeground(Color.gray);
            } else {
                girisEkrani().getSifreText().setForeground(Color.black);
            }
        }
        /**/
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());

        if (sourceController().labelSource(girisEkrani().getSifremiUnuttumLabel())) {
            girisEkrani().getGirisEkraniFrame().setVisible(false);
            SifreYenilemeEkrani sifreYenilemeEkrani = new SifreYenilemeEkrani();
            sifreYenilemeEkrani.getEskiSifreText().setBackground(Color.black); //sifremi unuttum dediginde eski sifresini
            sifreYenilemeEkrani.getEskiSifreText().setEditable(false);         //bilemeyecegi icin o text'i devre disi birakiyoruz
            sifreYenilemeEkrani.getSifreYenilemeFrame().setVisible(true);
        }
    }

}
