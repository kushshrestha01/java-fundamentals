package inheritance;

import java.util.ArrayList;

public class Restaurant extends ZelpBase {
    private int stars;
    private String price;
    ArrayList<Review> reviewList = new ArrayList<Review>();

    public Restaurant(String name, int stars, String price){
        super(name);
        this.stars = stars;
        this.price = price;
    }

    public int getStars() { return stars; }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return String.format(this.getName() + " has " + this.stars + " stars and the price is " + this.price);
    }

    @Override
    public ArrayList<Review> addReview(Review review) {
            reviewList.add(review);
            int totalStar = 0;
            for (Review list:reviewList) {
                totalStar += list.stars;
            }
            this.stars = totalStar / reviewList.size();

            return reviewList;
    }
}
