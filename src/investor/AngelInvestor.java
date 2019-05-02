/*
 * Angel Investor class extends Investor and create only AngelInvestors classes 
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
        this.budget = builder.budget;

    }

    @Override
    public String toString() {

        return "\n ID: " + getInvId()
                + "\n Budget: " + getBudget()
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
