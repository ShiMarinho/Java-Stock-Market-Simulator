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
public class PeerToPeerInvestor extends Investor {

    /*
    * Constructor 
     */

    public PeerToPeerInvestor(int invId, double bugdet) {
    	this.invId = invId;
        this.budget = bugdet;
    }

    public PeerToPeerInvestor(PeerToPeerInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.bugdet;


    }

   
    @Override
    public String toString() {

        return 
        		"\n ID: " + getInvId( ) +
        		"\n Budget: " +  getBudget() + 
        		"\n Type: Peer to Peer Investor ";

        

    }
    public static class PeerToPeerInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public PeerToPeerInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = budget;
          
            
        }
        public PeerToPeerInvestor build(){
            return new PeerToPeerInvestor(this);
        }


    }
}
