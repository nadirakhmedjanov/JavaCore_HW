package backup_maker;

import java.io.File;

public class BackupCreator {

    public static void createBackup(String sourceDir) {
        File sourceDirectory = new File(sourceDir);
        File backupDirectory = new File("./backup");

        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }

        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                FileBackup fileBackup = new FileBackup(file);
                fileBackup.backupTo(backupDirectory); 
            }
        } else {
            System.out.println("Директория не найдена или пуста.");
        }
    }
}