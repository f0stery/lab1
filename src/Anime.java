import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

public class Anime {
    private String title;       // Название аниме
    private Set<String> genres;
    private double rating;
    private int episodeCount;
    private LocalDate releaseDate;

    public Anime(String title, Set<String> genres, double rating, int episodeCount, LocalDate releaseDate) {
        this.title = title;
        this.genres = new HashSet<>(genres);
        this.rating = rating;
        this.episodeCount = episodeCount;
        this.releaseDate = releaseDate;
    }

    // Геттеры
    public String getTitle() { return title; }
    public Set<String> getGenres() { return new HashSet<>(genres); }
    public double getRating() { return rating; }
    public int getEpisodeCount() { return episodeCount; }
    public LocalDate getReleaseDate() { return releaseDate; }

    /**
     * Проверяет, является ли аниме популярным (рейтинг > 7).
     * @return true, если рейтинг > 7
     */
    public boolean isPopular() {
        return rating > 7;
    }

    /**
     * Проверяет, вышло ли аниме недавно (в последние 2 года).
     * @return true, если аниме вышло недавно
     */
    public boolean isRecent() {
        return releaseDate.isAfter(LocalDate.now().minusYears(2));
    }

    @Override
    public String toString() {
        return String.format(
                "%s [Жанры: %s, Рейтинг: %.1f, Серий: %d, Дата выхода: %s]",
                title, genres, rating, episodeCount, releaseDate
        );
    }
}