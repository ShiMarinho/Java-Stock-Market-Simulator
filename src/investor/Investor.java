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
public abstract class Investor {
	protected int invId;
    protected double bugdet;
    protected String type;
    //implement thread


    public double getBugdet() {
        return bugdet;
    }

    public void setBugdet(int invId, double bugdet) {
    	this.invId = invId;
        this.bugdet = bugdet;
    }

    
    
    public int getInvId() {
		return invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public void setBugdet(double bugdet) {
		this.bugdet = bugdet;
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
        		+ " \n Bugdet: " + bugdet 
        		+ "\n Type: " + type ;
    }

}
