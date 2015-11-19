
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JavaFX {

private JFrame frame;
private JTextField textField;
private JLabel lbl1;
private JLabel lbl2;
private JButton btnC;
private JLabel lbl3;
private JTextField textField1;
private JLabel lbl4;
private JComboBox cB;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
JavaFX window = new JavaFX();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
 * @return 
*/
public void GUIs() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 571, 337);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
lbl2 = new JLabel("What is your name:");
lbl2.setBounds(13, 11, 155, 20);
lbl2.setFont(new Font("Time New Roman", Font.PLAIN, 11));
frame.getContentPane().add(lbl2);
textField = new JTextField();
textField.setBounds(205, 10, 194, 21);
frame.getContentPane().add(textField);
textField.setColumns(10);
JButton btnEnter = new JButton("Enter:");
btnEnter.setBounds(48, 150, 88, 24);
btnEnter.addMouseListener(new MouseAdapter() {
});
btnEnter.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) { 
lbl1.setText("Nice to meet you "+ textField.getText()+ " and you are " + textField1.getText()+ " years old "
+ "and you said " + cB.getSelectedItem() +" to being in Year Up.");
}
});
frame.getContentPane().add(btnEnter);
lbl1 = new JLabel("");
lbl1.setBounds(10, 217, 545, 85);
frame.getContentPane().add(lbl1);
JButton btnClear = new JButton("Clear");
btnClear.setBounds(272, 151, 89, 23);
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField.setText("");
textField1.setText("");
lbl1.setText("");
cB.setSelectedItem("Yes");
}
});
frame.getContentPane().add(btnClear);
lbl3 = new JLabel("How Old are You:");
lbl3.setBounds(10, 54, 141, 33);
lbl3.setFont(new Font("Time New Roman", Font.PLAIN, 11));
frame.getContentPane().add(lbl3);
textField1 = new JTextField();
textField1.setBounds(204, 60, 195, 20);
frame.getContentPane().add(textField1);
textField1.setColumns(10);
lbl4 = new JLabel("Are you are in Year Up:");
lbl4.setBounds(10, 98, 182, 33);
lbl4.setFont(new Font("Time New Roman", Font.PLAIN, 11));
frame.getContentPane().add(lbl4);
cB = new JComboBox();
cB.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
cB.setBounds(204, 104, 187, 20);
frame.getContentPane().add(cB);
}
}