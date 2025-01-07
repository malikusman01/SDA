package auctionexamplesda;


public class AuctionSystem {
 public static void main(String[] args) {
        // Create Owner and Product
        Owner owner = new Owner("John Doe");
        Product product = new Product("Laptop", 500.0);

        // Create Auction
        Auction auction = new Auction(product, owner);

        // Create Bidders
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        // Add Bidders to Auction
        auction.addBidder(bidder1);
        auction.addBidder(bidder2);

        // Start Auction
        auction.startAuction();

        // Bidders place bids
        bidder1.placeBid(600.0);
        bidder2.placeBid(700.0);

        // Show Bids
        auction.showBids();

        // End Auction
        auction.endAuction();
    }
    
}
