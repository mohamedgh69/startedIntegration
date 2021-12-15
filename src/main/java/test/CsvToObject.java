package test;

import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.StringReader;

@Component
public class CsvToObject {

    @SneakyThrows
    public Song Song(String o) {

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Song.builder()
                .id(parts[0])
                .title(parts[1])
                .date(Integer.parseInt(parts[2]))
                .listening((parts[3]))
                .build();
    }

    @SneakyThrows
    public Singer Singer(String o) {

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Singer.builder()
                .label(parts[0])
                .id(parts[1])
                .name(parts[2])
                .build();
    }
}
