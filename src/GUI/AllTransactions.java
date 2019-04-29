package GUI;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import company.Company;
import stockmarketsimulator.SetUp;
import stockmarketsimulator.Simulator;


public class AllTransactions extends JFrame{
	
	Simulator simulator = Simulator.getInstance();
	
	public AllTransactions() {
		setSize(600, 600);
		setVisible(true); 
        this.setTitle("All Transactions");    
        this.setVisible(true);
        
        
        JTextArea jTextArea = new JTextArea();
        jTextArea.append("\n                                 *********** T R A N S A C T I O N S ***********\n ");
        jTextArea.append(simulator.getTrade());
        
       this.add(jTextArea);
       
       this.add(new JScrollPane(jTextArea));
       
	}

}
