import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class sbyId implements ActionListener
{
    JFrame f1;
	JLabel l1;
	JTextField tf1;
	JButton b1,b2;
	public static void id() 
	{
		sbyId obj=new sbyId();
	}
	sbyId()
	{
		
		f1=new JFrame();
		f1.setSize(350,250);
		f1.setLayout(null);
		f1.setLocationRelativeTo(null);
        f1.getContentPane().setBackground(Color.pink);

        
		l1=new JLabel("-: Search by ID :-");
		l1.setBounds(50,20,250,25);
    	l1.setFont (new Font("Arial",Font.BOLD,23));
        f1.add(l1);
        
        tf1=new JTextField();
        tf1.setBounds(60,50,200,25);
		f1.add(tf1);
        
        
        b1=new JButton("search");
        b1.setBounds(60,100,90,28);
        b1.addActionListener(this);
        f1.add(b1);
        
        
        b2=new JButton("Cancle");
        b2.setBounds(180,100,90,28);
        b2.addActionListener(this);
        f1.add(b2);
		
		f1.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f1.dispose();
		Object ob=e.getSource();
		if(ob==b2)
		f1.dispose();
		else
			if(ob==b1)
				display_for_sbyid.display3(tf1.getText());
	}

}