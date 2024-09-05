package less_11;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayOfWords {
    public static void start() {
        // Создаем массив с набором слов, включая повторяющиеся
        String[] words = {
                "Яблоко", "Банан", "Яблоко", "Апельсин", "Банан",
                "Лимон", "Киви", "Ананас", "Абрикос", "Киви",
                "Персик", "Виноград", "Лимон", "Мандарин", "Яблоко"
        };

        // HashSet для хранения уникальных слов
        Set<String> arrayOfWords = new HashSet<>();

        // HashMap для хранения слов и их количества
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {

            arrayOfWords.add(word);

            // Считаем сколько раз повторяется слово
            if (wordCount.containsKey(word)) {
                // Если слово уже есть, увеличиваем счетчик
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Если слово еще не добавлено, добавляем его с начальным счетчиком 1
                wordCount.put(word, 1);
            }
        }

        // Выводим список уникальных слов
        System.out.println("Уникальные слова: " + arrayOfWords);

        // Выводим сколько раз встречаются слова
        System.out.println("Сколько раз встречается слово:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


