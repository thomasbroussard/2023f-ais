import fr.epita.biostat.datamodel.BioStatEntry;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TestPersonalDataLoading {

    public static void main(String[] args) throws IOException {
        List<BioStatEntry> entries;

        //Lines from the file
        File file = new File("data/biostat.csv");
        List<String> lines = Files.readAllLines(file.toPath());

        for(){
            String[] parts = sth.split(",");
            BioStatEntry entry = new BioStatEntry(parts[0], parts[1] ); //...);
            entries.add(entry);
        }

        //for each line, split over ","
        //for each part assign to the corresponding parameter in the constructor
        // then add a new instance of BioStatEntry to entries
        // then compute average, min, max, distributions, etc.
    }

}
