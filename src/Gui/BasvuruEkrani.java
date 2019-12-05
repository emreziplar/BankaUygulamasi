package Gui;

import Logic.Actions;
import java.awt.*;
import javax.swing.*;

public final class BasvuruEkrani {

    JFrame basvuruEkraniFrame = null;
    JPanel basvuruEkraniPanel = null;
    JLabel geriLabel = null;
    Actions action = new Actions(this);
    
    public BasvuruEkrani() {
        basvuruEkraniPanel().setBackground(new Color(208,204,204));
        basvuruEkraniPanel().add(geriLabel());
        basvuruEkraniFrame().setVisible(true);
    }

    public JFrame basvuruEkraniFrame() {
        if (basvuruEkraniFrame == null) {
            basvuruEkraniFrame = new JFrame();
            basvuruEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //pencereyi hicbir sekilde kapatamaz
            basvuruEkraniFrame.setResizable(false); //pencere boyutu ayarlanamaz
            basvuruEkraniFrame.setSize(500,483);
            basvuruEkraniFrame.setLocation(650, 220);
            basvuruEkraniFrame.setContentPane(basvuruEkraniPanel());
        }
        return basvuruEkraniFrame;
    }
    
    public JPanel basvuruEkraniPanel() {
        if(basvuruEkraniPanel == null) {
            basvuruEkraniPanel = new JPanel();
            basvuruEkraniPanel.setLayout(null);
        }
        return basvuruEkraniPanel;
    }
    
    public JLabel geriLabel() {
        if(geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }
}
