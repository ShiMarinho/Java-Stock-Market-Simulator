/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * 
 */
package investor;

import java.text.DecimalFormat;

/**
 *
 * @author ms
 */
public class AngelInvestor extends Investor {

	DecimalFormat df = new DecimalFormat("#.##"); 
    /*
    * Constructor 
     */
    public AngelInvestor(AngelInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.budget;

    }

    @Override
    public String toString() {

        return "\n INVESTOR:" + "\n Investor ID: " + getInvId()
                + "\n Budget: " + df.format(getBudget())
                + "\n Type: Angel Investor "
                + "\n Total of bought Shares: " + totalSharesBought;

    }

    public static class AngelInvestorBuilder {

        protected int invId;
        protected double budget;

        public AngelInvestorBuilder(int invId, double budget) {
            this.invId = invId;
            this.budget = budget;

        }

        public AngelInvestor build() {
            return new AngelInvestor(this);
        }

    }

}
