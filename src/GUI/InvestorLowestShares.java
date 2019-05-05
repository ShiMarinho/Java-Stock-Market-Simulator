/*
 * All Investor GUI that returns a JTable the Investor which has bought the least number of shares information: 
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
import investor.Investor;
import stockmarketsimulator.SetUp;

public class InvestorLowestShares extends JFrame {
	DecimalFormat df = new DecimalFormat("#.##");

    public InvestorLowestShares() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with least Shares");
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
         * operation that compares the investors arraylist and returns the investor which has bought the least
         * shares returning the getTotalSharesBought();
         * */
        Investor min = SetUp.investors.parallelStream()
                .min(Comparator.comparing(inv -> ((Investor) inv).getTotalSharesBought()))
                .get();

        rowData[0] = min.getInvId();
        rowData[1] = df.format(min.getBudget());
        rowData[2] = min.getClass().getSimpleName();
        rowData[3] = min.getTotalSharesBought();

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
