import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class View_all_medicine
{
	static JFrame f=new JFrame("Database Records");
	static DefaultTableModel dtmmedicine;
	static JTable tbmedicine;
	static JScrollPane jspTable;

	static void populateArray (String rows[][])
	{
		JPanel jpShow = new JPanel ();

		int row = 0;
		int total = 0;

		f.setSize (675, 280);
		f.setLocation(200,200);

		tbmedicine = makeTable (rows);
		jspTable = new JScrollPane (tbmedicine);
		jspTable.setBounds (20, 20, 625, 200);

		jpShow.add (jspTable);
		jpShow.setLayout (null);

		f.getContentPane().add (jpShow);
        f.setAlwaysOnTop(true);
		f.setVisible (true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
				Frame1 obj1 = new Frame1();
			}
		}
	  );
	}

	private static JTable makeTable (String rowData[][])
	{
		String cols[] = {"ID.", "Name", "companyname","price","quantity","ex_date","mfg_date"};

		dtmmedicine  = new DefaultTableModel (rowData, cols);

		tbmedicine = new JTable (dtmmedicine)
		{
			public boolean isCellEditable (int iRow, int iCol)
			{
				return false;	//Disable All Columns of Table.
			}
		};
		(
		tbmedicine.getColumnModel().getColumn(0)).setPreferredWidth (80);
		(tbmedicine.getColumnModel().getColumn(1)).setPreferredWidth (180);
		(tbmedicine.getColumnModel().getColumn(2)).setPreferredWidth (100);
		(tbmedicine.getColumnModel().getColumn(3)).setPreferredWidth (100);
		(tbmedicine.getColumnModel().getColumn(4)).setPreferredWidth (100);
		(tbmedicine.getColumnModel().getColumn(5)).setPreferredWidth (100);
		(tbmedicine.getColumnModel().getColumn(6)).setPreferredWidth (100);
		
		tbmedicine.setRowHeight (25);
		
		tbmedicine.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
		return tbmedicine;
	}

}