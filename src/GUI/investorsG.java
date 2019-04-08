package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import stockmarketsimulator.SetUp;

public class investorsG extends JFrame{
	SetUp sU = new SetUp();
	
	public investorsG() {
		
		this.setTitle("View Investors");
		setSize(1000, 1000);
		setVisible(true);
		
		JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Investor ID");
        dtm.addColumn("Budget");
        dtm.addColumn("Type");
       
        dtm.setRowCount(sU.investors.size());
        sU.CreateInvestors();
        Object[] rowData = new Object[4];
        
        
        for(int i=0; i<sU.investors.size(); i++) {     	
        	
        	rowData[0] = sU.investors.get(i).getInvId();
        	rowData[1] = sU.investors.get(i).getBudget();
        	rowData[2] = sU.investors.get(i).getClass().getSimpleName();
        	
        	dtm.addRow(rowData);
        }
        
        table.setModel(dtm);
        
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Investors");             
        this.pack();
        this.setVisible(true);
	}

}
