package prereq;

import java.util.ArrayList;

public class GoodsDatabase {

   private ArrayList<Listing> goods;

   public GoodsDatabase() {
      // Make goods an empty ArrayList of Listings
      goods = new ArrayList<Listing>();
   }

   // Put a new Listing in the database
   public void addListing(Listing listing) {
      goods.add(listing);
   }

   // Get the number of listings in the database
   int getDatabaseSize() {
      // TODO: Implement
      return 0;
   }

   public ArrayList<Listing> getAllListings() {
      // TODO: Implement
      return new ArrayList<Listing>();
   }

   public ArrayList<Listing> getListingsByTitle(String title) {
      // TODO: Implement
      return new ArrayList<Listing>();
   }

}