package domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Data
@NoArgsConstructor
@Builder
public class Patient {
    private UUID id;
    private String name;
    private String symptoms;
    private String diagnose;
    private String treatment;
}
