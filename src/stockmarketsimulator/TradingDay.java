package stockmarketsimulator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;



import company.Company;
import investor.Investor;

public class TradingDay {
	 protected final static int shareNo = 1;
	
    static Random r = new Random();
    protected static int count = 11;
    
    
    public static ArrayList<Object> transactions = new ArrayList<Object>();
    Simulator simulator = Simulator.getInstance();
    
  
	public void Buy() {		
		for(int i=0; i< SetUp.companies.size(); i++) {
			for(int j=0; j<SetUp.investors.size(); j++) {				
				System.out.println(SetUp.companies);				
				while(SetUp.companies.get(i).getShare()>=1 && SetUp.investors.get(j).getBudget() >0) {					
					Company com  = SetUp.companies.get(r.nextInt(SetUp.companies.size()));
					Investor inv = SetUp.investors.get(r.nextInt(SetUp.investors.size()));					
					if(inv.getBudget() >= com.getPrice() && com.getShare()>0) {						
						inv.setBudget(inv.getBudget() - com.getPrice());
						inv.setTotalSharesBought(inv.getTotalSharesBought() +1);	
						com.setSharesSold(com.getSharesSold() + shareNo);
						com.setShare(com.getShare() - shareNo);						
						if(com.getSharesSold()%count == 0) {
							com.setPrice(com.getPrice() + (com.getPrice() * .02));
							
						} 
						
						simulator.addTrade(com, inv);	
						

						
					}
					
					
					
					
				}
				
				
			}
			
			
		
		}
	}
	
	
	
}
