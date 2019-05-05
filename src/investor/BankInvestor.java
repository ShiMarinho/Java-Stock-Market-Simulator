/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investor;

import java.text.DecimalFormat;

/**
 *
 * @author ms
 */
public class BankInvestor extends Investor {
	DecimalFormat df = new DecimalFormat("#.##"); 

    /*
    * Constructor 
     */

  
    public BankInvestor(BankInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.bugdet;


    }

   
    @Override
    public String toString() {


        return   
        		"\n INVESTOR:" + "\n Investor ID: " + getInvId( ) +
        		"\n Budget: " +  df.format(getBudget()) +
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
