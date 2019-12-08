package Gui;

import Logic.JTextFieldLimit;
import Logic.KeyTyped;
import Logic.SifreYenilemeEkraniActions;
import java.awt.*;
import javax.swing.*;

// çarpıya basınca ayarlar ekranına geri dönmesi ayarlanıcak
public final class SifreYenilemeEkrani {

    JFrame sifreYenilemeFrame = null;
    JPanel sifreYenilemePanel = null;
    JLabel geriLabel = null;
    JLabel sifreyenilemeLabel = null;
    JLabel tcnoLabel = null;
    JTextField tcnoTextField = null;
    JLabel guvenliksorusuLabel = null;
    JTextField guvenliksorusuTextField = null;
    JLabel eskisifreLabel = null;
    JPasswordField eskiSifreText = null;
    JLabel yenisifreLabel = null;
    JPasswordField yeniSifreText = null;
    JLabel yenisifretekrarLabel = null;
    JPasswordField yeniSifreTekrarText = null;
    JButton sifreyenileButton = null;
    SifreYenilemeEkraniActions action = new SifreYenilemeEkraniActions(this);

    public SifreYenilemeEkrani() {
        getSifreYenilemePanel().setBackground(new Color(255, 204, 204));
        getSifreYenilemePanel().add(getSifreYenilemeLabel());
        getSifreYenilemePanel().add(getGeriLabel());
        getSifreYenilemePanel().add(getTcNoLabel());
        getSifreYenilemePanel().add(getTcNoText());
        getSifreYenilemePanel().add(getGuvenlikSorusuLabel());
        getSifreYenilemePanel().add(getGuvenlikSorusuText());
        getSifreYenilemePanel().add(getEskiSifreLabel());
        getSifreYenilemePanel().add(getEskiSifreText());
        getSifreYenilemePanel().add(getYeniSifreLabel());
        getSifreYenilemePanel().add(getYeniSifreText());
        getSifreYenilemePanel().add(getYeniSifreTekrarLabel());
        getSifreYenilemePanel().add(getYeniSifreTekrarText());
        getSifreYenilemePanel().add(getSifreYenileButton());
        getSifreYenilemeFrame().setVisible(true);
    }

    public JFrame getSifreYenilemeFrame() {
        if (sifreYenilemeFrame == null) {
            sifreYenilemeFrame = new JFrame("Şifre Değiştirme");
            sifreYenilemeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sifreYenilemeFrame.setResizable(false);
            sifreYenilemeFrame.setLocation(700, 300);
            sifreYenilemeFrame.setSize(530, 460);
            sifreYenilemeFrame.setContentPane(getSifreYenilemePanel());
        }
        return sifreYenilemeFrame;
    }

    public JPanel getSifreYenilemePanel() {
        if (sifreYenilemePanel == null) {
            sifreYenilemePanel = new JPanel();
            sifreYenilemePanel.setLayout(null);
            sifreYenilemePanel.setFocusable(true);
        }
        return sifreYenilemePanel;
    }

    public JLabel getGeriLabel() {
        if (geriLabel == null) {
            geriLabel = new JLabel();
            geriLabel.setBounds(10, 25, 30, 28);
            geriLabel.setIcon(new ImageIcon(getClass().getResource("/Gui/Image/geriIcon.png")));
            geriLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
            geriLabel.addMouseListener(action);
        }
        return geriLabel;
    }

    public JLabel getSifreYenilemeLabel() {
        if (sifreyenilemeLabel == null) {
            sifreyenilemeLabel = new JLabel();
            sifreyenilemeLabel.setText("Şifre Yenileme");
            sifreyenilemeLabel.setFont(getFont(1, 24)); // style:bold , size:24
            sifreyenilemeLabel.setForeground(Color.red);
            sifreyenilemeLabel.setBounds(60, 20, 220, 35);
        }
        return sifreyenilemeLabel;
    }

    public JLabel getTcNoLabel() {
        if (tcnoLabel == null) {
            tcnoLabel = new JLabel();
            tcnoLabel.setText("TC Kimlik Numaranız          :");
            tcnoLabel.setFont(getFont(0, 18));
            tcnoLabel.setForeground(Color.black);
            tcnoLabel.setBounds(20, 80, 250, 35);
        }
        return tcnoLabel;
    }

