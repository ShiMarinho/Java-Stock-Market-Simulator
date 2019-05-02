package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import stockmarketsimulator.SetUp;

public class AllCompaniesGUI extends JFrame {

    public AllCompaniesGUI() {
        setSize(600, 600);
        setVisible(true);
        this.setTitle("All Companies");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Company ID");
        dtm.addColumn("Share");
        dtm.addColumn("Price");
        dtm.addColumn("Type");
        dtm.addColumn("Capital Total");
        dtm.addColumn("Shares sold");

        Object[] rowData = new Object[6];

        for (int i = 0; i < SetUp.companies.size(); i++) {

            rowData[0] = SetUp.companies.get(i).getCompId();
            rowData[1] = SetUp.companies.get(i).getShare();
            rowData[2] = SetUp.companies.get(i).getPrice();
            rowData[3] = SetUp.companies.get(i).getClass().getSimpleName();
            rowData[4] = SetUp.companies.get(i).getPrice() * SetUp.companies.get(i).getShare();
            rowData[5] = SetUp.companies.get(i).getSharesSold();

            dtm.addRow(rowData);
        }

        table.setModel(dtm);
        this.add(new JScrollPane(table));

    }

}
