/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auctionexamplesda;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private Product product;
    private Owner owner;
    private List<Bidder> bidders;

    public Auction(Product product, Owner owner) {
        this.product = product;
        this.owner = owner;
        this.bidders = new ArrayList<>();
    }

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void startAuction() {
        System.out.println("Auction started for product: " + product.getName());
        System.out.println("Base Price: " + product.getBasePrice());
        System.out.println("Owner: " + owner.getName());
    }

    public void showBids() {
        System.out.println("\nBids received:");
        for (Bidder bidder : bidders) {
            System.out.println(bidder.getName() + " placed a bid of: " + bidder.getBidAmount());
        }
    }

    public void endAuction() {
        double highestBid = 0.0;
        Bidder winner = null;

        for (Bidder bidder : bidders) {
            if (bidder.getBidAmount() > highestBid) {
                highestBid = bidder.getBidAmount();
                winner = bidder;
            }
        }

        System.out.println("\nAuction ended!");
        if (winner != null && highestBid >= product.getBasePrice()) {
            System.out.println("Winner: " + winner.getName() + " with a bid of: " + highestBid);
        } else {
            System.out.println("No winner. No bids met the base price.");
        }
    }
}