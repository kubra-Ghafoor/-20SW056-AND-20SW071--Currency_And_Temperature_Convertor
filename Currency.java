package com.company;
/*import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
public class Currency extends JFrame {
    private JPanel contentPane;
    private JTextField tfMsg;
    private JTextField bdt;
    private JTextField qtr;
    private JTextField inr;
    private JTextField pkr;
    private JTextField usd;
    private JTextField hkd;
    private JTextField aud;
    private JTextField gbp;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Currency frame = new Currency();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Currency() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

	JButton button = new JButton("Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage home = new MainPage();
				home.setVisible(true);
        		dispose();
        		}
        	});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBackground(Color.BLUE);
		button.setBounds(12, 499, 162, 41);
		contentPane.add(button);

        JLabel lblCurrencyConversion = new JLabel("Currency Conversion");
        lblCurrencyConversion.setHorizontalAlignment(SwingConstants.CENTER);
        lblCurrencyConversion.setForeground(Color.WHITE);
        lblCurrencyConversion.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblCurrencyConversion.setBounds(12, 13, 458, 54);
        contentPane.add(lblCurrencyConversion);

        JButton button_1 = new JButton("Exit");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_1.setBackground(Color.RED);
        button_1.setBounds(362, 499, 108, 41);
        contentPane.add(button_1);

        JButton button_2 = new JButton("Clear");
        button_2.setBounds(50, 100, 100, 100);
        contentPane.add(button_2);
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tfMsg.setText(null);
                bdt.setText(null);
                qtr.setText(null);
                inr.setText(null);
                pkr.setText(null);
                aud.setText(null);
                usd.setText(null);
                hkd.setText(null);
                gbp.setText(null);
            }
        });
        button_2.setForeground(Color.WHITE);
        button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_2.setBackground(new Color(0, 100, 0));
        button_2.setBounds(209, 499, 129, 41);
        contentPane.add(button_2);

        tfMsg = new JTextField();
        tfMsg.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tfMsg.setHorizontalAlignment(SwingConstants.CENTER);
        tfMsg.setBackground(Color.BLACK);
        tfMsg.setForeground(Color.RED);
        tfMsg.setBounds(12, 432, 458, 54);
        contentPane.add(tfMsg);
        tfMsg.setColumns(10);

        bdt = new JTextField();
        bdt.setHorizontalAlignment(SwingConstants.CENTER);
        bdt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bdt.setColumns(10);
        bdt.setBounds(141, 67, 147, 40);
        contentPane.add(bdt);

        qtr = new JTextField();
        qtr.setHorizontalAlignment(SwingConstants.CENTER);
        qtr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qtr.setColumns(10);
        qtr.setBounds(141, 111, 147, 40);
        contentPane.add(qtr);

        inr = new JTextField();
        inr.setHorizontalAlignment(SwingConstants.CENTER);
        inr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        inr.setColumns(10);
        inr.setBounds(141, 156, 147, 40);
        contentPane.add(inr);

        pkr = new JTextField();
        pkr.setHorizontalAlignment(SwingConstants.CENTER);
        pkr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pkr.setColumns(10);
        pkr.setBounds(141, 200, 147, 40);
        contentPane.add(pkr);

        usd = new JTextField();
        usd.setHorizontalAlignment(SwingConstants.CENTER);
        usd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        usd.setColumns(10);
        usd.setBounds(141, 247, 147, 40);
        contentPane.add(usd);

        hkd = new JTextField();
        hkd.setHorizontalAlignment(SwingConstants.CENTER);
        hkd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        hkd.setColumns(10);
        hkd.setBounds(141, 291, 147, 40);
        contentPane.add(hkd);

        aud = new JTextField();
        aud.setText((String) null);
        aud.setHorizontalAlignment(SwingConstants.CENTER);
        aud.setFont(new Font("Tahoma", Font.PLAIN, 20));
        aud.setColumns(10);
        aud.setBounds(141, 336, 147, 40);
        contentPane.add(aud);

        gbp = new JTextField();
        gbp.setHorizontalAlignment(SwingConstants.CENTER);
        gbp.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbp.setColumns(10);
        gbp.setBounds(141, 380, 147, 40);
        contentPane.add(gbp);

        JLabel lblBritish = new JLabel("British");
        lblBritish.setForeground(Color.WHITE);
        lblBritish.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBritish.setBackground(Color.BLACK);
        lblBritish.setBounds(22, 380, 107, 40);
        contentPane.add(lblBritish);

        JLabel lblAustralia = new JLabel("Australia");
        lblAustralia.setForeground(Color.WHITE);
        lblAustralia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAustralia.setBackground(Color.BLACK);
        lblAustralia.setBounds(22, 336, 107, 40);
        contentPane.add(lblAustralia);

        JLabel lblHongkong = new JLabel("HongKong");
        lblHongkong.setForeground(Color.WHITE);
        lblHongkong.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblHongkong.setBackground(Color.BLACK);
        lblHongkong.setBounds(22, 291, 107, 40);
        contentPane.add(lblHongkong);

        JLabel lblUnitedState = new JLabel("United State");
        lblUnitedState.setForeground(Color.WHITE);
        lblUnitedState.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUnitedState.setBackground(Color.BLACK);
        lblUnitedState.setBounds(22, 247, 107, 40);
        contentPane.add(lblUnitedState);

        JLabel lblPakistan = new JLabel("Pakistan");
        lblPakistan.setForeground(Color.WHITE);
        lblPakistan.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPakistan.setBackground(Color.BLACK);
        lblPakistan.setBounds(22, 200, 107, 40);
        contentPane.add(lblPakistan);

        JLabel lblIndia = new JLabel("India");
        lblIndia.setForeground(Color.WHITE);
        lblIndia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIndia.setBackground(Color.BLACK);
        lblIndia.setBounds(22, 156, 107, 40);
        contentPane.add(lblIndia);

        JLabel lblQatar = new JLabel("Qatar");
        lblQatar.setForeground(Color.WHITE);
        lblQatar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblQatar.setBackground(Color.BLACK);
        lblQatar.setBounds(22, 111, 107, 40);
        contentPane.add(lblQatar);

        JLabel lblBangladesh = new JLabel("Bangladesh");
        lblBangladesh.setForeground(Color.WHITE);
        lblBangladesh.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBangladesh.setBackground(Color.BLACK);
        lblBangladesh.setBounds(22, 67, 107, 40);
        contentPane.add(lblBangladesh);

        JLabel lblBdt = new JLabel("BDT");
        lblBdt.setForeground(Color.WHITE);
        lblBdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBdt.setBackground(Color.BLACK);
        lblBdt.setBounds(294, 67, 55, 40);
        contentPane.add(lblBdt);

        JLabel lblQar = new JLabel("QAR");
        lblQar.setForeground(Color.WHITE);
        lblQar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblQar.setBackground(Color.BLACK);
        lblQar.setBounds(294, 111, 55, 40);
        contentPane.add(lblQar);

        JLabel lblInr = new JLabel("INR");
        lblInr.setForeground(Color.WHITE);
        lblInr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInr.setBackground(Color.BLACK);
        lblInr.setBounds(294, 156, 55, 40);
        contentPane.add(lblInr);

        JLabel lblPkr = new JLabel("PKR");
        lblPkr.setForeground(Color.WHITE);
        lblPkr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPkr.setBackground(Color.BLACK);
        lblPkr.setBounds(294, 200, 55, 40);
        contentPane.add(lblPkr);

        JLabel lblUsd = new JLabel("USD");
        lblUsd.setForeground(Color.WHITE);
        lblUsd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsd.setBackground(Color.BLACK);
        lblUsd.setBounds(294, 247, 55, 40);
        contentPane.add(lblUsd);

        JLabel lblHkd = new JLabel("HKD");
        lblHkd.setForeground(Color.WHITE);
        lblHkd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblHkd.setBackground(Color.BLACK);
        lblHkd.setBounds(294, 291, 55, 40);
        contentPane.add(lblHkd);

        JLabel lblAud = new JLabel("AUD");
        lblAud.setForeground(Color.WHITE);
        lblAud.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAud.setBackground(Color.BLACK);
        lblAud.setBounds(294, 336, 55, 40);
        contentPane.add(lblAud);

        JLabel lblGbp = new JLabel("GBP");
        lblGbp.setForeground(Color.WHITE);
        lblGbp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGbp.setBackground(Color.BLACK);
        lblGbp.setBounds(294, 380, 55, 40);
        contentPane.add(lblGbp);

        JButton btnGbp = new JButton("Check");
        btnGbp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(gbp.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Gbp = Double.parseDouble(gbp.getText());
                    double Usd = Gbp * 0.7736;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Bdt = Usd * 84.47;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String BDT = String.format("%.3f", Bdt);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    bdt.setText(BDT);


                }
            }
        });
        btnGbp.setForeground(Color.YELLOW);
        btnGbp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGbp.setBackground(new Color(25, 25, 112));
        btnGbp.setBounds(361, 380, 100, 40);
        contentPane.add(btnGbp);

        JButton btnAud = new JButton("Check");
        btnAud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(aud.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Aud = Double.parseDouble(aud.getText());
                    double Usd = Aud * 1.4615;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Bdt = Usd * 84.47;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String BDT = String.format("%.3f", Bdt);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    bdt.setText(BDT);
                    gbp.setText(GBP);


                }
            }
        });
        btnAud.setForeground(Color.YELLOW);
        btnAud.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnAud.setBackground(new Color(25, 25, 112));
        btnAud.setBounds(361, 336, 100, 40);
        contentPane.add(btnAud);

        JButton btnHkd = new JButton("Check");
        btnHkd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(hkd.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Hkd = Double.parseDouble(hkd.getText());
                    double Usd = Hkd * 7.84;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Bdt = Usd * 84.47;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String BDT = String.format("%.3f", Bdt);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    bdt.setText(BDT);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnHkd.setForeground(Color.YELLOW);
        btnHkd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnHkd.setBackground(new Color(25, 25, 112));
        btnHkd.setBounds(361, 291, 100, 40);
        contentPane.add(btnHkd);

        JButton btnUsd = new JButton("Check");
        btnUsd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(usd.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Usd = Double.parseDouble(usd.getText());
                    double Bdt = Usd / 84.47;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String BDT = String.format("%.3f", Bdt);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    bdt.setText(BDT);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnUsd.setForeground(Color.YELLOW);
        btnUsd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnUsd.setBackground(new Color(25, 25, 112));
        btnUsd.setBounds(361, 247, 100, 40);
        contentPane.add(btnUsd);

        JButton btnPkr = new JButton("Check");
        btnPkr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pkr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Pkr = Double.parseDouble(pkr.getText());
                    double Usd = Pkr * 156.05;
                    double Bdt = Usd * 84.47;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String BDT = String.format("%.3f", Bdt);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    bdt.setText(BDT);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnPkr.setForeground(Color.YELLOW);
        btnPkr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnPkr.setBackground(new Color(25, 25, 112));
        btnPkr.setBounds(361, 200, 100, 40);
        contentPane.add(btnPkr);

        JButton btnInr = new JButton("Check");
        btnInr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(inr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Inr = Double.parseDouble(inr.getText());
                    double Usd = Inr * 70.936;
                    double Pkr = Usd * 0.0064;
                    double Bdt = Usd /84.47;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String BDT = String.format("%.3f", Bdt);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    bdt.setText(BDT);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnInr.setForeground(Color.YELLOW);
        btnInr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnInr.setBackground(new Color(25, 25, 112));
        btnInr.setBounds(361, 156, 100, 40);
        contentPane.add(btnInr);

        JButton btnQar = new JButton("Check");
        btnQar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(qtr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Qtr = Double.parseDouble(qtr.getText());
                    double Usd = Qtr * 3.641;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Bdt = Usd / 84.47;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String BDT = String.format("%.3f", Bdt);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    bdt.setText(BDT);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnQar.setForeground(Color.YELLOW);
        btnQar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnQar.setBackground(new Color(25, 25, 112));
        btnQar.setBounds(361, 111, 100, 40);
        contentPane.add(btnQar);

        JButton btnBdt = new JButton("Check");
        btnBdt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(bdt.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Bdt = Double.parseDouble(bdt.getText());
                    double Usd = Bdt * 84.47;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnBdt.setForeground(Color.YELLOW);
        btnBdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnBdt.setBackground(new Color(25, 25, 112));
        btnBdt.setBounds(361, 67, 100, 40);
        contentPane.add(btnBdt);
    }

}*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class Currency extends JFrame {

    private JPanel contentPane;
    private JTextField tfMsg;
    private JTextField bdt;
    private JTextField qtr;
    private JTextField inr;
    private JTextField pkr;
    private JTextField usd;
    private JTextField hkd;
    private JTextField aud;
    private JTextField gbp;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Currency frame = new Currency();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Currency() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton button = new JButton("Main Menu");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //	MainPage home = new MainPage();
                //	home.setVisible(true);
                dispose();
            }
        });
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.setBackground(Color.BLUE);
        button.setBounds(12, 499, 162, 41);
        contentPane.add(button);

        JLabel lblCurrencyConversion = new JLabel("Currency Conversion");
        lblCurrencyConversion.setHorizontalAlignment(SwingConstants.CENTER);
        lblCurrencyConversion.setForeground(Color.WHITE);
        lblCurrencyConversion.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblCurrencyConversion.setBounds(12, 13, 458, 54);
        contentPane.add(lblCurrencyConversion);

        JButton button_1 = new JButton("Exit");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_1.setBackground(Color.RED);
        button_1.setBounds(362, 499, 108, 41);
        contentPane.add(button_1);

        JButton button_2 = new JButton("Clear");
        button_2.setBounds(50, 100, 100, 100);
        contentPane.add(button_2);
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tfMsg.setText(null);
                bdt.setText(null);
                qtr.setText(null);
                inr.setText(null);
                pkr.setText(null);
                aud.setText(null);
                usd.setText(null);
                hkd.setText(null);
                gbp.setText(null);
            }
        });
        button_2.setForeground(Color.WHITE);
        button_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_2.setBackground(new Color(0, 100, 0));
        button_2.setBounds(209, 499, 129, 41);
        contentPane.add(button_2);

        tfMsg = new JTextField();
        tfMsg.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tfMsg.setHorizontalAlignment(SwingConstants.CENTER);
        tfMsg.setBackground(Color.BLACK);
        tfMsg.setForeground(Color.RED);
        tfMsg.setBounds(12, 432, 458, 54);
        contentPane.add(tfMsg);
        tfMsg.setColumns(10);

        bdt = new JTextField();
        bdt.setHorizontalAlignment(SwingConstants.CENTER);
        bdt.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bdt.setColumns(10);
        bdt.setBounds(141, 67, 147, 40);
        contentPane.add(bdt);

        qtr = new JTextField();
        qtr.setHorizontalAlignment(SwingConstants.CENTER);
        qtr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qtr.setColumns(10);
        qtr.setBounds(141, 111, 147, 40);
        contentPane.add(qtr);

        inr = new JTextField();
        inr.setHorizontalAlignment(SwingConstants.CENTER);
        inr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        inr.setColumns(10);
        inr.setBounds(141, 156, 147, 40);
        contentPane.add(inr);

        pkr = new JTextField();
        pkr.setHorizontalAlignment(SwingConstants.CENTER);
        pkr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pkr.setColumns(10);
        pkr.setBounds(141, 200, 147, 40);
        contentPane.add(pkr);

        usd = new JTextField();
        usd.setHorizontalAlignment(SwingConstants.CENTER);
        usd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        usd.setColumns(10);
        usd.setBounds(141, 247, 147, 40);
        contentPane.add(usd);

        hkd = new JTextField();
        hkd.setHorizontalAlignment(SwingConstants.CENTER);
        hkd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        hkd.setColumns(10);
        hkd.setBounds(141, 291, 147, 40);
        contentPane.add(hkd);

        aud = new JTextField();
        aud.setText((String) null);
        aud.setHorizontalAlignment(SwingConstants.CENTER);
        aud.setFont(new Font("Tahoma", Font.PLAIN, 20));
        aud.setColumns(10);
        aud.setBounds(141, 336, 147, 40);
        contentPane.add(aud);

        gbp = new JTextField();
        gbp.setHorizontalAlignment(SwingConstants.CENTER);
        gbp.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbp.setColumns(10);
        gbp.setBounds(141, 380, 147, 40);
        contentPane.add(gbp);

        JLabel lblBritish = new JLabel("British");
        lblBritish.setForeground(Color.WHITE);
        lblBritish.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBritish.setBackground(Color.BLACK);
        lblBritish.setBounds(22, 380, 107, 40);
        contentPane.add(lblBritish);

        JLabel lblAustralia = new JLabel("Australia");
        lblAustralia.setForeground(Color.WHITE);
        lblAustralia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAustralia.setBackground(Color.BLACK);
        lblAustralia.setBounds(22, 336, 107, 40);
        contentPane.add(lblAustralia);

        JLabel lblHongkong = new JLabel("HongKong");
        lblHongkong.setForeground(Color.WHITE);
        lblHongkong.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblHongkong.setBackground(Color.BLACK);
        lblHongkong.setBounds(22, 291, 107, 40);
        contentPane.add(lblHongkong);

        JLabel lblUnitedState = new JLabel("United State");
        lblUnitedState.setForeground(Color.WHITE);
        lblUnitedState.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUnitedState.setBackground(Color.BLACK);
        lblUnitedState.setBounds(22, 247, 107, 40);
        contentPane.add(lblUnitedState);

        JLabel lblPakistan = new JLabel("Pakistan");
        lblPakistan.setForeground(Color.WHITE);
        lblPakistan.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPakistan.setBackground(Color.BLACK);
        lblPakistan.setBounds(22, 200, 107, 40);
        contentPane.add(lblPakistan);

        JLabel lblIndia = new JLabel("India");
        lblIndia.setForeground(Color.WHITE);
        lblIndia.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblIndia.setBackground(Color.BLACK);
        lblIndia.setBounds(22, 156, 107, 40);
        contentPane.add(lblIndia);

        JLabel lblQatar = new JLabel("Qatar");
        lblQatar.setForeground(Color.WHITE);
        lblQatar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblQatar.setBackground(Color.BLACK);
        lblQatar.setBounds(22, 111, 107, 40);
        contentPane.add(lblQatar);

        JLabel lblBangladesh = new JLabel("Bangladesh");
        lblBangladesh.setForeground(Color.WHITE);
        lblBangladesh.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBangladesh.setBackground(Color.BLACK);
        lblBangladesh.setBounds(22, 67, 107, 40);
        contentPane.add(lblBangladesh);

        JLabel lblBdt = new JLabel("BDT");
        lblBdt.setForeground(Color.WHITE);
        lblBdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblBdt.setBackground(Color.BLACK);
        lblBdt.setBounds(294, 67, 55, 40);
        contentPane.add(lblBdt);

        JLabel lblQar = new JLabel("QAR");
        lblQar.setForeground(Color.WHITE);
        lblQar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblQar.setBackground(Color.BLACK);
        lblQar.setBounds(294, 111, 55, 40);
        contentPane.add(lblQar);

        JLabel lblInr = new JLabel("INR");
        lblInr.setForeground(Color.WHITE);
        lblInr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInr.setBackground(Color.BLACK);
        lblInr.setBounds(294, 156, 55, 40);
        contentPane.add(lblInr);

        JLabel lblPkr = new JLabel("PKR");
        lblPkr.setForeground(Color.WHITE);
        lblPkr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPkr.setBackground(Color.BLACK);
        lblPkr.setBounds(294, 200, 55, 40);
        contentPane.add(lblPkr);

        JLabel lblUsd = new JLabel("USD");
        lblUsd.setForeground(Color.WHITE);
        lblUsd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblUsd.setBackground(Color.BLACK);
        lblUsd.setBounds(294, 247, 55, 40);
        contentPane.add(lblUsd);

        JLabel lblHkd = new JLabel("HKD");
        lblHkd.setForeground(Color.WHITE);
        lblHkd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblHkd.setBackground(Color.BLACK);
        lblHkd.setBounds(294, 291, 55, 40);
        contentPane.add(lblHkd);

        JLabel lblAud = new JLabel("AUD");
        lblAud.setForeground(Color.WHITE);
        lblAud.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAud.setBackground(Color.BLACK);
        lblAud.setBounds(294, 336, 55, 40);
        contentPane.add(lblAud);

        JLabel lblGbp = new JLabel("GBP");
        lblGbp.setForeground(Color.WHITE);
        lblGbp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblGbp.setBackground(Color.BLACK);
        lblGbp.setBounds(294, 380, 55, 40);
        contentPane.add(lblGbp);

        JButton btnGbp = new JButton("Check");
        btnGbp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(gbp.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Gbp = Double.parseDouble(gbp.getText());
                    double Usd = Gbp * 0.7736;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Bdt = Usd * 84.47;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String BDT = String.format("%.3f", Bdt);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    bdt.setText(BDT);


                }
            }
        });
        btnGbp.setForeground(Color.YELLOW);
        btnGbp.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGbp.setBackground(new Color(25, 25, 112));
        btnGbp.setBounds(361, 380, 100, 40);
        contentPane.add(btnGbp);

        JButton btnAud = new JButton("Check");
        btnAud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(aud.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Aud = Double.parseDouble(aud.getText());
                    double Usd = Aud * 1.4615;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Bdt = Usd * 84.47;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String BDT = String.format("%.3f", Bdt);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    bdt.setText(BDT);
                    gbp.setText(GBP);


                }
            }
        });
        btnAud.setForeground(Color.YELLOW);
        btnAud.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnAud.setBackground(new Color(25, 25, 112));
        btnAud.setBounds(361, 336, 100, 40);
        contentPane.add(btnAud);

        JButton btnHkd = new JButton("Check");
        btnHkd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(hkd.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Hkd = Double.parseDouble(hkd.getText());
                    double Usd = Hkd * 7.84;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Bdt = Usd * 84.47;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String BDT = String.format("%.3f", Bdt);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    bdt.setText(BDT);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnHkd.setForeground(Color.YELLOW);
        btnHkd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnHkd.setBackground(new Color(25, 25, 112));
        btnHkd.setBounds(361, 291, 100, 40);
        contentPane.add(btnHkd);

        JButton btnUsd = new JButton("Check");
        btnUsd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(usd.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Usd = Double.parseDouble(usd.getText());
                    double Bdt = Usd / 84.47;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String BDT = String.format("%.3f", Bdt);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    bdt.setText(BDT);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnUsd.setForeground(Color.YELLOW);
        btnUsd.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnUsd.setBackground(new Color(25, 25, 112));
        btnUsd.setBounds(361, 247, 100, 40);
        contentPane.add(btnUsd);

        JButton btnPkr = new JButton("Check");
        btnPkr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pkr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Pkr = Double.parseDouble(pkr.getText());
                    double Usd = Pkr * 156.05;
                    double Bdt = Usd * 84.47;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String BDT = String.format("%.3f", Bdt);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    bdt.setText(BDT);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnPkr.setForeground(Color.YELLOW);
        btnPkr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnPkr.setBackground(new Color(25, 25, 112));
        btnPkr.setBounds(361, 200, 100, 40);
        contentPane.add(btnPkr);

        JButton btnInr = new JButton("Check");
        btnInr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(inr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Inr = Double.parseDouble(inr.getText());
                    double Usd = Inr * 70.936;
                    double Pkr = Usd * 0.0064;
                    double Bdt = Usd /84.47;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String BDT = String.format("%.3f", Bdt);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    bdt.setText(BDT);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnInr.setForeground(Color.YELLOW);
        btnInr.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnInr.setBackground(new Color(25, 25, 112));
        btnInr.setBounds(361, 156, 100, 40);
        contentPane.add(btnInr);

        JButton btnQar = new JButton("Check");
        btnQar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(qtr.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Qtr = Double.parseDouble(qtr.getText());
                    double Usd = Qtr * 3.641;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Bdt = Usd / 84.47;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String BDT = String.format("%.3f", Bdt);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    bdt.setText(BDT);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnQar.setForeground(Color.YELLOW);
        btnQar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnQar.setBackground(new Color(25, 25, 112));
        btnQar.setBounds(361, 111, 100, 40);
        contentPane.add(btnQar);

        JButton btnBdt = new JButton("Check");
        btnBdt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(bdt.getText().isEmpty())
                {
                    tfMsg.setText("Your input is Empty !");
                }
                else
                {
                    tfMsg.setText(null);
                    double Bdt = Double.parseDouble(bdt.getText());
                    double Usd = Bdt * 84.47;
                    double Pkr = Usd * 0.0064;
                    double Inr = Pkr * 0.45;
                    double Qtr = Inr * 0.051;
                    double Hkd = Qtr * 0.46;
                    double Aud = Hkd * 5.36;
                    double Gbp = Aud * 1.889;

                    String USD = String.format("%.3f", Usd);
                    String PKR = String.format("%.3f", Pkr);
                    String INR = String.format("%.3f", Inr);
                    String QTR = String.format("%.3f", Qtr);
                    String HKD = String.format("%.3f", Hkd);
                    String AUD = String.format("%.3f", Aud);
                    String GBP = String.format("%.3f", Gbp);

                    usd.setText(USD);
                    pkr.setText(PKR);
                    inr.setText(INR);
                    qtr.setText(QTR);
                    hkd.setText(HKD);
                    aud.setText(AUD);
                    gbp.setText(GBP);


                }
            }
        });
        btnBdt.setForeground(Color.YELLOW);
        btnBdt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnBdt.setBackground(new Color(25, 25, 112));
        btnBdt.setBounds(361, 67, 100, 40);
        contentPane.add(btnBdt);
    }

}
