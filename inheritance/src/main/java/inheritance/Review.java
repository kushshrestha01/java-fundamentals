package inheritance;

public class Review{
    private String body;
    private String author;
    private String name;
    public int stars;

    public String getBody() {
        return body;
    }

    public String getAuthor() { return author; }


    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String name, String body, String author, int stars){
        this.name = name;
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
