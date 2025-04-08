import java.time.LocalDate;
import java.util.Set;
public class ONA extends Anime {
    private String platform;

    public ONA(String title, Set<String> genres, double rating,
               int episodeCount, LocalDate releaseDate, String platform) {
        super(title, genres, rating, episodeCount, releaseDate); // 5 параметров
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