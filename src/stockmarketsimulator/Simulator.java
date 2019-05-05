/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import company.Company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ms
 */
public class Simulator {

    private static final String String = null;
	//Hashmap to save the investor + company


    protected  int transactions = 0;
    private static Map<Object, Object> simulator;
    private static Simulator instance = new Simulator();



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
    public String getTrade() {
        String trade = "";

        for (Entry entry : simulator.entrySet()) {
             trade += entry.getKey()
                    + "\n" + entry.getValue() + " \n"
                    + "\n ---------------------------------------";

        }
        return trade;
    }

    /*Returns the size of the hashmap*/
    public int getTotalTrades() {
    	return transactions;
    }
   

    /* Method to return the Object with the most occurence (the investor that has invested in the most companies */
    public Object getMostCommon() {
    	Map<Object, Integer> countMap = new HashMap<>();

    	for(Map.Entry<Object, Object> entry: simulator.entrySet()) {
    		if (countMap.containsKey(entry.getValue())) {
    			countMap.put(entry.getValue(), countMap.get(entry.getValue()) + 1);
            } else {
                countMap.put(entry.getValue(), 1);
            }
    	}
    	
    	 // Got the number of maximum occurrence
    	   Integer maxNum = Collections.max(countMap.values());
    	   
    	   Object result = "";
    	// Iterate to search the result.
    	    for (Map.Entry<Object, Integer> entry : countMap.entrySet()) {
    	        if(maxNum==entry.getValue()){
    	            result=entry.getKey();
    	       }
    	    }
    	    
    	   return result;
    }
    /* Method to return the Object with the least occurence (the investor that has invested in the least companies */
    public Object getLeastCommon() {
    	Map<Object, Integer> countMap = new HashMap<>();

    	for(Map.Entry<Object, Object> entry: simulator.entrySet()) {
    		if (countMap.containsKey(entry.getValue())) {
    			countMap.put(entry.getValue(), countMap.get(entry.getValue()) + 1);
            } else {
                countMap.put(entry.getValue(), 1);
            }
    	}
    	
    	 // Got the number of maximum occurrence
    	   Integer maxNum = Collections.min(countMap.values());
    	   
    	   Object result = "";
    	// Iterate to search the result.
    	    for (Map.Entry<Object, Integer> entry : countMap.entrySet()) {
    	        if(maxNum==entry.getValue()){
    	            result=entry.getKey();
    	       }
    	    }
    	    
    	   return result;
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
