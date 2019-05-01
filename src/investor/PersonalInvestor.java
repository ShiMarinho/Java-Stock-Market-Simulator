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
public class PersonalInvestor extends Investor {

    /*
    * Constructor 
     */
    public PersonalInvestor(PersonalInvestorBuilder builder) {
        this.invId = builder.invId;
        this.budget = builder.bugdet;

    }

    @Override
    public String toString() {

        return "\n ID: " + getInvId()
                + "\n Budget: " + getBudget()
                + "\n Type: Personal Investor"
                + "\n Total of bought Shares: " + totalSharesBought;

    }

    public static class PersonalInvestorBuilder {

        protected int invId;
        protected double bugdet;

        public PersonalInvestorBuilder(int invId, double budget) {
            this.invId = invId;
            this.bugdet = budget;

        }

        public PersonalInvestor build() {
            return new PersonalInvestor(this);
        }

    }
}
