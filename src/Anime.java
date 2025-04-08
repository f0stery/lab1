import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;


/**
 * Базовый класс для представления аниме.
 * Содержит: жанры, рейтинг, количество серий, дату выхода.
 */
public class Anime {
    private Set<String> genres;  // Коллекция жанров (без дубликатов)
    private double rating;       // Рейтинг (например, 8.5)
    private int episodeCount;    // Количество серий
    private LocalDate releaseDate; // Дата выхода

    /**
     * Конструктор класса Anime.
     * @param genres коллекция жанров
     * @param rating рейтинг аниме (от 0 до 10)
     * @param episodeCount количество серий
     * @param releaseDate дата выхода
     */
    public Anime(Set<String> genres, double rating, int episodeCount, LocalDate releaseDate) {
        this.genres = new HashSet<>(genres); // Защита от изменений извне
        this.rating = rating;
        this.episodeCount = episodeCount;
        this.releaseDate = releaseDate;
    }

    // Геттеры и сеттеры
    public Set<String> getGenres() {
        return new HashSet<>(genres); // Возвращаем копию для безопасности
    }

    public double getRating() {
        return rating;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

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
                "Anime [Жанры: %s, Рейтинг: %.1f, Серий: %d, Дата выхода: %s]",
                genres, rating, episodeCount, releaseDate
        );
    }
}