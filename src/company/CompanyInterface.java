/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author ms
 */
public interface CompanyInterface {
    
    public void getShares(int companyID, int share);
    public void increasePrice();
    public void reducePrice();
     public double sumCapital();
    public Company highestCapital();
    public Company lowestCapital();
    
    
    
}
/*
@Override
    public void getShares() {

        if (bank.getShare() >= 10) {
            increasePrice();
        } else if (bank.getShare() == 0) {
            reducePrice();
        }

    }

    @Override
    public void increasePrice() {
        double price = bank.getPrice();
        if (bank.getShare() == 10) {
           bank.setPrice(price + (price * 0.2));
        }
        System.out.println(bank.getPrice());
    }

    @Override
    public void reducePrice() {
        double price = bank.getPrice();
        if (bank.getShare() == 0) {
            bank.setPrice(price - (price * 0.5));
        }
        System.out.println(bank.getPrice());
    }

    @Override
    public double sumCapital() {
        double sum, sum2;
        sum = (bank.getShare() * bank.getPrice());
      
        return sum;
    }
*/