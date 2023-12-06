import fr.epita.biostat.datamodel.BioStatEntry;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

public class TestPersonalDataLoading {

    public static void main(String[] args) throws IOException {
        List<BioStatEntry> entries = new ArrayList<>();

        //Lines from the file
        File file = new File("data/biostat.csv");
        List<String> lines = Files.readAllLines(file.toPath());

        lines.remove(0);
        for(String line : lines){
            String[] parts = line.split(",");

            //"Name",     "Sex", "Age", "Height (in)", "Weight (lbs)"
            //"Alex",       "M",   41,       74,      170
            Integer age = parseInt(parts[2]);
            Integer height = parseInt(parts[3]);
            Integer weight = parseInt(parts[4]);
            Function<String,String> parseStringFunction = s -> s.replace("\"", "").trim();
            String name = parseStringFunction.apply(parts[0]);
            String sex = parseStringFunction.apply(parts[1]);
            BioStatEntry entry = new BioStatEntry(name, sex, age, height, weight);
            entries.add(entry);
        }

        //for each line, split over "," => OK
        //for each part assign to the corresponding parameter in the constructor => OK
        // then add a new instance of BioStatEntry to entries => OK
        // then compute average, min, max, distributions, etc.

        Integer totalAge = 0;
        for (BioStatEntry entry: entries){
            totalAge += entry.getAge();
        }
        double averageAge = Double.valueOf(totalAge) / entries.size();

        System.out.println( "min height" + getHeightStream(entries).min().getAsInt());
        System.out.println( "max height" + getHeightStream(entries).max().getAsInt());
        System.out.println( "average height" + getHeightStream(entries).average().getAsDouble());


        Map<Integer, Integer> countByAge = new LinkedHashMap<>();
        entries.sort(Comparator.comparing(BioStatEntry::getAge));
        Collections.sort(entries, new Comparator<BioStatEntry>() {
            @Override
            public int compare(BioStatEntry o1, BioStatEntry o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        Collections.sort(entries, (o1, o2) ->  o2.getAge() - o1.getAge());


        for (BioStatEntry entry : entries){
            Integer currentCountForAge = countByAge.get(entry.getAge());
            if (currentCountForAge == null){
                currentCountForAge = 0;
            }
            countByAge.put(entry.getAge(), currentCountForAge + 1);
        }

        System.out.println(countByAge);

        // Create Chart
        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Count of people By Age").xAxisTitle("Age").yAxisTitle("Count").build();        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        // Series
        List<Integer> labels = new ArrayList<>();
        labels.addAll(countByAge.keySet());

        List<Integer> values = new ArrayList<>();
        values.addAll(countByAge.values());

        chart.addSeries("count by age",
                labels,
                values);

        new SwingWrapper<>(chart).displayChart();
    }

    private static IntStream getHeightStream(List<BioStatEntry> entries) {
        return entries
                .stream()
                .mapToInt(BioStatEntry::getHeight);
    }

    private static int parseInt(String part) {
        return Integer.parseInt(part.trim());
    }

}
