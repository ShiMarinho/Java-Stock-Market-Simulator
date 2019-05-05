/**
 *  Class where the trading day (buy/sell shares) is perfomed
 *  
 *  */
package stockmarketsimulator;

import java.util.ArrayList;

import java.util.Random;

import company.Company;
import investor.Investor;

public class TradingDay {

	protected final static int shareNo = 1;
    static Random r = new Random();

    protected static int count = 10;
    
    
    Simulator simulator = Simulator.getInstance();

    /**
     * Buy method
     * a random company and random investor are selected to perform the buy / sell
     * */
	public void Buy() {		
		for(int i=0; i< SetUp.companies.size(); i++) {
			for(int j=0; j<SetUp.investors.size(); j++) {				
				/*print the companies in the console to compare the initial companies / investors before the trading day*/
				System.out.println(SetUp.companies);				
				/*While loop to be executed as long as the companies have 1 or more shares, and investors
				 * have a budget bigger than 0 */
				while(SetUp.companies.get(i).getShare()>=1 && SetUp.investors.get(j).getBudget() >0) {					
					/*Selection of a random company from the companies arrayList*/
					Company com  = SetUp.companies.get(r.nextInt(SetUp.companies.size()));
					/*Selection of a random investor from the investors arrayList*/
					Investor inv = SetUp.investors.get(r.nextInt(SetUp.investors.size()));
					/*if condition to confirm that the selected investor budget is equal or bigger than the selected company
					 * price, and that the selected company still has shares to sell*/
					if(inv.getBudget() >= com.getPrice() && com.getShare()>0) {	
						/*Investor budget is modified subtracting the company price to its budget*/
						inv.setBudget(inv.getBudget() - com.getPrice());
						/*Investor sharesBought increments by 1*/
                        inv.setTotalSharesBought(inv.getTotalSharesBought() + 1);
                        /*Investor sharesBought increments by 1*/
                        com.setSharesSold(com.getSharesSold() + shareNo);
                        /*Investor shares decreases by 1 */
                        com.setShare(com.getShare() - shareNo);
                        /*if condition that checks every time a selected company sells 10 shares, its price doubles*/	
						if(com.getSharesSold()%count == 0) {
							com.setPrice(com.getPrice() + com.getPrice());
							
						} 
						/*the company and investor are added to the simulator hashmap*/
						simulator.addTrade(com, inv);
						simulator.countShares(com);	
						
						
						
						
							
						}
						
					}
					
				}
				
			}
		
		
	}

}
