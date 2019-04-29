package GUI;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import company.Company;
import investor.Investor;
import stockmarketsimulator.SetUp;


public class LowestSharesInvestor extends JFrame{

	
	public LowestSharesInvestor() {
		
		setSize(600, 600);
		setVisible(true);              
        this.setTitle("Companies with least Shares");        
        this.setVisible(true);
       
        
		JTable table = new JTable();                
        DefaultTableModel dtm = new DefaultTableModel();        
        dtm.addColumn("Investor ID");
        dtm.addColumn("Budget");        
        dtm.addColumn("Type");
        dtm.addColumn("Total of Shares");
       
        Object[] rowData = new Object[4];
      
		Investor min = SetUp.investors.parallelStream()
				.min(Comparator.comparing(inv -> ((Investor) inv).getTotalSharesBought()))
				.get();
		
        	rowData[0] = min.getInvId();
        	rowData[1] = min.getBudget();
        	rowData[2] = min.getClass().getSimpleName();
        	rowData[3] = min.getTotalSharesBought();
        	
        	
        	dtm.addRow(rowData);
        
        
        table.setModel(dtm);
        this.add(new JScrollPane(table));  
	}

}