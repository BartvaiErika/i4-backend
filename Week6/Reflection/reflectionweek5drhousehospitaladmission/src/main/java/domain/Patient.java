package domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
public class Patient {
    private UUID id;
    private String name;
    private String symptoms;
}
