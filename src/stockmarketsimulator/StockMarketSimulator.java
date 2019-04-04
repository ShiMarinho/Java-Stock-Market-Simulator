/*
 * Copyright (c) 2019
 * 
 *  - College of Computer Technology (CCT)
 *  - Module Title: Object Oriented with Design Patterns
 *  - Assignment Type: Practical Group Project
 *  - Stock Market Simulator
 *  - Assignment Compiler: Amilcar Aponte (amilcar@cct.ie)
 *  - Weighting: 30%
 *  - Due Date: Sunday, 5th May 2019 (MOODLE Submission)
 *  - Group name: AS 
 *  - Group Component:  2016288 -Ruth Andrea Lopez Hillinworth
 *			2016439 -Shirley Marinho
 *  
 */

 /*
 * StockMarket Simulator is the driver class 
 * A menu from Menu class is diplayed 
 * There is only the main method inside of this class
 */
package stockmarketsimulator;

import company.BankFactory;
import company.CommodityFactory;
import company.Company;
import company.CompanyFactory;
import company.FoodBeverageFactory;
import company.IndustrialFactory;
import company.TechFactory;
import investor.Factory;
import investor.Investor;

/**
 *
 * @author Shirley Marinho & Andrea Hillinworth
 */
public class StockMarketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * Factory pattern
         */
        System.out.println("Investors \n");

        Investor personal = Factory.createInvestor(1, 100, "personal");
        System.out.println(personal);
        Investor angel = Factory.createInvestor(1, 100, "angel");
        System.out.println(angel);
        Investor peer = Factory.createInvestor(1, 100, "peer-to-peer");
        System.out.println(peer);
        Investor venture = Factory.createInvestor(1, 100, "venture");
        System.out.println(venture);
        Investor bankInv = Factory.createInvestor(1, 100, "bank investor");
        System.out.println(bankInv);
        
        /*
         * Abstractor Factory pattern Companies
         */
        System.out.print("\nCompanies\n");
        Company bank = CompanyFactory.getCompany(new BankFactory(1, 1, 1));
        System.out.println(bank);
        Company commodity = CompanyFactory.getCompany(new CommodityFactory(1, 1, 1));
        System.out.println(commodity);
        Company industrial = CompanyFactory.getCompany(new IndustrialFactory(1, 1, 1));
        System.out.println(industrial);
        Company food = CompanyFactory.getCompany(new FoodBeverageFactory(1, 1, 1));
        System.out.println(food);
        Company tech = CompanyFactory.getCompany(new TechFactory(1, 1, 1));
        System.out.println(tech);
    }

}
