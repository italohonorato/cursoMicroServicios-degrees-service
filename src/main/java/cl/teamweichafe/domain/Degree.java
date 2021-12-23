package cl.teamweichafe.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Document("degrees")
public class Degree {

    @Id
    private String id;
    private String name;
    private String desc;
}