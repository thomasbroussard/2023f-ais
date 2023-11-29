import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TestFileLoading {

    public static void main(String[] args) throws IOException {
        File file = new File("data/Data.csv");

        List<String> lines = Files.readAllLines(file.toPath());

        System.out.println(lines.get(0));



    }
}
