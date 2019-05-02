/*
 * The AbstractFactory interface has only one method createCompany and it is a 
 * factory of all the others Companies factories.
 */
package company;

/**
 *
 * @author ms
 */
public interface AbstractFactory {

    public Company createCompany();
}
