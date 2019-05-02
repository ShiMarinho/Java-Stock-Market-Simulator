package stockmarketsimulator;

import GUI.MainGUI;
import javax.swing.SwingUtilities;

public class StockMarketSimulator {

    public static void main(String[] args) {
        new StockMarketSimulator();

    }

    public StockMarketSimulator() {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new MainGUI();
            }
        });
        
        SetUp sU = new SetUp();
        sU.Ready();
        TradingDay td = new TradingDay();
        td.Buy();

    }
    


}
