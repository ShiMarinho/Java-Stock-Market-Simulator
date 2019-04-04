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
public class PersonalInvestor extends Investor {

    /*
    * Constructor 
     */
    public PersonalInvestor(PersonalInvestorBuilder builder) {
        this.invId = builder.invId;
        this.bugdet = builder.bugdet;

    }

   
    @Override
    public String toString() {
        return "Type: Personal Investor, id: " +  getInvId() + ", Budget: " +  getBugdet();

    }
    public static class PersonalInvestorBuilder {

        protected int invId;
        protected double bugdet;
       
        
        public PersonalInvestorBuilder(int invId, double budget){
            this.invId = invId;
            this.bugdet = bugdet;
          
            
        }
        public PersonalInvestor build(){
            return new PersonalInvestor(this);
        }

    }
}
