import java.util.HashMap;
public class MovieRatingApp{
    HashMap<String, String> movies = new HashMap<String, String>();
    public void display(){
        System.out.print("""
        Welcome to Olamide Movie Rating App
        1. Add a Movie
        2. Rate a Movie
        3. View Average Ratings
        4. Exit
        """);
    }
	public HashMap<String, String> addMovies(String movie){
        movies.put("movie", movie);
        return movies;
    }

    public HashMap<String, String> rateAMovie(float number){
       for(String movie: movies){
        movies.put()
       }
    }

        
    

}