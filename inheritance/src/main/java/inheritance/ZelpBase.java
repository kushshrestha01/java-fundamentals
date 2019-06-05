package inheritance;

import java.util.ArrayList;

public class ZelpBase {
    private String name;
    ArrayList<Review> reviewList;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public ZelpBase(String name){
        this.name = name;
        this.reviewList = new ArrayList<>();
    }

    public ArrayList<Review> addReview(Review review) {
        reviewList.add(review);
        return reviewList;
    }

}
