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
public class VentureInvestor extends Investor {
	DecimalFormat df = new DecimalFormat("#.##"); 

    /*
    * Constructor 
     */
    public VentureInvestor(VentureInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.bugdet;

    }

    @Override
    public String toString() {
        return "\n INVESTOR:" +  "\n Investor ID: " + getInvId()
                + "\n Budget: " + df.format(getBudget())
                + "\n Type: Venture Investor"
                + "\n Total of bought Shares: " + totalSharesBought;
    }

    public static class VentureInvestorBuilder {

        protected int invId;
        protected double bugdet;

        public VentureInvestorBuilder(int invId, double budget) {
            this.invId = invId;
            this.bugdet = budget;

        }

        public VentureInvestor build() {
            return new VentureInvestor(this);
        }

    }
}
