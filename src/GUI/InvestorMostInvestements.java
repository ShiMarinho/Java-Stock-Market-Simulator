/*
 * All Investor GUI that returns a JTable the information of the Investor which invested in the most companies 
 * investor id, budget, investor type, total amount of shares bought
 * capital total and number of shares sold. 
 *
 */

package GUI;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import stockmarketsimulator.Simulator;


public class InvestorMostInvestements extends JFrame {
    
	Simulator simulator = Simulator.getInstance();

    public InvestorMostInvestements() {
    	setSize(200, 200);
		setVisible(true); 
        this.setTitle("All Transaction");    
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("INVESTOR THAT INVESTED IN LEAST COMPANIES");
       
        
       
        Object[] rowData = new Object[1];
        	/**
        	 *getMostCommon() method from the Simulator is called, which returns the the investor with the least
        	 *occurence in the Hashmap that stores the transactions
        	 * */
        
        	rowData[0] = simulator.getMostCommon();
       	
        	dtm.addRow(rowData);
        
        
        table.setModel(dtm);
        this.add(new JScrollPane(table)); 
        
    }

}