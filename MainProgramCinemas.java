public class MainProgramCinemas{
public static void main(String[] args) {
        int[][] cinemaTickets = {
                {1231, 1450, 3369, 1563},
                {2421, 2219, 2371, 3165},
                {1164, 3213, 1424, 2178},
                {3295, 2186, 2583, 1200},
                {3120, 3300, 1250, 2180}};
        
//CREATE OBJECT
        Cinemas cinemas = new Cinemas(cinemaTickets);

        cinemas.calculateCinemasTickets();

        cinemas.calculateCinemasTypeTickets();

        cinemas.calculateAllCinemasTickets();
    }}