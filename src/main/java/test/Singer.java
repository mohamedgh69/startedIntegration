package test;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Singer {

    private String label;
    private String id;
    private String name;

}