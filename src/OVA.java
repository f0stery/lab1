import java.time.LocalDate;
import java.util.Set;

public class OVA extends Anime {
    private boolean isStandalone;

    public OVA(String title, Set<String> genres, double rating, int episodeCount,
               LocalDate releaseDate, boolean isStandalone) {
        super(title, genres, rating, episodeCount, releaseDate);
        this.isStandalone = isStandalone;
    }

    public boolean isStandalone() { return isStandalone; }

    @Override
    public String toString() {
        return "OVA{" +
                "isStandalone=" + isStandalone +
                "} " + super.toString();
    }
}