/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

import java.util.ArrayList;
import java.util.Comparator;
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
    protected final static int bugetMin = 100;
    protected final static int BudgetMax = 10000;
    protected final static int objtMax = 100;
    protected final static int maxShares = 1000;
    protected final static int minShares = 500;
    protected final static int minPrice = 10;
    protected final static int maxPrice = 100;

    public void Ready() {
        CreateInvestors();
        CreateCompanies();

    }

    public static ArrayList<Investor> CreateInvestors() {
        /*
	     * Factory pattern
         */

        String[] types = new String[]{"personal", "angel", "peer-to-peer", "venture", "bank investor"};

        for (int i = 0; i < objtMax; i++) {
            String type = types[r.nextInt(types.length)];
            int id = i + 1;
            int finalBudget = ThreadLocalRandom.current().nextInt(bugetMin, BudgetMax + 1);
            investors.add(Factory.createInvestor(id, finalBudget, type));

        }
        return investors;
    }

    public static void CapitalCompany() {

        Company max = companies.parallelStream()
                .max(Comparator.comparing(c -> ((Company) c).getPrice() * ((Company) c).getShare()))
                .get();
        System.out.println("----------------------------------------------------------------");
        System.out.println(max);
    }

    public static ArrayList<Company> CreateCompanies() {
        /*
	     * Abstract Factory pattern Companies
         */

        for (int i = 0; i < objtMax; i++) {

            int shares = ThreadLocalRandom.current().nextInt(minShares, maxShares + 1);
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
//			System.out.println(companies);

        }
        return companies;

    }

    public static ArrayList<Company> getCompanies() {
        return companies;
    }

    public static ArrayList<Investor> getInvestors() {
        return investors;
    }

    
}
