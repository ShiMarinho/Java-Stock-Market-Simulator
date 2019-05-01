/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarketsimulator;

/**
 *
 * @author ms
 */
public class Transaction {

    private int id;
    private Simulator simulator;

    public Transaction(int id) {
        this.id = id;
        this.simulator = Simulator.getInstance();
    }

    public int getId() {
        return id;

    }

    public Simulator getSimulator() {
        return simulator;
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + id + ", simulator=" + simulator + '}';
    }
    
    
}
