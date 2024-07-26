package All_GUIs_Are_One;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit_Utilization extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JTextField textField3;
    private JLabel lblNewLabel_5;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel lblNewLabel_6;
    private JTextField textField7;
    private JTextField textField8;
    private JLabel lblNewLabel_7;
    private JTextField textField13;
    private JTextField textField4;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Credit_Utilization frame = new Credit_Utilization();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Credit_Utilization() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 440, 409);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(106, 90, 205));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Credit Utilization");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblNewLabel.setBounds(118, 10, 170, 37);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Credit Card 1:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(23, 96, 115, 21);
        contentPane.add(lblNewLabel_1);

        textField1 = new JTextField();
        textField1.setBounds(137, 98, 76, 19);
        contentPane.add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setColumns(10);
        textField2.setBounds(238, 98, 76, 19);
        contentPane.add(textField2);

        lblNewLabel_2 = new JLabel("Balance");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(144, 67, 69, 21);
        contentPane.add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("Limit");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(254, 67, 47, 21);
        contentPane.add(lblNewLabel_3);

        lblNewLabel_4 = new JLabel("Credit Card 2:");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(23, 136, 115, 21);
        contentPane.add(lblNewLabel_4);

        textField3 = new JTextField();
        textField3.setColumns(10);
        textField3.setBounds(137, 138, 76, 19);
        contentPane.add(textField3);

        textField4 = new JTextField();
        textField4.setColumns(10);
        textField4.setBounds(238, 138, 76, 19);
        contentPane.add(textField4);

        lblNewLabel_5 = new JLabel("Credit Card 3:");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(23, 180, 115, 21);
        contentPane.add(lblNewLabel_5);

        textField5 = new JTextField();
        textField5.setColumns(10);
        textField5.setBounds(137, 182, 76, 19);
        contentPane.add(textField5);

        textField6 = new JTextField();
        textField6.setColumns(10);
        textField6.setBounds(238, 182, 76, 19);
        contentPane.add(textField6);

        lblNewLabel_6 = new JLabel("Credit Card 4:");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_6.setBounds(23, 226, 115, 21);
        contentPane.add(lblNewLabel_6);

        textField7 = new JTextField();
        textField7.setColumns(10);
        textField7.setBounds(137, 228, 76, 19);
        contentPane.add(textField7);

        textField8 = new JTextField();
        textField8.setColumns(10);
        textField8.setBounds(238, 228, 76, 19);
        contentPane.add(textField8);

        JButton button1 = new JButton("Enter");

        button1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button1.setBounds(23, 281, 85, 21);
        contentPane.add(button1);

        JButton button2 = new JButton("Clear");
        button2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        button2.setBounds(298, 281, 85, 21);
        contentPane.add(button2);

        lblNewLabel_7 = new JLabel("Total Utilization:");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_7.setBounds(66, 326, 127, 21);
        contentPane.add(lblNewLabel_7);

        textField13 = new JTextField();
        textField13.setColumns(10);
        textField13.setBounds(203, 328, 76, 19);
        contentPane.add(textField13);

        JLabel lblNewLabel_3_1 = new JLabel("%");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblNewLabel_3_1.setBounds(344, 67, 31, 21);
        contentPane.add(lblNewLabel_3_1);

        textField9 = new JTextField();
        textField9.setBackground(new Color(0, 0, 0));
        textField9.setEnabled(false);
        textField9.setColumns(10);
        textField9.setBounds(329, 98, 54, 19);
        contentPane.add(textField9);

        textField10 = new JTextField();
        textField10.setBackground(new Color(0, 0, 0));
        textField10.setEnabled(false);
        textField10.setColumns(10);
        textField10.setBounds(329, 138, 54, 19);
        contentPane.add(textField10);

        textField11 = new JTextField();
        textField11.setBackground(new Color(0, 0, 0));
        textField11.setEnabled(false);
        textField11.setColumns(10);
        textField11.setBounds(329, 182, 54, 19);
        contentPane.add(textField11);

        textField12 = new JTextField();
        textField12.setBackground(new Color(0, 0, 0));
        textField12.setEnabled(false);
        textField12.setColumns(10);
        textField12.setBounds(329, 228, 54, 19);
        contentPane.add(textField12);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double creditBal1 = Double.parseDouble(textField1.getText());
                double creditBal2 = Double.parseDouble(textField3.getText());
                double creditBal3 = Double.parseDouble(textField5.getText());
                double creditBal4 = Double.parseDouble(textField7.getText());

                double creditLim1 = Double.parseDouble(textField2.getText());
                double creditLim2 = Double.parseDouble(textField4.getText());
                double creditLim3 = Double.parseDouble(textField6.getText());
                double creditLim4 = Double.parseDouble(textField8.getText());

                double totalBal = creditBal1 + creditBal2 + creditBal3 + creditBal4;
                double totalLim = creditLim1 + creditLim2 + creditLim3 + creditLim4;

                double totalUtil = (totalBal / totalLim) * 100;
                
                if (totalUtil > 30 && totalUtil < 60) {
                	textField13.setBackground(Color.orange);
                	JOptionPane.showMessageDialog(null, "You got to do better.");
                } else if (totalUtil > 60) {
					textField13.setBackground(Color.red);
					JOptionPane.showMessageDialog(null, "This is unacceptable:(");
				} else {
					textField13.setBackground(Color.green);
					JOptionPane.showMessageDialog(null, "Keep up the good work!");
				}

                textField13.setText(String.format("%.2f%%", totalUtil));
                textField13.setHorizontalAlignment(JTextField.CENTER);

                textField9.setText(String.format("%.2f%%", (creditBal1 / creditLim1) * 100));
                textField9.setHorizontalAlignment(JTextField.CENTER);

                textField10.setText(String.format("%.2f%%", (creditBal2 / creditLim2) * 100));
                textField10.setHorizontalAlignment(JTextField.CENTER);

                textField11.setText(String.format("%.2f%%", (creditBal3 / creditLim3) * 100));
                textField11.setHorizontalAlignment(JTextField.CENTER);

                textField12.setText(String.format("%.2f%%", (creditBal4 / creditLim4) * 100));
                textField12.setHorizontalAlignment(JTextField.CENTER);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField11.setText("");
                textField12.setText("");
                textField13.setText("");
            }
        });
    }
}
