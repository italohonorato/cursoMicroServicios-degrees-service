package cl.teamweichafe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Getter
@Setter
@Document("degrees")
public class Degree {

    @Id
    private String id;
    private String name;
    private String desc;
}