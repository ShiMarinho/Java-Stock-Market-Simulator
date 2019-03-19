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
    public static Investor getInvestor(int InvId, double budget, String type) {

        switch (type) {
            case "personal":
                return new PersonalInvestor(InvId, budget);
            case "angel":
                return new AngelInvestor(InvId, budget);
            case "peer-to-peer":
                return new PeerToPeerInvestor(InvId, budget);
            case "venture":
                return new VentureInvestor(InvId, budget);
            case "bank investor":
                return new BankInvestor(InvId, budget);
            default:
                return null;

        }
    }
}
/*
 * src: https://startupnation.com/sponsored-content/types-investors-startups/
*/
