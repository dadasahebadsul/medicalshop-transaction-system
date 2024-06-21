import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class deletemedi implements ActionListener
{
    JFrame f1;
	JLabel l1;
	JTextField tf1;
	JButton b1,b2;
	public static void delete() 
	{
		deletemedi obj=new deletemedi();
	}
	deletemedi()
	{
		
		f1=new JFrame();
		f1.setSize(350,250);
		f1.setLayout(null);
		f1.setLocationRelativeTo(null);
        f1.getContentPane().setBackground(Color.pink);

        
		l1=new JLabel("ID :-");
		l1.setBounds(30,30,80,25);
    	l1.setFont (new Font("Arial",Font.BOLD,25));
        f1.add(l1);
        
        tf1=new JTextField();
        tf1.setBounds(100,30,200,25);
		f1.add(tf1);
        
        
        b1=new JButton("ok");
        b1.setBounds(70,80,90,28);
        b1.addActionListener(this);
        f1.add(b1);
        
        
        b2=new JButton("Cancle");
        b2.setBounds(180,80,90,28);
        b2.addActionListener(this);
        f1.add(b2);
		
		f1.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		Object ob=e.getSource();
		if(ob==b2)
		f1.dispose();
		else
			if(ob==b1)
				DisplyAllRecords.display(tf1.getText());
	
		f1.dispose();
				
			
	}

}
