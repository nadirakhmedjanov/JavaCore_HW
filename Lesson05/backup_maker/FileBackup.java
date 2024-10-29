package backup_maker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class FileBackup {
    private File file;

    public FileBackup(File file) {
        this.file = file;
    }

    
    public void backupTo(File destinationDirectory) {
        if (file.isFile()) {
            Path sourcePath = file.toPath();
            Path destinationPath = new File(destinationDirectory, file.getName()).toPath();
            try {
                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Скопирован файл: " + file.getName());
            } catch (IOException e) {
                System.err.println("Ошибка при копировании файла: " + file.getName());
                e.printStackTrace();
            }
        }
    }
}