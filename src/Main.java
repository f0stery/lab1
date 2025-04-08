import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();

        // 1. Сериалы
        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Фэнтези", "Приключения", "Боевик")),
                9.2,
                25,
                LocalDate.of(2012, 4, 7)
        )); // Attack on Titan

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Драма", "Психологическое", "Триллер")),
                8.8,
                12,
                LocalDate.of(2014, 7, 8)
        )); // Tokyo Ghoul

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Комедия", "Повседневность", "Романтика")),
                8.5,
                13,
                LocalDate.of(2007, 4, 8)
        )); // Lucky Star

        // 2. ONA (Original Net Animation)
        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Фантастика", "Драма", "Приключения")),
                8.7,
                10,
                LocalDate.of(2020, 12, 18)
        )); // Great Pretender

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Ужасы", "Мистика", "Детектив")),
                7.9,
                12,
                LocalDate.of(2022, 1, 15)
        )); // Exception (Netflix)

        // 3. OVA (Original Video Animation)
        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Боевик", "Киберпанк")),
                8.1,
                1,
                LocalDate.of(1995, 11, 21)
        )); // Ghost in the Shell OVA

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Комедия", "Пародия")),
                7.0,
                2,
                LocalDate.of(2011, 8, 14)
        )); // Carnival Phantasm

        // 4. Дополнительные примеры
        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Исекай", "Фэнтези", "Приключения")),
                8.3,
                23,
                LocalDate.of(2016, 4, 3)
        )); // Re:Zero

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Спокон", "Драма")),
                9.0,
                75,
                LocalDate.of(2015, 3, 22)
        )); // Haikyuu!!

        animeList.add(new Anime(
                new HashSet<>(Arrays.asList("Космос", "Политика", "Драма")),
                8.9,
                26,
                LocalDate.of(1998, 10, 16)
        )); // Legend of the Galactic Heroes

        // Вывод всех аниме
        System.out.println("Все аниме в списке:");
        animeList.forEach(System.out::println);

        // Примеры фильтрации:
        System.out.println("\nАниме с рейтингом > 8.5:");
        animeList.stream()
                .filter(a -> a.getRating() > 8.5)
                .forEach(System.out::println);

        System.out.println("\nАниме, вышедшие после 2020 года:");
        animeList.stream()
                .filter(a -> a.getReleaseDate().getYear() >= 2020)
                .forEach(System.out::println);
    }

    /**
     * Возвращает топ-3 самых популярных жанров.
     */
    private static List<String> getMostCommonGenres(List<Anime> animeList) {
        Map<String, Integer> genreCount = new HashMap<>();

        for (Anime anime : animeList) {
            for (String genre : anime.getGenres()) {
                genreCount.put(genre, genreCount.getOrDefault(genre, 0) + 1);
            }
        }

        return genreCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}