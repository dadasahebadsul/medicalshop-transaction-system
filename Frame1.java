import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;


public class Frame1 implements ActionListener
{
	
	
 JFrame f1;
 JProgressBar br;
 JLabel l1,l2,l3;
 JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;
 JButton b1;
 JButton b2;
 
	
	public static void main(String[] args) 
	{
		Frame1 obj = new Frame1();
	}
	Frame1()
	{
		
    f1=new JFrame();
    f1.setSize(600,750);
    f1.setLocationRelativeTo(null);
    f1.setLayout(null);
    f1.getContentPane().setBackground(Color.pink);
    
    
   
    br=new JProgressBar();
    br.setBounds(40,50,480,40);
    br.setOrientation(0);
    br.setBackground(Color.orange);
    br.setFont(new Font("Times of Roman ",Font.BOLD,40));
    br.setForeground(Color.blue);
    br.setIndeterminate(true);
    br.setString("   -: SK MEDICAL :-   ");
    br.setStringPainted(true);
    f1.add(br);
    
    
    l1=new JLabel("   -: SK MEDICAL :-   ");
    l1.setBounds(40,50,480,40);
    f1.add(l1);
    
    
    l2=new JLabel();
    Image img=new ImageIcon (this.getClass().getResource("/th1.jpg")).getImage();
    l2.setIcon(new ImageIcon(img));
    l2.setBounds(100,400,300,300);
    f1.add(l2);
    
    
    l3=new JLabel();
    Image imgs=new ImageIcon (this.getClass().getResource("/m2.jpg")).getImage();
    l3.setIcon(new ImageIcon(imgs));
    l3.setBounds(300,400,300,300);
    f1.add(l3);
    
    rb1=new JRadioButton("Add Records");
    rb1.setBounds(50,150,170,23);
	rb1.setFont (new Font("Arial",Font.BOLD,23));
	rb1.setForeground(Color.white);
    rb1.setBackground(Color.GRAY);
	rb1.addActionListener(this);
    f1.add(rb1);
    
    
    rb2=new JRadioButton("Delete Medicine");
    rb2.setBounds(280,150,220,23);
	rb2.setFont (new Font("Arial",Font.BOLD,23));
	rb2.setForeground(Color.white);
    rb2.setBackground(Color.GRAY);
	rb2.addActionListener(this);
    f1.add(rb2);
    
    rb3=new JRadioButton("Search by name");
    rb3.setBounds(50,210,210,23);
	rb3.setFont (new Font("Arial",Font.BOLD,23));
	rb3.setForeground(Color.white);
    rb3.setBackground(Color.GRAY);
	rb3.addActionListener(this);
    f1.add(rb3);
    
    rb4=new JRadioButton("Search by Id");
    rb4.setBounds(50,270,210,23);
	rb4.setFont (new Font("Arial",Font.BOLD,23));
	rb4.setForeground(Color.white);
    rb4.setBackground(Color.GRAY);
	rb4.addActionListener(this);
    f1.add(rb4);
    
    rb5=new JRadioButton("Update Medicine");
    rb5.setBounds(120,330,250,23);
	rb5.setFont (new Font("Arial",Font.BOLD,23));
	rb5.setForeground(Color.white);
    rb5.setBackground(Color.GRAY);
	rb5.addActionListener(this);
    f1.add(rb5);
    
    
    rb6=new JRadioButton("Display All");
    rb6.setBounds(280,210,230,23);
	rb6.setFont (new Font("Arial",Font.BOLD,23));
	rb6.setForeground(Color.white);
    rb6.setBackground(Color.GRAY);
	rb6.addActionListener(this);
    f1.add(rb6);
    
    
    rb7=new JRadioButton("Display Expired");
    rb7.setBounds(280,270,230,23);
	rb7.setFont (new Font("Arial",Font.BOLD,23));
	rb7.setForeground(Color.white);
    rb7.setBackground(Color.GRAY);
	rb7.addActionListener(this);
    f1.add(rb7);
   /* 
    b1=new JButton("ENTER");
    b1.setBounds(140,400,150,25);
	b1.setFont (new Font("Arial",Font.BOLD,25));
	b1.addActionListener(this);
    f1.add(b1);
    
    
    b2=new JButton("Close");
    b2.setBounds(300,400,150,25);
	b2.setFont (new Font("Arial",Font.BOLD,25));
	b2.addActionListener(this);
    f1.add(b2);
    */
    
    f1.setVisible(true);

    
	}

	
	public void actionPerformed(ActionEvent e) {
		f1.dispose();
				
		Object ob=e.getSource();
		if(ob==b2)
		f1.dispose();
		else
			if(ob==rb1)
				Addrecord.allrecord();
			else
				if(ob==rb2)
					deletemedi.delete();
				else
					if(ob==rb3)
						sbyname.search();
					else
						if(ob==rb4)
							sbyId.id();
						else
							if(ob==rb7)
						        display_expired_data.display1();
							else if(ob==rb6)
								display_all_medicine_record.display4() ;
							else if(ob==rb5)
								update_id.updateid();
						
						
							
					
	}

}
