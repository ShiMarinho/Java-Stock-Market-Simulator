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
public class VentureInvestor extends Investor {

    /*
    * Constructor 
     */
    public VentureInvestor(VentureInvestorBuilder builder) {
        this.invId = builder.invId;
        this.bugdet = builder.bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Venture Investor, id: " +  getInvId() + ", Budget: " +  getBugdet();

    }
    public static class VentureInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public VentureInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = bugdet;
          
            
        }
        public VentureInvestor build(){
            return new VentureInvestor(this);
        }

    }
}
