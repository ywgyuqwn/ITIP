import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        // указываем путь к файлу
        String filePath = "C:\\Users\\Анжелика\\Desktop\\ИТиП\\text.txt";
        // создаем объект File
        File file = new File(filePath);
        // создаем объект Scanner для чтения файла
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        // создаем объект Map для хранения слов и их количества
        Map<String, Integer> wordCount = new HashMap<>();

        // читаем файл по словам и добавляем их в Map
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // закрываем Scanner
        scanner.close();

        // создаем список из элементов Map
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        // сортируем список по убыванию количества повторений
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // выводим топ-10 слов
        for (int i = 0; i < Math.min(list.size(), 10); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }
}
