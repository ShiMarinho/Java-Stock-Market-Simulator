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
public class Simulator {

    //Hashmap to save the investor + company
    private Map<Object, Object> simulator;
    protected  int transactions = 0;
    
    static private Simulator instance = null;
    
    // Constructor
    private Simulator() {
       
        simulator = new HashMap<Object, Object>();

    }
    
    // Add trade
    public void addTrade(Object company, Object investor) {        
        simulator.put(company, investor);
        transactions++;

    }

    // Check transaction 
    public Object getInvestor(Object investor) {

        return simulator.get(investor);
       
    }
  

    // Check transaction 
    public String getTrade() {
        String trade = "";

        for (Entry entry : simulator.entrySet()) {
        	trade += entry.getKey() + 
        	
            "\n" + entry.getValue() + "\n"
            +"\n ---------------------------------------";
        	
        }

        return trade;
    }
    
    public int getTotalTrades() {
    	return transactions;
    }
    
 
    public static synchronized Simulator getInstance() {
    	if(instance == null) {
			instance = new Simulator();
			
		}
		return instance;
    }

}
