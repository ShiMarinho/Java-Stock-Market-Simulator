/*
 * Bank Factory class implements AbstractFactory and create only Companies 
 */
package company;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author ms
 */
public class BankFactory implements AbstractFactory {
	
    private int compId;
    private int share;
    private double price;
    protected int sharesSold;
    
    

    public BankFactory(int compId, int share, double price) {
        this.compId = compId;
        this.price = price;
        this.share = share;
        
        
        
        

    }


	@Override
    public Company createCompany() {
        return new Bank.BankBuilder(compId, share, price).build();
    }

}

