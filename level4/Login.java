package level4;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	Font myfont = new Font("Britannic Bold",Font.BOLD,30);
	Font myf = new Font("Arial Narrow",Font.BOLD,18);
	Font myf1 = new Font("Arial Black",Font.ITALIC,15);
	Login(){
		setLayout(null);
		setTitle("Sakthi's Java login");
		
		l1=new JLabel("LOGIN FORM");
		l1.setFont(myfont);
		l2=new JLabel("Enter Username");
		l3=new JLabel("Enter Password");
		l2.setFont(myf);
		l3.setFont(myf);
		t1=new JTextField(20);
		p1=new JPasswordField(20);
		b1 = new JButton("Submit");
		b2 = new JButton("Reset");
		b1.setFont(myf1);
		b2.setFont(myf1);
		l1.setBounds(220,20,200,40);
		l2.setBounds(50,100,200,30);
		l3.setBounds(50,150,200,30);
		t1.setBounds(200, 100, 200, 30);
		p1.setBounds(200,150,200,30);
		b1.setBounds(150, 210, 130, 30);
		b2.setBounds(300, 210, 130, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(l1); add(l2);add(l3);
		add(t1);add(p1);
		add(b1);add(b2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new Login();
		f1.setSize(700,500);
		f1.setEnabled(true);
		f1.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			if (t1.getText().equals("sakthi")&& p1.getText().equals("12345"))
			{
				//JOptionPane.showMessageDialog(this, "valid user ,Welcome");
				this.setVisible(false);
				JFrame f2=new Simplegui();
				f2.setSize(700,500);
				f2.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid user/password!");
			}
		}
		else
		{
		t1.setText("");
		p1.setText("");
		t1.requestFocus();
			
		
		}
	
		
	}
	
	
}
