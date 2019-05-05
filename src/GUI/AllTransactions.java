/*
 * All Investor GUI that returns a JtextArea with the latest transactions performed which includes: the information of the 
 * Investor and the information of the Company of each transaction
 *
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import stockmarketsimulator.Simulator;

public class AllTransactions extends JFrame {

    Simulator simulator = Simulator.getInstance();

    public AllTransactions() {
        setSize(700, 700);
        setVisible(true);
        this.setTitle("All Transaction");
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        /**
         * Create the Text are where the info will be displayed
         * */
        JTextArea jTextArea = new JTextArea();
        //header
        jTextArea.append("\n                                 *********** T R A N S A C T I O N S ***********\n ");
        
        //insert the latest transactios into the text area
        jTextArea.append(simulator.getTrade());

        this.add(jTextArea);

        this.add(new JScrollPane(jTextArea));

    }

}
