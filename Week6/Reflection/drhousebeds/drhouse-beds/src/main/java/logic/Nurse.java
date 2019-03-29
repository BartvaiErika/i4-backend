package logic;

//Behaviour:
//POST a Patient with id, name, symptoms and diagnosis to /patients ->
//Provides the Patient with a treatment
//Later on: forwards the Patient to Accountancy

@RestController
@RequiredArgsConstructor
public class Nurse {

    RestTemplate restTemplate;

    @Bean
    public Patient treat(Patient patient) {
        patient.setTreatment("Go into bed!");
        return patient;
    }


//    public Patient provideTreatments(Patient patient) {
//        Stream.of(patient)
//                .map(Patient::getDiagnosis)
//                .map(book::get)
//                .peek(e -> patient.setTreatment(e))
//                .forEach(e -> repository.save(patient));
//        return patient;
//    }

}
