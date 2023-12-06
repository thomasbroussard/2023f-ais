import fr.epita.hdi.datamodel.HDIEntry;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TestFileLoading {

    public static void main(String[] args) throws IOException {
        File file = new File("data/Data.csv");

        List<String> lines = Files.readAllLines(file.toPath());

        System.out.println(lines.get(0));

        HDIEntry hdiEntry = new HDIEntry(1, "test", 0.9);

        //now instead of a List<String>, I want a List<HDIEntry>

        List<HDIEntry> hdiEntryList = new ArrayList<>();

        //iterate through all the lines
        //for each line, split the line upon "," character :
        // String[] parts = line.split(",");
        // create an hdi entry and fill the constructor with the corresponding value
        lines.remove(0);
        for(String line: lines){
            String[] parts = line.split(",");
            HDIEntry currentEntry = new HDIEntry(Integer.parseInt(parts[0].strip()), parts[1], Double.parseDouble(parts[2]));
            hdiEntryList.add(currentEntry);
        }

        double totalHdi = 0.0;
        for (HDIEntry entry : hdiEntryList ){
            totalHdi += entry.getHdi();
        }
        System.out.println("average HDI = "  + totalHdi / hdiEntryList.size());

        double average = hdiEntryList.stream()
                .mapToDouble(h -> h.getHdi())
                .average().getAsDouble();

    }
}
