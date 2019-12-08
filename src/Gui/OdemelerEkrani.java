/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.OdemelerEkraniActions;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Emre
 */
public class OdemelerEkrani {
    
    JFrame odemelerEkraniFrame = null;
    JPanel odemelerEkraniPanel = null;
    JLabel geriLabel = null;
    JLabel adSoyadLabel = null;
    JLabel elektrikFaturasiLabel = null;
    JLabel elektrikBorcuLabel = null;
    JButton elektrikOdeButton = null;
    JLabel suFaturasiLabel = null;
    JLabel suBorcuLabel = null;
    JButton suOdeButton = null;
    JLabel dogalgazFaturasiLabel = null;
    JLabel dogalgazBorcuLabel = null;
    JButton dogalgazOdeButton = null;
    JLabel internetFaturasiLabel = null;
    JLabel internetBorcuLabel = null;
    JButton internetOdeButton = null;

    OdemelerEkraniActions action = new OdemelerEkraniActions(this);

    public OdemelerEkrani() {
        getOdemelerEkraniPanel().setBackground(new Color(204,255,255));
        getOdemelerEkraniPanel().add(geriLabel());
        getOdemelerEkraniPanel().add(getAdSoyadLabel());
        getOdemelerEkraniPanel().add(getElektrikFaturasiLabel());
        getOdemelerEkraniPanel().add(getElektrikBorcuLabel());
        getOdemelerEkraniPanel().add(getElektrikOdeButton());
        getOdemelerEkraniPanel().add(getSuFaturasiLabel());
        getOdemelerEkraniPanel().add(getSuBorcuLabel());
        getOdemelerEkraniPanel().add(getSuOdeButton());
        getOdemelerEkraniPanel().add(getDogalgazFaturasiLabel());
        getOdemelerEkraniPanel().add(getDogalgazBorcuLabel());
        getOdemelerEkraniPanel().add(getDogalgazOdeButton());
        getOdemelerEkraniPanel().add(getInternetFaturasiLabel());
        getOdemelerEkraniPanel().add(getInternetBorcuLabel());
        getOdemelerEkraniPanel().add(getInternetOdeButton());
        getOdemelerEkraniFrame().setVisible(true);
    }

    public JFrame getOdemelerEkraniFrame() {
        if (odemelerEkraniFrame == null) {
            odemelerEkraniFrame = new JFrame("Ödemeler Ekranı");
            odemelerEkraniFrame.setResizable(false);
            odemelerEkraniFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            odemelerEkraniFrame.setLocation(500, 220);
            odemelerEkraniFrame.setSize(600, 400);
            odemelerEkraniFrame.setContentPane(getOdemelerEkraniPanel());
        }
        return odemelerEkraniFrame;
    }

    public JPanel getOdemelerEkraniPanel() {
        if (odemelerEkraniPanel == null) {
            odemelerEkraniPanel = new JPanel();
            odemelerEkraniPanel.setLayout(null);
            odemelerEkraniPanel.setFocusable(true);
        }
        return odemelerEkraniPanel;
    }

