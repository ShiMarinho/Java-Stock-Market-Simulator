/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ms
 */
public enum Simulator {

    instance;

    private Map<Object, Object> simulator;
    
    
    // Constructor
    private Simulator() {
       
        simulator = new HashMap<Object, Object>();

    }

    // Add trade
    public void addTrade(Object company, Object investor) {
        
        simulator.put( SetUp.CreateCompanies(), SetUp.CreateInvestors());

    }

    // Check transaction 
    public Object getTrade(Object company) {

        return simulator.get(SetUp.CreateCompanies());
       

    }

    // Check transaction 
    public String getTrade() {
        String trade = "";

        for (Entry entry : simulator.entrySet()) {
            trade += entry.getKey() + " - " + entry.getValue() + "\n";
        }

        return trade;
    }
    
    public void getMinCapitalCompany(){
         SetUp.minCapitalCompany();
    }
    
    public static Simulator getInstance() {
        return instance;
    }

}
