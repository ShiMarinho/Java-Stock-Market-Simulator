package gui;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HighestInvestmentsCompany extends JFrame {

    public HighestInvestmentsCompany() {

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

//        Simulator.instance.fillTable();
//        	dtm.addRow(rowData);
        table.setModel(dtm);
        this.add(new JScrollPane(table));
    }

}
