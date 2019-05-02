package GUI;

import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import company.Company;
import stockmarketsimulator.SetUp;

public class LowestCapitalCompany extends JFrame {

    public LowestCapitalCompany() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with the Highest Capital");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
        dtm.addColumn("Capital Total");

        Object[] rowData = new Object[5];

        Company min = SetUp.companies.parallelStream()
                .min(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
                .get();

        rowData[0] = min.getCompId();
        rowData[1] = min.getShare();
        rowData[2] = min.getPrice();
        rowData[3] = min.getClass().getSimpleName();
        rowData[4] = min.getPrice() * min.getShare();

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
