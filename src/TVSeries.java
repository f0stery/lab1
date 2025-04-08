import java.time.LocalDate;
import java.util.Set;

public class TVSeries extends Anime {
    private int seasonCount;

    public TVSeries(String title, Set<String> genres, double rating, int episodeCount,
                    LocalDate releaseDate, int seasonCount) {
        super(title, genres, rating, episodeCount, releaseDate);
        this.seasonCount = seasonCount;
    }

    public int getSeasonCount() { return seasonCount; }

    @Override
    public String toString() {
        return "TVSeries{" +
                "seasonCount=" + seasonCount +
                "} " + super.toString();
    }
}