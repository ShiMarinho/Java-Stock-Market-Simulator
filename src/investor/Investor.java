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
public abstract class Investor{

	protected int invId;

    /*
    thread 
     */
    
    protected double budget;
    protected String type;


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
    
   

    @Override
    public String toString() {
        return "\n Investor"        		
        		+ " \n Bugdet: " + budget 
        		+ "\n Type: " + type ;
    }

   

}
