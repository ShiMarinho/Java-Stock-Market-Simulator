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

      
        new StockMarketSimulator();
    }
    
    public StockMarketSimulator(){
         

        Simulator simulator = Simulator.getInstance();
        simulator.addTrade(SetUp.getCompanies(), SetUp.getInvestors());
        simulator.getTrade(SetUp.getInvestors());
       //System.out.println(simulator.getTrade());
        simulator.getMinCapitalCompany();

        Transaction tr = new Transaction(1);

        Simulator sim = tr.getSimulator();
      // System.out.println(sim.getTrade());
    }
    

}
