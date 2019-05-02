package GUI;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import company.Company;
import investor.Investor;
import stockmarketsimulator.SetUp;
import stockmarketsimulator.Simulator;


public class TotalTransactions extends JFrame{
	
	Simulator simulator = Simulator.getInstance();
	
	public TotalTransactions() {
		setSize(600, 600);
		setVisible(true); 
        this.setTitle("All Transactions");    
        this.setVisible(true);
        
        JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("TOTAL AMOUNT OF TRANSACTIONS");
       
       
        Object[] rowData = new Object[1];
    
        	rowData[0] = simulator.getTotalTrades();
       	
        	dtm.addRow(rowData);
        
        
        table.setModel(dtm);
        this.add(new JScrollPane(table)); 
        
       
       
	}

}