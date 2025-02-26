package zafar.net.sport3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.LocalDate;

@Data
public class ScoreRequest {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("birthDate")
    private LocalDate birthDate;

    @JsonProperty("run100m")
    private double run100m;

    @JsonProperty("run3000m")
    private double run3000m;

    @JsonProperty("pullUp")
    private int pullUp;
}
