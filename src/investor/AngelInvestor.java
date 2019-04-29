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
public class AngelInvestor extends Investor {

    /*
    * Constructor 
     */

    public AngelInvestor(int invId, double bugdet) {
    	this.invId = invId;
         this.budget = bugdet;
    }    

    public AngelInvestor(AngelInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.budget;


    }
    

   
    @Override
    public String toString() {


        return 
        		"\n ID: " + getInvId( ) +
        		"\n Budget: " +  getBudget() +
        		"\n Type: Angel Investor " +
        		"\n Total of bought Shares: " + totalSharesBought;


    }
    public static class AngelInvestorBuilder {

        protected int invId;
        protected double budget;
       
        
        public AngelInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.budget = budget;
          
            
        }
        public AngelInvestor build(){
            return new AngelInvestor(this);
        }


    }
    
   
}
