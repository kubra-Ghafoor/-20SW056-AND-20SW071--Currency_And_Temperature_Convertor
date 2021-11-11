package project;

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

public class Temperature extends JFrame {

    private JPanel contentPane;
    private JTextField c;
    private JTextField f;
    private JTextField k;
    private JTextField tfOut;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Temperature frame = new Temperature();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Temperature() {
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
		button.setBounds(12, 499, 176, 41);
		contentPane.add(button);

        JLabel lblTemperatureConversion = new JLabel("Temperature Conversion");
        lblTemperatureConversion.setHorizontalAlignment(SwingConstants.CENTER);
        lblTemperatureConversion.setForeground(Color.WHITE);
        lblTemperatureConversion.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblTemperatureConversion.setBounds(12, 13, 458, 54);
        contentPane.add(lblTemperatureConversion);

        JButton button_1 = new JButton("Exit");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_1.setBackground(Color.RED);
        button_1.setBounds(341, 499, 129, 41);
        contentPane.add(button_1);

        c = new JTextField();
        c.setForeground(new Color(25, 25, 112));
        c.setFont(new Font("Tahoma", Font.BOLD, 20));
        c.setHorizontalAlignment(SwingConstants.CENTER);
        c.setBounds(48, 94, 200, 50);
        contentPane.add(c);
        c.setColumns(10);

        f = new JTextField();
        f.setHorizontalAlignment(SwingConstants.CENTER);
        f.setForeground(new Color(25, 25, 112));
        f.setFont(new Font("Tahoma", Font.BOLD, 20));
        f.setColumns(10);
        f.setBounds(48, 330, 200, 50);
        contentPane.add(f);

        JLabel lblc = new JLabel("\u00B0c ");
        lblc.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblc.setForeground(Color.WHITE);
        lblc.setBounds(260, 94, 59, 46);
        contentPane.add(lblc);

        JLabel lblf = new JLabel("\u00B0F");
        lblf.setForeground(Color.WHITE);
        lblf.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblf.setBounds(260, 327, 59, 46);
        contentPane.add(lblf);

        k = new JTextField();
        k.setHorizontalAlignment(SwingConstants.CENTER);
        k.setForeground(new Color(25, 25, 112));
        k.setFont(new Font("Tahoma", Font.BOLD, 20));
        k.setColumns(10);
        k.setBounds(48, 217, 200, 50);
        contentPane.add(k);

        JLabel lblk = new JLabel("\u00B0k");
        lblk.setForeground(Color.WHITE);
        lblk.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblk.setBounds(260, 217, 59, 46);
        contentPane.add(lblk);

        JButton btnC = new JButton("Convert");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(c.getText().isEmpty())
                {
                    tfOut.setText("Please  Check your input");
                }

                else
                {
                    tfOut.setText(null);
                    double cel = Double.parseDouble(c.getText());
                    double fa = cel * 1.8 +32;
                    double ke = cel+273.15;
                    String far = String.format("%.2f",fa);
                    String kel = String.format("%.2f", ke);
                    k.setText(kel);
                    f.setText(far);
                }



            }
        });
        btnC.setForeground(new Color(255, 255, 0));
        btnC.setBackground(new Color(25, 25, 112));
        btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnC.setBounds(318, 94, 100, 50);
        contentPane.add(btnC);

        JButton btnK = new JButton("Convert");
        btnK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(k.getText().isEmpty())
                {
                    tfOut.setText("Please  Check your input");
                }

                else
                {
                    tfOut.setText(null);
                    double kel = Double.parseDouble(k.getText());
                    double fa =(kel - 273.15) * 1.8 + 32;
                    double ce = kel - 273.15;

                    String far = String.format("%.2f", fa);
                    String cel = String.format("%.2f", ce);

                    f.setText(far);
                    c.setText(cel);
                }



            }
        });
        btnK.setForeground(Color.YELLOW);
        btnK.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnK.setBackground(new Color(25, 25, 112));
        btnK.setBounds(318, 217, 100, 50);
        contentPane.add(btnK);

        JButton btnF = new JButton("Convert");
        btnF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(f.getText().isEmpty())
                {
                    tfOut.setText("Please  Check your input");
                }

                else
                {
                    tfOut.setText(null);
                    double far = Double.parseDouble(f.getText());
                    double ke = (far - 32) * 5/9 + 273.15;
                    double ce = ke -273.15;
                    String kel = String.format("%.2f", ke);
                    String cel = String.format("%.2f", ce);

                    k.setText(kel);
                    c.setText(cel);
                }


            }
        });
        btnF.setForeground(Color.YELLOW);
        btnF.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnF.setBackground(new Color(25, 25, 112));
        btnF.setBounds(318, 330, 100, 50);
        contentPane.add(btnF);

        JButton clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setText(null);
                k.setText(null);
                f.setText(null);
                tfOut.setText(null);
            }
        });
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        clear.setBackground(new Color(0, 100, 0));
        clear.setBounds(200, 499, 129, 41);
        contentPane.add(clear);

        tfOut = new JTextField();
        tfOut.setForeground(Color.RED);
        tfOut.setBackground(Color.BLACK);
        tfOut.setFont(new Font("Tahoma", Font.PLAIN, 19));
        tfOut.setBounds(48, 410, 370, 54);
        contentPane.add(tfOut);
        tfOut.setColumns(10);
    }
}