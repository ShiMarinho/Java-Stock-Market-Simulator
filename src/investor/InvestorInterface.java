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
public interface InvestorInterface {
   
    public void buyShare(int round, boolean isDone);
    public Investor highestNumberOfShare(Investor investor, int share);
    public Investor lowestNumberOfShare();
    public Investor mostNumberOfCompanies();
    public Investor leastNumberOfCompanies();
    
    
}
