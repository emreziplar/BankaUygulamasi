
package Logic;

import Gui.BasvuruEkrani;
import Gui.GirisEkrani;
import Gui.KullaniciHesapEkrani;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Actions implements ActionListener,FocusListener,MouseListener {
    
    GirisEkrani girisEkrani = null;
    KullaniciHesapEkrani kullaniciHesapEkrani = null;
    BasvuruEkrani basvuruEkrani = null;
    
    /* GİRİŞ EKRANI */       
    public Actions(GirisEkrani action) {
        setGirisEkrani(action);
    }
    
    public GirisEkrani girisEkrani() {
        if(girisEkrani == null)
            girisEkrani = new GirisEkrani();
        return girisEkrani;
    }
    
    public void setGirisEkrani(GirisEkrani girisEkrani) {
        this.girisEkrani = girisEkrani;
    }
    /**/
        
    /*KULLANICI HESAP EKRANI*/       
    public Actions(KullaniciHesapEkrani action) {
        setKullaniciHesapEkrani(action);
    }
    
    public KullaniciHesapEkrani kullaniciHesapEkrani() {
        if(kullaniciHesapEkrani == null) 
            kullaniciHesapEkrani = new KullaniciHesapEkrani();
        return kullaniciHesapEkrani;
    }
    
    public void setKullaniciHesapEkrani(KullaniciHesapEkrani kullaniciHesapEkrani) {
        this.kullaniciHesapEkrani = kullaniciHesapEkrani;
    }
    /**/
    
    /*BAŞVURU EKRANI*/       
    public Actions(BasvuruEkrani action) {
        setBasvuruEkrani(action);
    }
    
    public BasvuruEkrani basvuruEkrani() {
        if(basvuruEkrani == null) 
            basvuruEkrani = new BasvuruEkrani();
        return basvuruEkrani;
    }
    
    public void setBasvuruEkrani(BasvuruEkrani basvuruEkrani) {
        this.basvuruEkrani = basvuruEkrani;
    }
    /**/
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*Giriş Ekranı Giriş Button*/
        if(e.getSource() == girisEkrani().girisButton()) { //giriş butonuna tıklanmışsa
            kullaniciHesapEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        /**/
        
        /*Giriş Ekranı Başvur Button*/
        if(e.getSource() == girisEkrani().basvuruButton()) {
            basvuruEkrani();
            girisEkrani().getGirisEkraniFrame().setVisible(false);
        }
        
    }

    @Override
    public void focusGained(FocusEvent e) { //belirlenen kaynaklara tıklandığında(focuslandığında)
       
        /*Giriş Ekranı Müşteri No Text*/
        if(e.getSource() == girisEkrani().musteriNo_TcNoText()) {
            if(girisEkrani().musteriNo_TcNoText().getText().trim().equals("T.C. No / Müşteri No"))
                girisEkrani().musteriNo_TcNoText().setText("");
            else 
                girisEkrani().musteriNo_TcNoText().setForeground(Color.gray);
        }
        /**/
        
        /*Giriş Ekranı Şifre Text*/
        if(e.getSource() == girisEkrani().sifreText()) {
            if(girisEkrani().sifreText().getText().trim().equals("**********"))
                girisEkrani().sifreText().setText("");
            else 
                girisEkrani().sifreText().setForeground(Color.gray);
        }
        /**/
        
        
    }

    @Override
    public void focusLost(FocusEvent e) { //belirlenen kaynak dışında bir yere tıklandığında(focus kaybedildiğinde)
       
        /*Giriş Ekranı Müşteri No Text*/
        if(e.getSource() == girisEkrani().musteriNo_TcNoText()) {
            if(girisEkrani().musteriNo_TcNoText().getText().trim().equals("")) {
                girisEkrani().musteriNo_TcNoText().setText("T.C. No / Müşteri No");
                girisEkrani().musteriNo_TcNoText().setForeground(Color.gray);
            }
            else 
                girisEkrani().musteriNo_TcNoText().setForeground(Color.black);
            
        }
        /**/
        
        /*Giriş Ekranı Şifre Text*/
        if(e.getSource() == girisEkrani().sifreText()) {
            if(girisEkrani().sifreText().getText().trim().equals("")) {
                girisEkrani().sifreText().setText("**********");
                girisEkrani().sifreText().setForeground(Color.gray);
            }
            else 
                girisEkrani().sifreText().setForeground(Color.black);
        }
        /**/       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        /*Başvuru Ekranı Geri Iconu*/
        if(e.getSource() == basvuruEkrani().geriLabel()) {
            girisEkrani();
            basvuruEkrani().basvuruEkraniFrame().setVisible(false);
        }
        /**/
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    
}
