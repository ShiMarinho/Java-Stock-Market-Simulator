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
        this.bugdet = bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Angel Investor, id: " +  getInvId() + ", Name: " +  getBugdet();

    }
}