    public JLabel geriLabel() {
        if (geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 10, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }

    public JLabel getAdSoyadLabel() {
        if (adSoyadLabel == null) {
            adSoyadLabel = new JLabel();
            adSoyadLabel.setText("Değerli Müşterimiz [Ad Soyad]");
            adSoyadLabel.setFont(getFont(1, 18));
            adSoyadLabel.setForeground(Color.red);
            adSoyadLabel.setBounds(20, 45, 280, 35);
        }
        return adSoyadLabel;
    }

    public JLabel getElektrikFaturasiLabel() {
        if (elektrikFaturasiLabel == null) {
            elektrikFaturasiLabel = new JLabel();
            elektrikFaturasiLabel.setText("Toplam Elektrik Faturası Borcunuz ");
            elektrikFaturasiLabel.setFont(getFont(1, 18));
            elektrikFaturasiLabel.setForeground(Color.black);
            elektrikFaturasiLabel.setBounds(20, 110, 300, 35);
        }
        return elektrikFaturasiLabel;
    }

    public JLabel getElektrikBorcuLabel() {
        if (elektrikBorcuLabel == null) {
            elektrikBorcuLabel = new JLabel();
            elektrikBorcuLabel.setText("DENEME");
            elektrikBorcuLabel.setFont(getFont(1, 15));
            elektrikBorcuLabel.setForeground(Color.black);
            elektrikBorcuLabel.setBounds(380, 110, 100, 35);
        }
        return elektrikBorcuLabel;
    }

    public JButton getElektrikOdeButton() {
        if (elektrikOdeButton == null) {
            elektrikOdeButton = new JButton();
            elektrikOdeButton.setText("Öde");
            elektrikOdeButton.setFont(getFont(1, 15));
            elektrikOdeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            elektrikOdeButton.setBounds(480, 110, 75, 35);
            elektrikOdeButton.addActionListener(action);
        }
        return elektrikOdeButton;
    }

    public JLabel getSuFaturasiLabel() {
        if (suFaturasiLabel == null) {
            suFaturasiLabel = new JLabel();
            suFaturasiLabel.setText("Toplam Su Faturası Borcunuz ");
            suFaturasiLabel.setFont(getFont(1, 18));
            suFaturasiLabel.setForeground(Color.black);
            suFaturasiLabel.setBounds(20, 180, 300, 35);
        }
        return suFaturasiLabel;
    }

    public JLabel getSuBorcuLabel() {
        if (suBorcuLabel == null) {
            suBorcuLabel = new JLabel();
            suBorcuLabel.setText("DENEME");
            suBorcuLabel.setFont(getFont(1, 15));
            suBorcuLabel.setForeground(Color.black);
            suBorcuLabel.setBounds(380, 180, 100, 35);
        }
        return suBorcuLabel;
    }

    public JButton getSuOdeButton() {
        if (suOdeButton == null) {
            suOdeButton = new JButton();
            suOdeButton.setText("Öde");
            suOdeButton.setFont(getFont(1, 15));
            suOdeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            suOdeButton.setBounds(480, 180, 75, 35);
            suOdeButton.addActionListener(action);
        }
        return suOdeButton;
    }

    public JLabel getDogalgazFaturasiLabel() {
        if (dogalgazFaturasiLabel == null) {
            dogalgazFaturasiLabel = new JLabel();
            dogalgazFaturasiLabel.setText("Toplam Doğal Gaz Faturası Borcunuz ");
            dogalgazFaturasiLabel.setFont(getFont(1, 18));
            dogalgazFaturasiLabel.setForeground(Color.black);
            dogalgazFaturasiLabel.setBounds(20, 250, 320, 35);
        }
        return dogalgazFaturasiLabel;
    }

    public JLabel getDogalgazBorcuLabel() {
        if (dogalgazBorcuLabel == null) {
            dogalgazBorcuLabel = new JLabel();
            dogalgazBorcuLabel.setText("DENEME");
            dogalgazBorcuLabel.setFont(getFont(1, 15));
            dogalgazBorcuLabel.setForeground(Color.black);
            dogalgazBorcuLabel.setBounds(380, 250, 100, 35);
        }
        return dogalgazBorcuLabel;
    }

    public JButton getDogalgazOdeButton() {
        if (dogalgazOdeButton == null) {
            dogalgazOdeButton = new JButton();
            dogalgazOdeButton.setText("Öde");
            dogalgazOdeButton.setFont(getFont(1, 15));
            dogalgazOdeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            dogalgazOdeButton.setBounds(480, 250, 75, 35);
            dogalgazOdeButton.addActionListener(action);
        }
        return dogalgazOdeButton;
    }

    public JLabel getInternetFaturasiLabel() {
        if (internetFaturasiLabel == null) {
            internetFaturasiLabel = new JLabel();
            internetFaturasiLabel.setText("Toplam İnternet Faturası Borcunuz ");
            internetFaturasiLabel.setFont(getFont(1, 18));
            internetFaturasiLabel.setForeground(Color.black);
            internetFaturasiLabel.setBounds(20, 320, 320, 35);
        }
        return internetFaturasiLabel;
    }

    public JLabel getInternetBorcuLabel() {
        if (internetBorcuLabel == null) {
            internetBorcuLabel = new JLabel();
            internetBorcuLabel.setText("DENEME");
            internetBorcuLabel.setFont(getFont(1, 15));
            internetBorcuLabel.setForeground(Color.black);
            internetBorcuLabel.setBounds(380, 320, 100, 35);
        }
        return internetBorcuLabel;
    }

    public JButton getInternetOdeButton() {
        if (internetOdeButton == null) {
            internetOdeButton = new JButton();
            internetOdeButton.setText("Öde");
            internetOdeButton.setFont(getFont(1, 15));
            internetOdeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            internetOdeButton.setBounds(480, 320, 75, 35);
            internetOdeButton.addActionListener(action);
        }
        return internetOdeButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

}


