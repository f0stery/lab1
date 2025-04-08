import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();

        // 1. Сериалы
        animeList.add(new Anime(
                "Attack on Titan",
                new HashSet<>(Arrays.asList("Фэнтези", "Приключения", "Боевик")),
                9.2,
                25,
                LocalDate.of(2012, 4, 7)
        ));

        animeList.add(new Anime(
                "Tokyo Ghoul",
                new HashSet<>(Arrays.asList("Драма", "Психологическое", "Триллер")),
                8.8,
                12,
                LocalDate.of(2014, 7, 8)
        ));

        animeList.add(new Anime(
                "Lucky Star",
                new HashSet<>(Arrays.asList("Комедия", "Повседневность", "Романтика")),
                8.5,
                13,
                LocalDate.of(2007, 4, 8)
        ));

        // 2. ONA (Original Net Animation)
        animeList.add(new Anime(
                "Great Pretender",
                new HashSet<>(Arrays.asList("Фантастика", "Драма", "Приключения")),
                8.7,
                10,
                LocalDate.of(2020, 12, 18)
        ));

        animeList.add(new Anime(
                "Exception",
                new HashSet<>(Arrays.asList("Ужасы", "Мистика", "Детектив")),
                7.9,
                12,
                LocalDate.of(2022, 1, 15)
        ));

        // 3. OVA (Original Video Animation)
        animeList.add(new Anime(
                "Ghost in the Shell",
                new HashSet<>(Arrays.asList("Боевик", "Киберпанк")),
                8.1,
                1,
                LocalDate.of(1995, 11, 21)
        ));

        animeList.add(new Anime(
                "Carnival Phantasm",
                new HashSet<>(Arrays.asList("Комедия", "Пародия")),
                7.0,
                2,
                LocalDate.of(2011, 8, 14)
        ));

        // 4. Дополнительные примеры
        animeList.add(new Anime(
                "Re:Zero",
                new HashSet<>(Arrays.asList("Исекай", "Фэнтези", "Приключения")),
                8.3,
                23,
                LocalDate.of(2016, 4, 3)
        ));

        animeList.add(new Anime(
                "Haikyuu!!",
                new HashSet<>(Arrays.asList("Спокон", "Драма")),
                9.0,
                75,
                LocalDate.of(2015, 3, 22)
        ));

        animeList.add(new Anime(
                "Legend of the Galactic Heroes",
                new HashSet<>(Arrays.asList("Космос", "Политика", "Драма")),
                8.9,
                26,
                LocalDate.of(1998, 10, 16)
        ));

        // Вывод всех аниме
        System.out.println("Все аниме в списке:");
        animeList.forEach(System.out::println);

        // Фильтрация по рейтингу
        System.out.println("\nАниме с рейтингом > 7:");
        animeList.stream()
                .filter(a -> a.getRating() > 7)
                .forEach(System.out::println);

        // Фильтрация по дате выхода
        System.out.println("\nАниме, вышедшие после 2020 года:");
        animeList.stream()
                .filter(a -> a.getReleaseDate().getYear() >= 2020)
                .forEach(System.out::println);

        // Популярные жанры
        System.out.println("\nСамые популярные жанры:");
        getMostCommonGenres(animeList).forEach(System.out::println);
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