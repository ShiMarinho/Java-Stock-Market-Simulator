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
    public BankInvestor(BankInvestorBuilder builder) {
        this.invId = builder.invId;
        this.bugdet = builder.bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Bank Investor, id: " +  getInvId() + ", Budget: " +  getBugdet() + "\n";

    }
    public static class BankInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public BankInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = bugdet;
          
            
        }
        public BankInvestor build(){
            return new BankInvestor(this);
        }

    }
    
}
