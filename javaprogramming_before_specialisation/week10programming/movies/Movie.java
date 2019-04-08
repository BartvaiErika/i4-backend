package week10programming.movies;

public class Movie {

    private String genres;
    private String id;
    private Long revenue;
    private Integer runtime;
    private String title;

    public Movie(String genres, String id, Long revenue, Integer runtime, String title) {
        this.genres = genres;
        this.id = id;
        this.revenue = revenue;
        this.runtime = runtime;
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public String getId() {
        return id;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }

//    @Override
//    public String toString() {
//        return "Movie genres: " + genres.toString() +
//                ", ID: " + id.toString() +
//                ", revenue: " + revenue.toString() +
//                ", runtime: " + runtime.toString() +
//                ", title: " + title.toString();
//    }
        @Override
    public String toString() {
        return "Title: " + title + " Runtime: " + runtime;
    }


}
