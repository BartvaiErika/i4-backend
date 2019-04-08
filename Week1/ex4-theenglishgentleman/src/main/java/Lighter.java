package at.nacs.ex4theenglishgentleman;
import org.springframework.stereotype.Component;


@Component
public class Lighter {
    public void light(at.nacs.ex4theenglishgentleman.Cigar cigar) {
        cigar.setLit(true);
    }
}