    public JTextField getTcNoText() {
        if (tcnoTextField == null) {
            tcnoTextField = new JTextField();
            tcnoTextField.setFont(getFont(0, 15));
            tcnoTextField.setBounds(250, 80, 200, 35);
            KeyTyped.sadeceSayiAl(getSifreYenilemeFrame(), getTcNoText());
            tcnoTextField.setDocument(new JTextFieldLimit(11));
        }
        return tcnoTextField;
    }

    public JLabel getGuvenlikSorusuLabel() {
        if (guvenliksorusuLabel == null) {
            guvenliksorusuLabel = new JLabel();
            guvenliksorusuLabel.setText("Güvenlik Sorusu Cevabınız :");
            guvenliksorusuLabel.setFont(getFont(0, 18));
            guvenliksorusuLabel.setForeground(Color.black);
            guvenliksorusuLabel.setBounds(20, 140, 250, 35);
        }
        return guvenliksorusuLabel;
    }

    public JTextField getGuvenlikSorusuText() {
        if (guvenliksorusuTextField == null) {
            guvenliksorusuTextField = new JTextField();
            guvenliksorusuTextField.setFont(getFont(0, 15));
            guvenliksorusuTextField.setBounds(250, 140, 200, 35);
        }
        return guvenliksorusuTextField;
    }

    public JLabel getEskiSifreLabel() {
        if (eskisifreLabel == null) {
            eskisifreLabel = new JLabel();
            eskisifreLabel.setText("Eski Şifreniz                        :");
            eskisifreLabel.setFont(getFont(0, 18));
            eskisifreLabel.setForeground(Color.black);
            eskisifreLabel.setBounds(20, 200, 250, 35);
        }
        return eskisifreLabel;
    }

    public JPasswordField getEskiSifreText() {
        if (eskiSifreText == null) {
            eskiSifreText = new JPasswordField();
            eskiSifreText.setFont(getFont(0, 15));
            eskiSifreText.setBounds(250, 200, 200, 35);
            KeyTyped.sadeceSayiAl(getSifreYenilemeFrame(), getEskiSifreText());
            eskiSifreText.setDocument(new JTextFieldLimit(6));
        }
        return eskiSifreText;
    }

    public JLabel getYeniSifreLabel() {
        if (yenisifreLabel == null) {
            yenisifreLabel = new JLabel();
            yenisifreLabel.setText("Yeni Şifreniz                        :");
            yenisifreLabel.setFont(getFont(0, 18));
            yenisifreLabel.setForeground(Color.black);
            yenisifreLabel.setBounds(20, 260, 250, 35);
        }
        return yenisifreLabel;
    }

    public JPasswordField getYeniSifreText() {
        if (yeniSifreText == null) {
            yeniSifreText = new JPasswordField();
            yeniSifreText.setFont(getFont(0, 15));
            yeniSifreText.setBounds(250, 260, 200, 35);
            KeyTyped.sadeceSayiAl(getSifreYenilemeFrame(), getYeniSifreText());
            yeniSifreText.setDocument(new JTextFieldLimit(6));
        }
        return yeniSifreText;
    }

    public JLabel getYeniSifreTekrarLabel() {
        if (yenisifretekrarLabel == null) {
            yenisifretekrarLabel = new JLabel();
            yenisifretekrarLabel.setText("Yeni Şifreniz Tekrar             :");
            yenisifretekrarLabel.setFont(getFont(0, 18));
            yenisifretekrarLabel.setForeground(Color.black);
            yenisifretekrarLabel.setBounds(20, 320, 250, 35);
        }
        return yenisifretekrarLabel;
    }

    public JPasswordField getYeniSifreTekrarText() {
        if (yeniSifreTekrarText == null) {
            yeniSifreTekrarText = new JPasswordField();
            yeniSifreTekrarText.setFont(getFont(0, 15));
            yeniSifreTekrarText.setBounds(250, 320, 200, 35);
            KeyTyped.sadeceSayiAl(getSifreYenilemeFrame(), getYeniSifreTekrarText());
            yeniSifreTekrarText.setDocument(new JTextFieldLimit(6));
        }
        return yeniSifreTekrarText;
    }

    public JButton getSifreYenileButton() {
        if (sifreyenileButton == null) {
            sifreyenileButton = new JButton();
            sifreyenileButton.setText("Şifre Yenile");
            sifreyenileButton.setFont(getFont(1, 16));
            sifreyenileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            sifreyenileButton.setBounds(300, 380, 130, 35);
            sifreyenileButton.addActionListener(action);
        }
        return sifreyenileButton;
    }

    public Font getFont(int style, int size) {
        return new Font("Segoe UI", style, size);
    }

}
