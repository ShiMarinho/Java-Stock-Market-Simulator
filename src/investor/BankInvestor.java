/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investor;

/**
 *
 * @author ms
 */
public class BankInvestor extends Investor {

    /*
    * Constructor 
     */

    public BankInvestor(int invId, double bugdet) {
    	this.invId = invId;
          this.budget = bugdet;
    }

    public BankInvestor(BankInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.bugdet;


    }

   
    @Override
    public String toString() {


        return   
        		"\n ID: " + getInvId( ) +
        		"\n Budget: " +  getBudget() +
        		"\n Type: Bank Investor " +
        		"\n Total of bought Shares: " + totalSharesBought;



    }
    public static class BankInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public BankInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet =  budget;
          
            
        }
        public BankInvestor build(){
            return new BankInvestor(this);
        }

    }
    
}
