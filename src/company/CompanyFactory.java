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
public class CompanyFactory {

    public static Company getCompany(AbstractFactory abstractFactory) {

        return abstractFactory.createCompany();

    }
}
