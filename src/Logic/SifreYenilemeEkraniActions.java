/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import Gui.SifreYenilemeEkrani;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Emre
 */
public class SifreYenilemeEkraniActions extends Actions {

    SifreYenilemeEkrani sifreYenilemeEkrani = null;
    SourceController sourceController = null;

    public SifreYenilemeEkraniActions(SifreYenilemeEkrani sifreYenilemeEkrani) {
        setSifreYenilemeEkrani(sifreYenilemeEkrani);
    }

    public void setSifreYenilemeEkrani(SifreYenilemeEkrani sifreYenilemeEkrani) {
        this.sifreYenilemeEkrani = sifreYenilemeEkrani;
    }

    public SifreYenilemeEkrani sifreYenilemeEkrani() {
        if (sifreYenilemeEkrani == null) {
            sifreYenilemeEkrani = new SifreYenilemeEkrani();
        }
        return sifreYenilemeEkrani;
    }

    public SourceController sourceController() {
        if (sourceController == null) {
            sourceController = new SourceController();
        }
        return sourceController;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        sourceController().setSource(e.getSource());
        
        if (sourceController().labelSource(sifreYenilemeEkrani().getGeriLabel())) 
        {
            sifreYenilemeEkrani().getSifreYenilemeFrame().setVisible(false);
            if (sifreYenilemeEkrani().getEskiSifreText().getBackground() != Color.black) 
            {
                KullaniciHesapEkrani kullaniciHesapEkrani = new KullaniciHesapEkrani();
                kullaniciHesapEkrani.getKullaniciHesapEkraniFrame().setVisible(true);
            } 
            else { //eger kullanici sifremi unuttum'a tiklamissa
                GirisEkrani girisEkrani = new GirisEkrani();
                girisEkrani.getGirisEkraniFrame().setVisible(true);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
   
}
