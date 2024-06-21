import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;

public class view_one_user_for_sbyid  implements ActionListener
{
	static JFrame f2=new JFrame("Database Records");

	 JPanel jpRec = new JPanel();

	 JLabel lbid;
	 JLabel lbName;
	 JLabel lbcompanyname;
	 JLabel lbprice;
	 JLabel lbquantity;
	 JLabel lbex_date;
	 JLabel lbmfg_date;

	 JTextField txtid;
	 JTextField txtName;
	 JTextField txtcompanyname;
	 JTextField txtprice;
	 JTextField txtquantity;
	 JTextField txtex_date;
	 JTextField txtmfg_date;
	 JTextField txtRec;

   static JButton btnokk;
	
	

	 int recCount = 0;
		int total = DisplyAllRecords.row;

	void populateArray ()
	{
		System.out.println("populateArray");
		
		f2.setSize (500, 400);
		f2.setBackground(Color.GRAY);
		f2.setResizable(false);
		f2.setLocationRelativeTo(null);

		jpRec.setLayout (null);

		lbid = new JLabel ("ID :-");
		lbid.setForeground (Color.black);
		lbid.setBounds (15, 20, 80, 25);

        lbName = new JLabel ("Name:");
		lbName.setForeground (Color.black);
        lbName.setBounds (15, 55, 80, 25);

		lbcompanyname = new JLabel ("company name:-");
		lbcompanyname.setForeground (Color.black);
		lbcompanyname.setBounds (15, 90, 100, 25);
		
		lbprice = new JLabel ("price:-");
		lbprice.setForeground (Color.black);
		lbprice.setBounds (15, 125, 100, 25);
		
		lbquantity = new JLabel ("quantity:-");
		lbquantity.setForeground (Color.black);
		lbquantity.setBounds (15, 160, 100, 25);
		
		lbex_date = new JLabel ("ex_date:-");
		lbex_date.setForeground (Color.black);
		lbex_date.setBounds (15, 195, 100, 25);
		
		lbmfg_date = new JLabel ("mfg_date:-");
		lbmfg_date.setForeground (Color.black);
		lbmfg_date.setBounds (15, 230, 100, 25);

		txtid = new JTextField ();
		txtid.setFont(new Font("Arial",Font.BOLD,20));
		txtid.setHorizontalAlignment (JTextField.CENTER);
		txtid.setBounds (125, 20, 200, 25);
		txtid.setEnabled(false);

		txtName = new JTextField ();
		txtName.setFont(new Font("Arial",Font.BOLD,20));
		txtName.setHorizontalAlignment (JTextField.CENTER);
		txtName.setEnabled (false);
		txtName.setBounds (125, 55, 200, 25);

		txtcompanyname = new JTextField ();
		txtcompanyname.setFont(new Font("Arial",Font.BOLD,20));
		txtcompanyname.setHorizontalAlignment (JTextField.CENTER);
		txtcompanyname.setEnabled (false);
		txtcompanyname.setBounds (125, 90, 200, 25);
		
		txtprice = new JTextField ();
		txtprice.setFont(new Font("Arial",Font.BOLD,20));
		txtprice.setHorizontalAlignment (JTextField.CENTER);
		txtprice.setEnabled (false);
		txtprice.setBounds (125, 125, 200, 25);
		
		txtquantity = new JTextField ();
		txtquantity.setFont(new Font("Arial",Font.BOLD,20));
		txtquantity.setHorizontalAlignment (JTextField.CENTER);
		txtquantity.setEnabled (false);
		txtquantity.setBounds (125, 160, 200, 25);
		
		txtex_date = new JTextField ();
		txtex_date.setFont(new Font("Arial",Font.BOLD,20));
		txtex_date.setHorizontalAlignment (JTextField.CENTER);
		txtex_date.setEnabled (false);
		txtex_date.setBounds (125, 195, 200, 25);
		
		txtmfg_date = new JTextField ();
		txtmfg_date.setFont(new Font("Arial",Font.BOLD,20));
		txtmfg_date.setHorizontalAlignment (JTextField.CENTER);
		txtmfg_date.setEnabled (false);
		txtmfg_date.setBounds (125, 230, 200, 25);

		btnokk = new JButton ("ohkk");
		btnokk.setBounds (100, 265, 100, 40);
		btnokk.addActionListener (this);

		

		
		txtRec = new JTextField ();
		txtRec.setEnabled (false);
		txtRec.setHorizontalAlignment (JTextField.CENTER);
		txtRec.setBounds (130, 200, 70, 25);

		jpRec.add (lbid);
		jpRec.add (txtid);
		jpRec.add (lbName);
		jpRec.add (txtName);
		jpRec.add (lbcompanyname);
		jpRec.add (txtcompanyname);
		jpRec.add (lbprice);
		jpRec.add (txtprice);
		jpRec.add (lbquantity);
		jpRec.add (txtquantity);
		jpRec.add (lbex_date);
		jpRec.add (txtex_date);
		jpRec.add (lbmfg_date);
		jpRec.add (txtmfg_date);
		jpRec.add (btnokk);
		
		
		jpRec.add (txtRec);

		f2.getContentPane().add (jpRec);

		showRec (0);

		f2.setVisible (true);
	}

	/*public void actionPerformed (ActionEvent ae)
	{
		
		Object obj = ae.getSource();
		System.out.println("close");
		if (obj == btnokk)
		{
			
			f2.dispose();
			Frame1 obj1 = new Frame1();
		}
		
	}*/

	public void showRec (int intRec)
	{
		txtid.setText (display_for_sbyid.rows[intRec][0]);
		txtName.setText (display_for_sbyid.rows[intRec][1]);
		txtcompanyname.setText (display_for_sbyid.rows[intRec][2]);
		txtprice.setText (display_for_sbyid.rows[intRec][3]);
		txtquantity.setText (display_for_sbyid.rows[intRec][4]);
		txtex_date.setText (display_for_sbyid.rows[intRec][5]);
		txtmfg_date.setText (display_for_sbyid.rows[intRec][6]);

		if (total == 0)
			txtRec.setText (intRec + "/" + total); //Showing Record No. and Total Records.
		else
			txtRec.setText ((intRec + 1) + "/" + total); //Showing Record No. and Total Records.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		System.out.println("close");
		if (obj == btnokk)
		{
			f2.dispose();
			Frame1 obj1 = new Frame1();
		}
		
	}
}



