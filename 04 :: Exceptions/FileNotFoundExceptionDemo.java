import java.nio.file.Files;
import java.nio.file.Path;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("C:/help.txt");
        System.out.println("File content = "+ Files.readString(filePath));
    }
}
