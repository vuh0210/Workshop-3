package prereq;

import java.util.ArrayList;

public class GoodsWebsite {

   public static void main(String[] args) {
      
      // Create a database
      GoodsDatabase database = new GoodsDatabase();

      // TODO: Create three listings, setting the properties,
      //       and add to the database
      Listing item = new Listing();
      database.addListing(item);
      
      // Get the number of items in the database
      int count = database.getDatabaseSize();
      System.out.println("Number of listing in the database: " + count);
      System.out.println();

      // TODO: Output all of the items in the database
      System.out.println("All listing in the database:");
      ArrayList<Listing> allItems = database.getAllListings();
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();


      // TODO: Output all of the items that match a given title
      String title = "Title";
      System.out.println("All listing in the database that match '" + title + "':");
      allItems = database.getListingsByTitle(title);
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();
   }
}