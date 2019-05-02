/*
 * Company Factory class returns the abstract factory class to create Companies 
 */
package company;

/**
 *
 * @author ms
 */
public class CompanyFactory {

    public static Company getCompany(AbstractFactory abstractFactory) {

        return abstractFactory.createCompany();

    }
}
