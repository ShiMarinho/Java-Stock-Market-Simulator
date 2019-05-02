/*
 * Generic investor class. It is an abstract class for creating Investors.
 * It has the investor's attributes, getters, setters and the toString methods
 */
package investor;

/**
 *
 * @author ms
 */
public abstract class Investor {

    protected int invId;

    /*
    thread 
     */
    protected double budget;
    protected String type;
    protected int totalSharesBought;

    public double getBudget() {
        return budget;
    }

    public void setBugdet(int invId, double bugdet) {
        this.invId = invId;
        this.budget = bugdet;
    }

    public int getInvId() {
        return invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public void setBudget(double bugdet) {
        this.budget = bugdet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalSharesBought() {
        return totalSharesBought;
    }

    public void setTotalSharesBought(int numbOfTransactions) {
        this.totalSharesBought = numbOfTransactions;
    }

    @Override
    public String toString() {

        return "\n Investor"
                + " \n Bugdet: " + budget
                + "\n Type: " + type;
    }

}
