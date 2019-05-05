/*
 * All Investor GUI that returns a JTable the Investor which has bought the most shares information: 
 * investor id, budget, investor type, total amount of shares bought
 * capital total and number of shares sold. 
 *
 */

package GUI;

import java.text.DecimalFormat;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import company.Company;
import investor.Investor;
import stockmarketsimulator.SetUp;

public class InvestorHIghestShares extends JFrame {
	DecimalFormat df = new DecimalFormat("#.##");

    public InvestorHIghestShares() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with Most Shares");
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
        dtm.addColumn("Total of Shares");

        Object[] rowData = new Object[4];

        /**
         * operation that compares the investors arraylist and returns the investor which has bought the most
         * shares returning the getTotalSharesBought();
         * */
        
        Investor max = SetUp.investors.parallelStream()
                .max(Comparator.comparing(inv -> ((Investor) inv).getTotalSharesBought()))
                .get();

        rowData[0] = max.getInvId();
        rowData[1] = df.format(max.getBudget());
        rowData[2] = max.getClass().getSimpleName();
        rowData[3] = df.format(max.getTotalSharesBought());

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
