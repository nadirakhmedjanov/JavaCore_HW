import java.io.File;
import backup_maker.BackupCreator;
import x_o.Field;
import x_o.FieldSaver;

public class Main {

    public static void main(String[] args) {
        BackupCreator.createBackup("."); // Резервное копирование файлов
        saveGameBoard(); // Сохранение состояния доски игры
    }

    /**
     * Создает объект доски и сохраняет его состояние в файл.
     */
    private static void saveGameBoard() {
        int[] boardData = {1, 2, 0, 2, 1, 0, 1, 0, 0}; // Состояние игрового поля
        Field field = new Field(boardData); // Создаем объект доски

        // Директория для сохранения
        String backupDir = "backup";
        File directory = new File(backupDir);

        // Проверка и создание директории
        if (!directory.exists()) {
            directory.mkdir();
        }

        // Сохранение файла в директорию backup
        FieldSaver.saveFieldToFile(field, backupDir + "/board.dat"); // Сохраняем доску в файл
    }
}
