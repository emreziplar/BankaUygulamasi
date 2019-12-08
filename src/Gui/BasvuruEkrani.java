package Gui;

import Logic.BasvuruEkraniActions;
import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import java.awt.*;
import javax.swing.*;

public final class BasvuruEkrani {

    JFrame basvuruEkraniFrame = null;
    JPanel basvuruEkraniPanel = null;
    JLabel geriLabel = null;
    JLabel kisiselBilgilerLabel = null;
    JLabel adSoyadLabel = null;
    JTextField adSoyadText = null;
    JLabel tcNoLabel = null;
    JTextField tcNoText = null;
    JLabel telNoLabel = null;
    JTextField telNoText = null;
    JLabel guvenlikLabel = null;
    JLabel guvenlikSorusuLabel = null;
    JComboBox guvenlikSorusuComboBox = null;
    JLabel guvenlikCevapLabel = null;
    JTextField guvenlikCevapText = null;
    JButton basvurButton = null;
    BasvuruEkraniActions action = new BasvuruEkraniActions(this);

    public BasvuruEkrani() {
        getBasvuruEkraniPanel().setBackground(new Color(208, 204, 204));
        getBasvuruEkraniPanel().add(getGeriLabel());
        getBasvuruEkraniPanel().add(getKisiselBilgilerLabel());
        getBasvuruEkraniPanel().add(getAdSoyadLabel());
        getBasvuruEkraniPanel().add(getAdSoyadText());
        getBasvuruEkraniPanel().add(getTcNoLabel());
        getBasvuruEkraniPanel().add(getTcNoText());
        getBasvuruEkraniPanel().add(getTelNoLabel());
        getBasvuruEkraniPanel().add(getTelNoText());
        getBasvuruEkraniPanel().add(getGuvenlikLabel());
        getBasvuruEkraniPanel().add(getGuvenlikSorusuLabel());
        getBasvuruEkraniPanel().add(getGuvenlikSorusuComboBox());
        getBasvuruEkraniPanel().add(getGuvenlikCevapLabel());
        getBasvuruEkraniPanel().add(getGuvenlikCevapText());
        getBasvuruEkraniPanel().add(getBasvurButton());
        getBasvuruEkraniFrame().setVisible(true);
    }

    public JFrame getBasvuruEkraniFrame() {
        if (basvuruEkraniFrame == null) {
            basvuruEkraniFrame = new JFrame("Başvuru");
            basvuruEkraniFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //pencereyi hicbir sekilde kapatamaz
            basvuruEkraniFrame.setResizable(false); //pencere boyutu ayarlanamaz
            basvuruEkraniFrame.setSize(500, 483);
            basvuruEkraniFrame.setLocation(650, 220);
            basvuruEkraniFrame.setContentPane(getBasvuruEkraniPanel());
        }
        return basvuruEkraniFrame;
    }

