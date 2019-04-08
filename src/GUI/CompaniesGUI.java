package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import stockmarketsimulator.SetUp;


public class CompaniesGUI extends JFrame{
	SetUp sU = new SetUp();
	
	public CompaniesGUI() {
		
		this.setTitle("View Companies");
		setSize(1000, 1000);
		setVisible(true);
		
		JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
       
        dtm.setRowCount(sU.companies.size());
        sU.CreateCompanies();
        Object[] rowData = new Object[4];
        
        
        for(int i=0; i<sU.companies.size(); i++) {     	
        	
        	rowData[0] = sU.companies.get(i).getId();
        	rowData[1] = sU.companies.get(i).getShare();
        	rowData[2] = sU.companies.get(i).getPrice();
        	rowData[3] = sU.companies.get(i).getClass().getSimpleName();
        	
        	dtm.addRow(rowData);
        }
        
        table.setModel(dtm);
        
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Companies");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
	}

}
