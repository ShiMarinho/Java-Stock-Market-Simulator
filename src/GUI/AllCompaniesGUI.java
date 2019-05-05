/*
 * All companies GUI that returns a JTable with all the Company information: id, shares, price, company type, 
 * capital total and number of shares sold. All the information displayed is the result after the trading day.
 *
 */
package GUI;

import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import stockmarketsimulator.SetUp;

public class AllCompaniesGUI extends JFrame{
	DecimalFormat df = new DecimalFormat("#.##"); 

    public AllCompaniesGUI() {
        setSize(600, 600);
        setVisible(true);
        this.setTitle("All Companies");

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
        dtm.addColumn("Shares sold");

        Object[] rowData = new Object[6];
        
        /**
         * loop that iterates through the arraylist containing the Company objects
         * and insert them into the Jtable
         * */

        for (int i = 0; i < SetUp.companies.size(); i++) {

            rowData[0] = SetUp.companies.get(i).getCompId();
            rowData[1] = SetUp.companies.get(i).getShare();
            rowData[2] = df.format(SetUp.companies.get(i).getPrice());
            rowData[3] = SetUp.companies.get(i).getClass().getSimpleName();
            rowData[4] = df.format( SetUp.companies.get(i).getPrice() * SetUp.companies.get(i).getShare());
            rowData[5] = SetUp.companies.get(i).getSharesSold();

            dtm.addRow(rowData);

        }

        table.setModel(dtm);
        this.add(new JScrollPane(table));

    }

}
