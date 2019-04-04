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
    public AngelInvestor(AngelInvestorBuilder builder) {
        this.invId = builder.invId;
        this.bugdet = builder.bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Angel Investor, id: " +  getInvId() + ", Budget: " +  getBugdet();

    }
    public static class AngelInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public AngelInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = bugdet;
          
            
        }
        public AngelInvestor build(){
            return new AngelInvestor(this);
        }

    }
}
