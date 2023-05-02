package day31_PracticeTasks.MovieTask;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Journey to SDET: Batch EU11", "Adventure, Comedy, Thriller", "10.25.2023", "Kuzzat Altay");
        MovieCast cast1 = new MovieCast("Burak");
        MovieCast cast2 = new MovieCast("Yunus");
        MovieCast cast3 = new MovieCast("Burak");
        MovieCast cast4 = new MovieCast("Çağrı");
        MovieCast casts[] = {cast2, cast3, cast4};

        movie1.addCast(cast1);
        movie1.addCast(casts);

        System.out.println(movie1);

    }
}
