package stockmarketsimulator;

import GUI.MainGUI;

public class StockMarketSimulator {
	
	
	public static void main(String[] args) {
		new MainGUI();
		new StockMarketSimulator();
		SetUp sU = new SetUp();
		sU.Ready();
		TradingDay td= new TradingDay();
		td.Buy();
               
		
		
		
		


    }
    
    public StockMarketSimulator(){

//        Simulator simulator = Simulator.getInstance();
//        simulator.addTrade(SetUp.companies, SetUp.investors);
//        simulator.getTrade(SetUp.investors);
//       
////        System.out.println(simulator.getTrade());
//        simulator.getMinCapitalCompany();
//        simulator.getMaxCapitalCompany();
//        
//
//        Transaction tr = new Transaction(1);
//
//        Simulator sim = tr.getSimulator();
////       System.out.println(sim.getTrade());
    }
    
}
