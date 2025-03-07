import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MovieRatingAppTest{
    @Test
    MovieRatingApp input = new MovieRatingApp();
    public void testThatMovieRatingAppCanAddMovies(){
       String actual = ("Koto added successfully!");
       String result = addMovies(Koto);
        assertEquals(actual, result);
    }
}
