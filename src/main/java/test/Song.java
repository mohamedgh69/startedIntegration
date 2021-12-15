package test;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Song {


    @CsvBindByName(column = "id", required = true) private String id;
    @CsvBindByName(column = "Title", required = true) private String title;
    @CsvBindByName(column = "Date", required = true) private int date;
    @CsvBindByName(column = "Listening", required = true) private String listening;


}

