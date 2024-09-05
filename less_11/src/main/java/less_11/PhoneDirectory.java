package less_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {

    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        // Проверяем, есть ли уже такая фамилия в справочнике
        if (!directory.containsKey(surname)) {
            // Если фамилии еще нет, создаем новый список для номеров
            directory.put(surname, new ArrayList<>());
        }
        // Добавляем номер в список для данной фамилии
        directory.get(surname).add(phoneNumber);
    }

    // Метод get возвращает список номеров по фамилии
    public List<String> get(String surname) {
        // Если фамилия найдена, возвращаем список номеров
        // Если фамилии нет в справочнике, возвращаем пустой список
        return directory.getOrDefault(surname, new ArrayList<>());
    }

    public static void start() {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Kapustin", "123-456-789");
        phoneDirectory.add("Petrov", "987-654-321");
        phoneDirectory.add("Kapustin", "555-555-555");
        phoneDirectory.add("Sidorov", "111-222-333");
        phoneDirectory.add("Kapustin", "888-888-888");

        System.out.println("Телефоны Капустина: " + phoneDirectory.get("Kapustin"));
        System.out.println("Телефоны Петрова: " + phoneDirectory.get("Petrov"));
        System.out.println("Телефоны Сидорова: " + phoneDirectory.get("Sidorov"));
        System.out.println("Телефоны Смирнова (не добавлен в справочник): " + phoneDirectory.get("Smirnov"));
    }
}



