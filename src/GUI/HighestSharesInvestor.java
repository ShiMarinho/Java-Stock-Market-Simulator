package GUI;

import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import investor.Investor;
import stockmarketsimulator.SetUp;

public class HighestSharesInvestor extends JFrame {

    public HighestSharesInvestor() {

        setSize(600, 600);
        setVisible(true);
        this.setTitle("Companies with Most Shares");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        JTable table = new JTable();
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Investor ID");
        dtm.addColumn("Budget");
        dtm.addColumn("Type");
        dtm.addColumn("Total of Shares");

        Object[] rowData = new Object[4];

        Investor max = SetUp.investors.parallelStream()
                .max(Comparator.comparing(inv -> ((Investor) inv).getTotalSharesBought()))
                .get();

        rowData[0] = max.getInvId();
        rowData[1] = max.getBudget();
        rowData[2] = max.getClass().getSimpleName();
        rowData[3] = max.getTotalSharesBought();

        dtm.addRow(rowData);

        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
