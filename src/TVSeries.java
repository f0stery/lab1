import java.time.LocalDate;
import java.util.Set;

/**
 * Класс для представления аниме-сериалов
 */
public class TVSeries extends Anime {
    private int seasonCount;

    public TVSeries(Set<String> genres, double rating, int episodeCount,
                    LocalDate releaseDate, int seasonCount) {
        super(genres, rating, episodeCount, releaseDate);
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