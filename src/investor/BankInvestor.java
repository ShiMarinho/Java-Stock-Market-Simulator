/*
 * Bank Investor class extends Investor and create only BankInvestors classes 
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
