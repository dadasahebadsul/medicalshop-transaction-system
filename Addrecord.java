import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class Addrecord implements ActionListener
{
    JFrame f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JButton b1,b2;
	JDateChooser dc1,dc2;
	
	public static void allrecord()
	{
		Addrecord obj=new Addrecord();
	}
    Addrecord()
    {
    	f1=new JFrame();
    	f1.setSize(500,700);
    	f1.setLayout(null);
    	f1.setLocationRelativeTo(null);
        f1.getContentPane().setBackground(Color.pink);

    	
    	
    	l1=new JLabel("Medicine Record");
    	l1.setBounds(120,20,300,30);
    	l1.setFont (new Font("Arial",Font.BOLD,28));
        f1.add(l1);
    	

    	l2=new JLabel("ID :-");
    	l2.setBounds(30,80,40,30);
    	l2.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l2);
        
        
        tf1=new JTextField();
        tf1.setBounds(150,80,250,25);
		f1.add(tf1);
    	
        

    	l3=new JLabel("Name :-");
    	l3.setBounds(30,130,90,30);
    	l3.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l3);
    	
        tf2=new JTextField();
        tf2.setBounds(150,130,250,25);
		f1.add(tf2);
        


    	l4=new JLabel("company name:-");
    	l4.setBounds(30,180,150,30);
    	l4.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l4);
    	
        tf3=new JTextField();
        tf3.setBounds(150,180,250,25);
		f1.add(tf3);
        

    	l5=new JLabel("Price :-");
    	l5.setBounds(30,230,90,30);
    	l5.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l5);
        
        tf4=new JTextField();
        tf4.setBounds(150,230,250,25);
		f1.add(tf4);


    	l6=new JLabel("Quantity :-");
    	l6.setBounds(30,280,170,30);
    	l6.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l6);
    	
        tf5=new JTextField();
        tf5.setBounds(150,280,250,25);
		f1.add(tf5);
        
		l7=new JLabel("expiry date:-");
    	l7.setBounds(30,320,170,30);
    	l7.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l7);
        
        dc1 = new JDateChooser();
      		dc1.setBounds(150,320,180,30);
      		dc1.setForeground(new Color(105, 105, 105));
      		f1.add(dc1);
        
      		l8=new JLabel("mfg date:-");
        	l8.setBounds(30,370,170,30);
        	l8.setFont (new Font("Arial",Font.BOLD,20));
            f1.add(l8);
            
            dc2 = new JDateChooser();
      		dc2.setBounds(150,370,180,30);
      		dc2.setForeground(new Color(105, 105, 105));
      		f1.add(dc2);  
        
        b1=new JButton("Save");
        b1.setBounds(80,500,150,25);
    	b1.setFont (new Font("Arial",Font.BOLD,25));
    	b1.addActionListener(this);
        f1.add(b1);
        
        
        b2=new JButton("cancle");
        b2.setBounds(250,500,150,25);
    	b2.setFont (new Font("Arial",Font.BOLD,25));
    	b2.addActionListener(this);
        f1.add(b2);
        
      
        
       

        f1.setVisible(true);
    
    }
	
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==b2)
			f1.dispose();
		else 
			if(ob==b1)
			{
				String ex_date = ((JTextField) dc1.getDateEditor().getUiComponent()).getText();
				System.out.println(ex_date);
				SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");

				String str = formatter.format(new Date(ex_date));
				System.out.println(str);
				
				String mfg_date = ((JTextField) dc2.getDateEditor().getUiComponent()).getText();
				System.out.println(mfg_date);
				SimpleDateFormat formatter1 = new SimpleDateFormat("dd MM yyyy");

				String stri = formatter.format(new Date(mfg_date));
				System.out.println(stri);
				InsertIntoDatabase.insert(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText(),str,stri); 
				
			}
		f1.dispose();
		Frame1 obj = new Frame1();
	}

}
