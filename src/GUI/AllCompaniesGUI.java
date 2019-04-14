package GUI;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import company.Company;
import stockmarketsimulator.SetUp;


public class AllCompaniesGUI extends JFrame{
	
	SetUp sU = new SetUp();
	
	
	public AllCompaniesGUI() {
		setSize(600, 600);
		setVisible(true); 
        this.setTitle("All Companies");    
        this.setVisible(true);
        
        JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
        dtm.addColumn("Capital Total");
       
        Object[] rowData = new Object[5];  

        for(int i=0; i<sU.companies.size(); i++) {     	
        	
        	rowData[0] = sU.companies.get(i).getId();
        	rowData[1] = sU.companies.get(i).getShare();
        	rowData[2] = sU.companies.get(i).getPrice();
        	rowData[3] = sU.companies.get(i).getClass().getSimpleName();
        	rowData[4] = sU.companies.get(i).getPrice() * sU.companies.get(i).getShare();
        	
        	dtm.addRow(rowData);
        }
        
        table.setModel(dtm);
        this.add(new JScrollPane(table));
        
       
	}

}
