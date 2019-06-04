package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private String price;
    ArrayList<Review> reviewList = new ArrayList<Review>();

    public Restaurant() {}
    public Restaurant(String name, int stars, String price){
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return String.format(this.name + " has " + this.stars + " stars and the price is " + this.price);
    }

    public ArrayList<Review> addReview(Review review) {
            reviewList.add(review);
            int recentStar = 0;
            for (Review list:reviewList) {
                recentStar += list.stars;
            }
            this.stars = recentStar / reviewList.size();

            return reviewList;
    }
}
