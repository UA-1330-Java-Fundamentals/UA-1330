package FinalProjectEncrypt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager extends AbstractFileProcessor {
    @Override
    public String read(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            printError("❌ Unable to read file: " + path);
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public void write(String path, String content) {
        try {
            Files.createDirectories(Paths.get(path).getParent());
            Files.writeString(Paths.get(path), content);
        } catch (IOException e) {
            printError("❌ Unable to write file: " + path);
            e.printStackTrace();
        }
    }

}
