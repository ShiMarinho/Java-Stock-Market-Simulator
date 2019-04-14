package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import stockmarketsimulator.SetUp;

public class AllInvestorsGUI extends JFrame{
	
	SetUp sU = new SetUp();
	
	public AllInvestorsGUI() {
		setSize(600, 600);
		setVisible(true); 
        this.setTitle("All Investors");    
        this.setVisible(true);
		
		JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Investor ID");
        dtm.addColumn("Budget");
        dtm.addColumn("Type");
       
        Object[] rowData = new Object[4];        
        
        for(int i=0; i<sU.investors.size(); i++) {     	
        	
        	rowData[0] = sU.investors.get(i).getInvId();
        	rowData[1] = sU.investors.get(i).getBudget();
        	rowData[2] = sU.investors.get(i).getClass().getSimpleName();
        	
        	dtm.addRow(rowData);
        }
        
        table.setModel(dtm);       
        this.add(new JScrollPane(table));
        
	}

}
