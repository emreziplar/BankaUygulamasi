
package Gui;

import Logic.Actions;
import java.awt.*;
import javax.swing.*;


public final class KullaniciHesapEkrani {
   
    JFrame hesapEkraniFrame = null;
    JPanel hesapEkraniPanel = null;
    JButton girisButton = null;
    Actions actions = new Actions(this);
    
    public KullaniciHesapEkrani() {
        getKullaniciHesapEkraniPanel().setBackground(new Color(204,204,204));
        getKullaniciHesapEkraniFrame().setVisible(true);
    }
    
    public JFrame getKullaniciHesapEkraniFrame() {
        if (hesapEkraniFrame == null) {
            hesapEkraniFrame = new JFrame("Kullanıcı Hesap Ekranı");
            hesapEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            hesapEkraniFrame.setResizable(false);
            hesapEkraniFrame.setLocation(500, 220);
            hesapEkraniFrame.setSize(850, 596);
            hesapEkraniFrame.setContentPane(getKullaniciHesapEkraniPanel());
        }
        return hesapEkraniFrame;
    }
    
    public JPanel getKullaniciHesapEkraniPanel() {
        if(hesapEkraniPanel == null) {
            hesapEkraniPanel = new JPanel();
            hesapEkraniPanel.setLayout(null);
            hesapEkraniPanel.setFocusable(true);
        }        
        return hesapEkraniPanel;
    }   
    
    
}
