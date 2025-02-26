package zafar.net.sport3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SportScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double ball;
    private Double run100m;
    private Double run3000m;
    private Integer pullUp;
}
