package inheritance;

import java.util.ArrayList;

public class Theater extends ZelpBase{

    ArrayList<String> movieList;

    public Theater(){
        super(null);
        this.movieList = new ArrayList<>();
    }

    public ArrayList addMovie(String movie){
        movieList.add(movie);
        return movieList;
    }

    public ArrayList removeMovie(String movie){
        for (String list:movieList) {
            if(list == movie){
                movieList.remove(list);
            }
        }
        return movieList;
    }

}
