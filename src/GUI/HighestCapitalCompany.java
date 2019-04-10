package GUI;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import company.Company;
import stockmarketsimulator.SetUp;


public class HighestCapitalCompany extends JFrame{
	SetUp sU = new SetUp();
	
	public HighestCapitalCompany() {
		
		setSize(600, 600);
		setVisible(true);              
        this.setTitle("Companies with the Highest Capital");        
        this.setVisible(true);
       
        
		JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
        dtm.addColumn("Capital Total");
       
        Object[] rowData = new Object[5];
      
		Company max = sU.companies.parallelStream()
				.max(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
				.get();	
		
        	rowData[0] = max.getId();
        	rowData[1] = max.getShare();
        	rowData[2] = max.getPrice();
        	rowData[3] = max.getClass().getSimpleName();
        	rowData[4] = max.getPrice() * max.getShare();
        	
        	dtm.addRow(rowData);
        
        
        table.setModel(dtm);
        this.add(new JScrollPane(table));  
	}

}
