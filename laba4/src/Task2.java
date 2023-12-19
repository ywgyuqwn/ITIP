import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String sourceFileName = "source.txt";
        String destinationFileName = "destination.txt";

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File sourceFile = new File(sourceFileName);
            File destinationFile = new File(destinationFileName);


            // Создание потоков чтения и записи файлов
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(destinationFile);

            // Копирование содержимого
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            // Закрытие потоков чтения и записи файлов


            System.out.println("Файл успешно скопирован.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла.");
        } finally {
            fileReader.close();
            fileWriter.close();
        }
    }
}