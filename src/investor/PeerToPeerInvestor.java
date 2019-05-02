/*
 * Peer to Peer Investor class extends Investor and create only PeerToPeerInvestor classes 
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
        this.budget = builder.bugdet;

    }

    @Override
    public String toString() {

        return "\n ID: " + getInvId()
                + "\n Budget: " + getBudget()
                + "\n Type: Peer to Peer Investor "
                + "\n Total of bought Shares: " + totalSharesBought;

    }

    public static class PeerToPeerInvestorBuilder {

        protected int invId;
        protected double bugdet;

        public PeerToPeerInvestorBuilder(int invId, double budget) {
            this.invId = invId;
            this.bugdet = budget;

        }

        public PeerToPeerInvestor build() {
            return new PeerToPeerInvestor(this);
        }

    }
}
