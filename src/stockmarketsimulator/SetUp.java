/*
 * SetUp class where an arrayList of investors and arrayList of companies are created, each one of them 
 * with a total of 100 objects
 * 
 */
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
    public static ArrayList<Company> companies = new ArrayList();

    /*
	 * Create arrayList of investors
	 * */
    public static ArrayList<Investor> investors = new ArrayList();

    static Random r = new Random();
    /*Minimum limit budget */
    protected final static int bugetMin = 100;
    /*Maximum limit budget*/
    protected final static int BudgetMax = 10000;
    /*Maximum number of objects to be created */
    protected final static int objtMax = 100;
    /*Maximum limit of shares for Investor */
    protected final static int maxShares = 1000;
    /*Minimum limit of shares for Investor */
    protected final static int minShares = 500;
    /*Minimum limit of price for Company */
    protected final static int minPrice = 10;
    /*Maximum limit of price for Company */
    protected final static int maxPrice = 100;

    /*
     * Method that will be called from the main class to 
     * generate the Investors / Companies
     * */
    public void Ready() {
    	CreateInvestors();
    	CreateCompanies();
    }

    public static ArrayList<Investor> CreateInvestors() {
        /*
	     * Factory pattern
         */

    	/*Array of company types */
        String[] types = new String[]{"personal", "angel", "peer-to-peer", "venture", "bank investor"};

        /*For loop that will create 100 companies */
        for (int i = 0; i < objtMax; i++) {
            String type = types[r.nextInt(types.length)]; // selects a random type from the String type array
            int id = i + 1;  
            /*creates the investor budget with a random number between bugetMin & BudgetMax*/
            int finalBudget = ThreadLocalRandom.current().nextInt(bugetMin, BudgetMax + 1); 
            investors.add(Factory.createInvestor(id, finalBudget, type));

        }
        return investors;
    }


    public static ArrayList<Company> CreateCompanies() {
        /*
	     * Abstract Factory pattern Companies
         */

        for (int i = 0; i < objtMax; i++) {
        	/*creates the company share with a random number between minShares & maxShares*/
            int shares = ThreadLocalRandom.current().nextInt(minShares, maxShares + 1);
            /*creates the company price with a random number between minPrice & maxPrice*/
            int price = ThreadLocalRandom.current().nextInt(minPrice, maxPrice + 1);
            int id = i + 1;
            final int choice = 1 + r.nextInt(5);

            try {
                switch (choice) {

                    case 1:
                        companies.add(CompanyFactory.getCompany(new BankFactory(id, shares, price)));
                        break;

                    case 2:
                        companies.add(CompanyFactory.getCompany(new CommodityFactory(id, shares, price)));
                        break;

                    case 3:
                        companies.add(CompanyFactory.getCompany(new IndustrialFactory(id, shares, price)));
                        break;

                    case 4:
                        companies.add(CompanyFactory.getCompany(new FoodBeverageFactory(id, shares, price)));
                        break;

                    case 5:
                        companies.add(CompanyFactory.getCompany(new TechFactory(id, shares, price)));
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println(e);
            }


        }
        return companies;

    }



}
