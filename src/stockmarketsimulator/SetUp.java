package stockmarketsimulator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import company.BankFactory;
import company.CommodityFactory;
import company.Company;
import company.CompanyFactory;
import company.FoodBeverageFactory;
import company.IndustrialFactory;
import company.TechFactory;
import investor.AngelInvestor;
import investor.AngelInvestor.AngelInvestorBuilder;
import investor.Factory;
import investor.Investor;
import investor.PersonalInvestor;
import investor.PersonalInvestor.PersonalInvestorBuilder;

public class SetUp {
	
	/*
	 * Create Arraylist of companies
	 * */
	public static ArrayList <Company> companies = new ArrayList();
	
	/*
	 * Create arrayList of investors
	 * */
	public static ArrayList<Investor> investors = new ArrayList();
	
	static Random r = new Random();
	protected final static int bugetMin = 100;
	protected final static int BudgetMax = 10000;
	protected final static int objtMax = 100;
	protected final int maxShares = 1000;
	protected final int minShares = 500;
	protected final int minPrice = 10;
	protected final int maxPrice = 100;
	
	public void Ready() {
		CreateInvestors();
		CreateCompanies();
		
	}
	

	public static void CreateInvestors() {
		 /*
	     * Factory pattern
	     */

	    String[] types = new String[] {"personal", "angel", "peer-to-peer",  "venture", "bank investor"};	    
		    
	    for(int i=0; i<objtMax; i++) {	    	
	    	String type = types[r.nextInt(types.length)];	    	
	    	int id = i+1;
	    	int finalBudget = ThreadLocalRandom.current().nextInt(bugetMin, BudgetMax +1);	    	
	    	investors.add(Factory.createInvestor(id, finalBudget, type));	    	
	    	
	
	    }	    
	}
	
	
	public static void CapitalCmpany() {

		Company max = companies.parallelStream()
				.max(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
				.get();	
		System.out.println("----------------------------------------------------------------");
		System.out.println(max);
	}
	
 	
	public void CreateCompanies() {
		/*
	     * Abstract Factory pattern Companies
	     */
		
		for(int i=0; i<objtMax; i++) {
			
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
//			System.out.println(companies);
			
		
			
		}
	   
		
	}

}
