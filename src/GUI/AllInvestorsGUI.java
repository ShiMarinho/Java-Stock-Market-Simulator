/*
 * All Investor GUI that returns a JTable with all the Investor information: investor id, budget, investor type,
 * total amount of shares bought
 * capital total and number of shares sold. All the information displayed is the result after the trading day.
 *
 */
package GUI;

import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import stockmarketsimulator.SetUp;


public class AllInvestorsGUI extends JFrame {

    
    DecimalFormat df = new DecimalFormat("#.##");

    public AllInvestorsGUI() {
        setSize(600, 600);
        setVisible(true);
        this.setTitle("All Investors");

        this.setVisible(true);
        this.setLocationRelativeTo(null);

        /**
         * Create the tables and add the columns with its headings
         * */
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Investor ID");
        dtm.addColumn("Budget");
        dtm.addColumn("Type");
        dtm.addColumn("Shares Bought");


        Object[] rowData = new Object[4];
        
        /**
         * loop that iterates through the arraylist containing the Investor objects
         * and insert them into the Jtable
         * */

        for (int i = 0; i < SetUp.investors.size(); i++) {

            rowData[0] = SetUp.investors.get(i).getInvId();
            rowData[1] = df.format(SetUp.investors.get(i).getBudget());
            rowData[2] = SetUp.investors.get(i).getClass().getSimpleName();
            rowData[3] = SetUp.investors.get(i).getTotalSharesBought();

            dtm.addRow(rowData);

        }

        table.setModel(dtm);
        this.add(new JScrollPane(table));

   	}
	

}
