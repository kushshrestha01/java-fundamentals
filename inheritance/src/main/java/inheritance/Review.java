package inheritance;

public class Review{
    private String body;
    private String author;
    private String name;
    public int stars;
    public String movieName;

    public String getBody() {
        return body;
    }

    public String getAuthor() { return author; }

    //Method Overloading
    //Review for someone who just went in theater for popcorn
    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.name = null;
        this.movieName = null;
    }

    //Review for Restaurant or a Shop that doesn’t have to include which movie they saw!
    public Review(String name, String body, String author, int stars){
        this.name = name;
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movieName = null;
    }

    //Review to hold a movie name
    public Review(String name, String movieName, String body, String author, int stars){
        this.name = name;
        this.movieName = name;
        this.body = body;
        this.author = author;
        this.stars = stars;
    }


    public String toString() {
        return String.format("Review: " + this.body + ", by " + this.author);
    }

    public String toStringSecond() {
        return String.format("Restaurant: " + this.name + " Review: " + this.body + ", by " + this.author);
    }

}
