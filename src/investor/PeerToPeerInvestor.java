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
    public PeerToPeerInvestor(PeerToPeerInvestorBuilder builder) {
        this.invId = builder.invId;
        this.bugdet = builder.bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Peer to Peer Investor, id: " +  getInvId() + ", Budget: " +  getBugdet()+ "\n";

    }
    public static class PeerToPeerInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public PeerToPeerInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = bugdet;
          
            
        }
        public PeerToPeerInvestor build(){
            return new PeerToPeerInvestor(this);
        }

    }
}
