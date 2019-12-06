/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.KullaniciHesapEkrani;

/**
 *
 * @author Emre
 */
public class KullaniciHesapEkraniActions extends Actions {

    KullaniciHesapEkrani kullaniciHesapEkrani = null;

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
}
