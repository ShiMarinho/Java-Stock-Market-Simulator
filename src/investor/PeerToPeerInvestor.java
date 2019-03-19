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
        this.bugdet = bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Peer to Peer Investor, id: " +  getInvId() + ", Name: " +  getBugdet();

    }
}
