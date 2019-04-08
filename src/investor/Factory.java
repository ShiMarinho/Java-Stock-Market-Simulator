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
public class Factory {

    public Factory() {

    }

    /*
    * to make the method accessible in the main static
     */
    public static Investor getInvestor(int invId, double budget, String type) {

        switch (type) {
            case "personal":
                return new PersonalInvestor(invId, budget);
            case "angel":
                return new AngelInvestor (invId, budget);
            case "peer-to-peer":
                return new PeerToPeerInvestor(invId, budget);
            case "venture":
                return new VentureInvestor(invId, budget);
            case "bank investor":
                return new BankInvestor(invId, budget);
            default:
                return null;

        }
    }
}
/*
 * src: https://startupnation.com/sponsored-content/types-investors-startups/
*/
