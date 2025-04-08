import java.time.LocalDate;
import java.util.Set;

/**
 * Класс для представления OVA (Original Video Animation)
 */
public class OVA extends Anime {
    private boolean isStandalone;

    public OVA(Set<String> genres, double rating, int episodeCount,
               LocalDate releaseDate, boolean isStandalone) {
        super(genres, rating, episodeCount, releaseDate);
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