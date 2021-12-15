package test;

import com.opencsv.CSVReader;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.StringReader;

@Component
public class ToObject {

    @SneakyThrows
    public Song Song(String o) {

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Song.builder()
                .label(parts[0])
                .id(parts[1])
                .title(parts[2])
                .date(Integer.parseInt(parts[3]))
                .listening(Integer.parseInt(parts[4]))
                .build();
    }

    @SneakyThrows
    public Singer Singer(String o) {

        CSVReader reader = new CSVReader(new StringReader(o));
        String[] parts = reader.readNext();

        return Singer.builder()
                .id(parts[0])
                .name(parts[1])
                .build();
    }
}
