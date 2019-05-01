/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import company.Company;

/**
 *
 * @author ms
 */
public class Simulator {

    //Hashmap to save the investor + company
    private Map<Object, Object> simulator;

    static private Simulator instance = new Simulator();

    // Constructor
    private Simulator() {

        simulator = new HashMap<Object, Object>();

    }

    // Add trade
    public void addTrade(Object company, Object investor) {

        simulator.put(company, investor);

    }

    // Check transaction 
    public Object getInvestor(Object investor) {

        return simulator.get(investor);

    }

    public Object getCompany(Object company) {
        return simulator.get(company);
    }

    // Check transaction 
    public String getTrade() {
        String trade = "";

        for (Entry entry : simulator.entrySet()) {
            trade += entry.getKey()
                    + "\n" + entry.getValue() + "\n"
                    + "\n ---------------------------------------";

        }
        return trade;
    }

    public void countTransaction(){
        //if any 10 shares are sold from company a company tha hasn't sold any has its price reduced to half
    }

    public static Simulator getInstance() {
        return instance;
    }

}
