/**
 * Класс для представления ONA (Original Net Animation)
 */
import java.time.LocalDate;
import java.util.Set;
public class ONA extends Anime {
    private String platform;

    public ONA(Set<String> genres, double rating, int episodeCount,
               LocalDate releaseDate, String platform) {
        super(genres, rating, episodeCount, releaseDate);
        this.platform = platform;
    }

    public String getPlatform() { return platform; }

    @Override
    public String toString() {
        return "ONA{" +
                "platform='" + platform + '\'' +
                "} " + super.toString();
    }
}