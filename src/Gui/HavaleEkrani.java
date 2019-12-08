/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.HavaleEkraniActions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Emre
 */
public class HavaleEkrani {
    JFrame havaleEkraniFrame = null;
    JPanel havaleEkraniPanel = null;
    JLabel geriLabel = null;
    JLabel adSoyadLabel = null;
    JLabel toplamBakiyeLabel = null;
    JLabel musteriNoLabel = null;
    JTextField musteriNoText = null;
    JLabel gonderilecekTutarLabel = null;
    JTextField gonderilecekTutarText = null;
    JButton gonderButton = null;

    HavaleEkraniActions action = new HavaleEkraniActions(this);

    public HavaleEkrani() {
        getHavaleEkraniPanel().setBackground(new Color(255,204,255));
        getHavaleEkraniPanel().add(getGeriLabel());
        getHavaleEkraniPanel().add(adSoyadLabel());
        getHavaleEkraniPanel().add(getToplamBakiyeLabel());
        getHavaleEkraniPanel().add(musteriNoLabel());
        getHavaleEkraniPanel().add(getMusteriNoText());
        getHavaleEkraniPanel().add(getGonderilecekTutarLabel());
        getHavaleEkraniPanel().add(getGonderilecekTutarText());
        getHavaleEkraniPanel().add(gonderButton());
        getHavaleEkraniFrame().setVisible(true);
    }

    public JFrame getHavaleEkraniFrame() {
        if (havaleEkraniFrame == null) {
            havaleEkraniFrame = new JFrame("Havale Ekranı");
            havaleEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            havaleEkraniFrame.setResizable(false);
            havaleEkraniFrame.setLocation(650, 320);
            havaleEkraniFrame.setSize(500, 350);
            havaleEkraniFrame.setContentPane(getHavaleEkraniPanel());
        }
        return havaleEkraniFrame;
    }

    public JPanel getHavaleEkraniPanel() {
        if (havaleEkraniPanel == null) {
            havaleEkraniPanel = new JPanel();
            havaleEkraniPanel.setLayout(null);
            havaleEkraniPanel.setFocusable(true);
        }
        return havaleEkraniPanel;
    }

    public JLabel getGeriLabel() {
        if (geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }

    public JLabel adSoyadLabel() {
        if (adSoyadLabel == null) {
            adSoyadLabel = new JLabel();
            adSoyadLabel.setText("Değerli Müşterimiz [Ad Soyad]");
            adSoyadLabel.setFont(getFont(1, 18));
            adSoyadLabel.setForeground(Color.red);
            adSoyadLabel.setBounds(20, 60, 280, 35);
        }
        return adSoyadLabel;
    }

    public JLabel getToplamBakiyeLabel() {
        if (toplamBakiyeLabel == null) {
            toplamBakiyeLabel = new JLabel();
            toplamBakiyeLabel.setText("Hesabınızda Toplam .... TL Bakiye Bulunmaktadır.");
            toplamBakiyeLabel.setFont(getFont(0, 18));
            toplamBakiyeLabel.setForeground(Color.blue);
            toplamBakiyeLabel.setBounds(40, 100, 450, 35);

        }
        return toplamBakiyeLabel;
    }

    public JLabel musteriNoLabel() {
        if (musteriNoLabel == null) {
            musteriNoLabel = new JLabel();
            musteriNoLabel.setText("Müşteri Numarası   :");
            musteriNoLabel.setFont(getFont(0, 18));
            musteriNoLabel.setForeground(Color.black);
            musteriNoLabel.setBounds(30, 150, 200, 35);
        }
        return musteriNoLabel;
    }

    public JTextField getMusteriNoText() {
        if (musteriNoText == null) {
            musteriNoText = new JTextField();
            musteriNoText.setFont(getFont(0, 18));
            musteriNoText.setBounds(200, 150, 180, 35);
        }
        return musteriNoText;
    }

    public JLabel getGonderilecekTutarLabel() {
        if (gonderilecekTutarLabel == null) {
            gonderilecekTutarLabel = new JLabel();
            gonderilecekTutarLabel.setText("Gönderilecek Tutar :");
            gonderilecekTutarLabel.setFont(getFont(0, 18));
            gonderilecekTutarLabel.setForeground(Color.black);
            gonderilecekTutarLabel.setBounds(30, 200, 200, 35);

        }
        return gonderilecekTutarLabel;
    }

    public JTextField getGonderilecekTutarText() {
        if (gonderilecekTutarText == null) {
            gonderilecekTutarText = new JTextField();
            gonderilecekTutarText.setFont(getFont(0, 18));
            gonderilecekTutarText.setBounds(200, 200, 180, 35);
        }
        return gonderilecekTutarText;
    }

    public JButton gonderButton() {
        if (gonderButton == null) {
            gonderButton = new JButton();
            gonderButton.setText("Gönder");
            gonderButton.setFont(getFont(1, 15));
            gonderButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            gonderButton.setBounds(220, 250, 110, 35);
            gonderButton.addActionListener(action);
        }
        return gonderButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
}
