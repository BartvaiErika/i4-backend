package week9programming.filmsweek9;

import java.util.Date;

public class Film {
    protected String title;
    protected Double score;
    protected Integer voteCount;
    protected Integer runtime;
    protected Integer budget;
    protected String revenue;

    public Film(String title, Double score, Integer voteCount, Integer runtime, Integer budget, String revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getBudget() {
        return budget;
    }

    public String getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return title + ". ";
    }
}
