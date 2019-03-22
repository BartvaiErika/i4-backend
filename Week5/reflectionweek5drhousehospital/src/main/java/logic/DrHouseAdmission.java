package logic;

import domain.Patient;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class DrHouseAdmission {

    public Patient admit (Patient patient) {
        UUID id = UUID.randomUUID();
        patient.setId(id);
        return patient;
    }
}
