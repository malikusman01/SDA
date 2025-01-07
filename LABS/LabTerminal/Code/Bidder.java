/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionexamplesda;

public class Bidder {
    private String name;
    private double bidAmount;

    public Bidder(String name) {
        this.name = name;
        this.bidAmount = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void placeBid(double amount) {
        this.bidAmount = amount;
    }
}