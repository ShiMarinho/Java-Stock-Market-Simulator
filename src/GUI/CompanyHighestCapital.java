/*
 * All Investor GUI that returns a JTable the Company with the highest capital information: 
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

public class CompanyHighestCapital extends JFrame {
	DecimalFormat df = new DecimalFormat("#.##");

    public CompanyHighestCapital() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with the Highest Capital");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        /**
         * Creates the tables and add the columns with its headings
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
         * operation that compares the Companies arraylist and return the company with the highest Capital value
         * which is the result of the price multiplied by shares
         * */
        Company max = SetUp.companies.parallelStream()
                .max(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
                .get();

        rowData[0] = max.getCompId();
        rowData[1] = max.getShare();
        rowData[2] = df.format(max.getPrice());
        rowData[3] = max.getClass().getSimpleName();
        rowData[4] = df.format(max.getPrice() * max.getShare());

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
