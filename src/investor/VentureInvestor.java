/*
 * Venture Investor class extends Investor and create only VentureInvestor classes 
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
        this.budget = builder.bugdet;

    }

    @Override
    public String toString() {
        return "\n ID: " + getInvId()
                + "\n Budget: " + getBudget()
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
