package x_o;

import java.io.FileOutputStream;
import java.io.IOException;

public class FieldSaver {
    public static void saveFieldToFile(Field field, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (int value : field.getField()) {
                fos.write(value);
            }
            System.out.println("Состояние поля сохранено в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
            e.printStackTrace();
        }
    }
}