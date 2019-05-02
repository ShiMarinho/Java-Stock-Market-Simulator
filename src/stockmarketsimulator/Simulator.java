/*
 * Simulator is a singleton class which guarantee a single instance of Simulator
 * class to keep track of all trade made by investor and companies
 */
package stockmarketsimulator;

import company.Company;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ms
 */
public class Simulator {

    //Hashmap to save the investor + company
    private static Map<Object, Object> simulator;

    private static Simulator instance = new Simulator();

    // Constructor
    private Simulator() {

        simulator = new HashMap<Object, Object>();

    }

    // Add trade
    public void addTrade(Object company, Object investor) {

        simulator.put(company, investor);

    }

    // Check transaction 
    public String getTrade() {
        String trade = "";

        for (Entry entry : simulator.entrySet()) {
            trade += entry.getKey()
                    + "\n" + entry.getValue() + " \n"
                    + "\n ---------------------------------------";

        }
        return trade;
    }

    public void countShares(Company company) {
        int sold = company.getSharesSold();

        for (int i = 0; i == 100; i++) {
            if ((sold % 10) == 0) {
                company.setPrice(company.getPrice() + (company.getPrice() * 0.02));
                System.out.println(company.getCompId());
                System.out.println(company.getPrice());
            }
        }

    }

    public void countTrade(Company company) {
        int size = simulator.size();

        for (int i = 0; i == 100; i++) {
            if (size % 10 == 0) {
                company.setPrice(company.getPrice() - (company.getPrice() * 0.5));
                System.out.println(simulator.size());
                System.out.println(company.getPrice());
            }
        }

    }

    public static Simulator getInstance() {

        return instance;
    }
}
