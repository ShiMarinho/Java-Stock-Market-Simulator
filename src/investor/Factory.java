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

    public static Investor createInvestor(int InvId, double budget, String type) {


        switch (type) {
            case "personal":

                return new PersonalInvestor(InvId, budget);

//                return new PersonalInvestor.PersonalInvestorBuilder(InvId, budget).build();

            case "angel":

                return new AngelInvestor (InvId, budget);

//                return new AngelInvestor.AngelInvestorBuilder(InvId, budget).build();

            case "peer-to-peer":

                return new PeerToPeerInvestor(InvId, budget);

//                return new PeerToPeerInvestor.PeerToPeerInvestorBuilder(InvId, budget).build();

            case "venture":

                return new VentureInvestor(InvId, budget);

//                return new VentureInvestor.VentureInvestorBuilder(InvId, budget).build();

            case "bank investor":

                return new BankInvestor(InvId, budget);

//                return new BankInvestor.BankInvestorBuilder(InvId, budget).build();

            default:
                return null;

        }
    }
     
}
/*
 * src: https://startupnation.com/sponsored-content/types-investors-startups/
*/
