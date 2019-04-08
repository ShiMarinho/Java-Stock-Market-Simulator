package stockmarketsimulator;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import company.BankFactory;
import company.CommodityFactory;
import company.Company;
import company.CompanyFactory;
import company.FoodBeverageFactory;
import company.IndustrialFactory;
import company.TechFactory;
import investor.Factory;
import investor.Investor;

public class SetUp {
	
	/*
	 * Create Arraylist of companies
	 * */
	public ArrayList <Company> companies = new ArrayList<Company>();
	
	/*
	 * Create arrayList of investors
	 * */
	public ArrayList<Investor> investors = new ArrayList <Investor>();
	
	Random r = new Random();
	protected final int bugetMin = 100;
	protected final int BudgetMax = 10000;
	protected final int objtMax = 100;
	protected final int maxShares = 1000;
	protected final int minShares = 500;
	protected final int minPrice = 10;
	protected final int maxPrice = 100;
	

	public void CreateInvestors() {
		 /*
	     * Factory pattern
	     */

	    String[] types = new String[] {"personal", "angel", "peer-to-peer",  "venture", "bank investor"};	    
		    
	    for(int i=0; i<objtMax; i++) {
	    	int budget = ThreadLocalRandom.current().nextInt(bugetMin, BudgetMax +1);
	    	String type = types[r.nextInt(types.length)];	    	
	    	int id = i+1;	    		    	
	    	investors.add(Factory.getInvestor(id, budget, type));
	    }	    
	}
    
 	
	public void CreateCompanies() {
		/*
	     * Abstract Factory pattern Companies
	     */
		
		for(int i=0; i<objtMax; i++) {
//			int shares = minShares + r.nextInt(maxShares);
			int shares = ThreadLocalRandom.current().nextInt(minShares, maxShares +1);
			int price = ThreadLocalRandom.current().nextInt(minPrice, maxPrice +1);
			int id = i+1;
			final int choice = 1+ r.nextInt(5);
			
			try {
				switch(choice) {				
				
				case 1: companies.add(CompanyFactory.getCompany(new BankFactory(id, shares, price)));
				break;
				
				case 2: companies.add(CompanyFactory.getCompany(new CommodityFactory(id, shares, price)));
				break;
				
				case 3:  companies.add(CompanyFactory.getCompany(new IndustrialFactory(id, shares,price)));
				break;
				
				case 4: companies.add(CompanyFactory.getCompany(new FoodBeverageFactory(id, shares, price)));
				break;
				
				case 5: companies.add(CompanyFactory.getCompany(new TechFactory(id, shares,price)));
				break;
	
				}
				
			}catch (InputMismatchException e) {
				System.out.println(e);
			}
			
		
			
		}
	   
		
	}

}
