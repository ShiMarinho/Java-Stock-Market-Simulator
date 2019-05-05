/*
 * All Investor GUI that returns a JTable the Company with the lowest capital information: 
 * company id, price, shares, company type, capital
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
import stockmarketsimulator.SetUp;

public class CompanyLowestCapital extends JFrame {
	DecimalFormat df = new DecimalFormat("#.##");

    public CompanyLowestCapital() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with the Highest Capital");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        /**
         * Create the tables and add the columns with its headings
         * */
        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
        dtm.addColumn("Capital Total");

        Object[] rowData = new Object[5];

        /**
         * operation that compares the Companies arraylist and return the company with the lowest Capital value
         * which is the result of the price multiplied by shares
         * */
        Company min = SetUp.companies.parallelStream()
                .min(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
                .get();

        rowData[0] = min.getCompId();
        rowData[1] = min.getShare();
        rowData[2] = df.format(min.getPrice());
        rowData[3] = min.getClass().getSimpleName();
        rowData[4] = df.format(min.getPrice() * min.getShare());

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