    public JPanel getBasvuruEkraniPanel() {
        if (basvuruEkraniPanel == null) {
            basvuruEkraniPanel = new JPanel();
            basvuruEkraniPanel.setLayout(null);
        }
        return basvuruEkraniPanel;
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

    public JLabel getKisiselBilgilerLabel() {
        if (kisiselBilgilerLabel == null) {
            kisiselBilgilerLabel = new JLabel();
            kisiselBilgilerLabel.setText("Kişisel Bilgiler ");
            kisiselBilgilerLabel.setFont(getFont(1, 14)); // style:bold , size:19
            kisiselBilgilerLabel.setForeground(Color.red);
            kisiselBilgilerLabel.setBounds(50, 60, 100, 20);
        }
        return kisiselBilgilerLabel;
    }

    public JLabel getAdSoyadLabel() {
        if (adSoyadLabel == null) {
            adSoyadLabel = new JLabel();
            adSoyadLabel.setText("Ad Soyad                          :");
            adSoyadLabel.setFont(getFont(0, 11)); // style:bold , size:19
            adSoyadLabel.setForeground(Color.black);
            adSoyadLabel.setBounds(50, 110, 150, 20);

        }
        return adSoyadLabel;
    }

    public JTextField getAdSoyadText() {
        if (adSoyadText == null) {
            adSoyadText = new JTextField();
            adSoyadText.setFont(getFont(0, 13));
            adSoyadText.setBounds(200, 110, 200, 20);
        }
        return adSoyadText;
    }

    public JLabel getTcNoLabel() {
        if (tcNoLabel == null) {
            tcNoLabel = new JLabel();
            tcNoLabel.setText("T.C Kimlik Numarası         :");
            tcNoLabel.setFont(getFont(0, 11)); // style:bold , size:19
            tcNoLabel.setForeground(Color.black);
            tcNoLabel.setBounds(50, 160, 150, 20);
        }
        return tcNoLabel;
    }

    public JTextField getTcNoText() {
        if (tcNoText == null) {
            tcNoText = new JTextField();
            tcNoText.setFont(getFont(0, 13));
            tcNoText.setBounds(200, 160, 200, 20);
            tcNoText.setDocument(new JTextFieldLimit(11));
            KeyTyped.sadeceSayiAl(getBasvuruEkraniFrame(), getTcNoText());
        }
        return tcNoText;
    }

    public JLabel getTelNoLabel() {
        if (telNoLabel == null) {
            telNoLabel = new JLabel();
            telNoLabel.setText("Telefon Numarası            :");
            telNoLabel.setFont(getFont(0, 11)); // style:bold , size:19
            telNoLabel.setForeground(Color.black);
            telNoLabel.setBounds(50, 210, 150, 20);
        }
        return telNoLabel;
    }

    public JTextField getTelNoText() {
        if (telNoText == null) {
            telNoText = new JTextField();
            telNoText.setFont(getFont(0, 13));
            telNoText.setBounds(200, 210, 200, 20);
            telNoText.setDocument(new JTextFieldLimit(11));
            KeyTyped.sadeceSayiAl(getBasvuruEkraniFrame(), getTelNoText());
        }
        return telNoText;
    }

    public JLabel getGuvenlikLabel() {
        if (guvenlikLabel == null) {
            guvenlikLabel = new JLabel();
            guvenlikLabel.setText("Güvenlik Bilgileri ");
            guvenlikLabel.setFont(getFont(1, 14)); // style:bold , size:19
            guvenlikLabel.setForeground(Color.red);
            guvenlikLabel.setBounds(50, 260, 120, 20);

        }
        return guvenlikLabel;
    }

    public JLabel getGuvenlikSorusuLabel() {
        if (guvenlikSorusuLabel == null) {
            guvenlikSorusuLabel = new JLabel();
            guvenlikSorusuLabel.setText("Güvenlik Sorusu               :");
            guvenlikSorusuLabel.setFont(getFont(0, 11)); // style:bold , size:19
            guvenlikSorusuLabel.setForeground(Color.black);
            guvenlikSorusuLabel.setBounds(50, 310, 150, 20);
        }
        return guvenlikSorusuLabel;
    }

    public JComboBox getGuvenlikSorusuComboBox() {
        if (guvenlikSorusuComboBox == null) {
            guvenlikSorusuComboBox = new JComboBox();
            guvenlikSorusuComboBox.setBounds(200, 310, 200, 20);
            guvenlikSorusuComboBox.setModel(new DefaultComboBoxModel(new String[]{"İlk evcil hayvanınızın adı nedir?",
                "En sevdiğiniz nesne nedir?",
                "İlkokul öğretmeninizin soyadı nedir?"}));
            guvenlikSorusuComboBox.setFont(getFont(0, 11));
        }
        return guvenlikSorusuComboBox;
    }

    public JLabel getGuvenlikCevapLabel() {
        if (guvenlikCevapLabel == null) {
            guvenlikCevapLabel = new JLabel();
            guvenlikCevapLabel.setText("Güvenlik Sorusu Cevabı   :");
            guvenlikCevapLabel.setFont(getFont(0, 11));
            guvenlikCevapLabel.setForeground(Color.black);
            guvenlikCevapLabel.setBounds(50, 360, 150, 20);
        }
        return guvenlikCevapLabel;
    }

    public JTextField getGuvenlikCevapText() {
        if (guvenlikCevapText == null) {
            guvenlikCevapText = new JTextField();
            guvenlikCevapText.setFont(getFont(0, 13));
            guvenlikCevapText.setBounds(200, 360, 200, 20);

        }
        return guvenlikCevapText;
    }

    public JButton getBasvurButton() {
        if (basvurButton == null) {
            basvurButton = new JButton();
            basvurButton.setText("Başvur");
            basvurButton.setFont(getFont(0, 13));
            basvurButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            basvurButton.setBounds(255, 410, 90, 25);
            basvurButton.addActionListener(action);
        }
        return basvurButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }
}
