package at.nacs.ex4theenglishgentleman;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
@RequiredArgsConstructor
@Scope("prototype")
public class EnglishGentleman {

    private at.nacs.ex4theenglishgentleman.Monocle monocle;
    private at.nacs.ex4theenglishgentleman.Lighter lighter;
    @Getter
    private boolean smoked;
    @Getter
    private boolean read;

    public void smoke (at.nacs.ex4theenglishgentleman.Cigar cigar)
            throws at.nacs.ex4theenglishgentleman.CigarWasNotLitException {
          lighter.light(cigar);
          cigar.smoke();
          smoked=true;
    }


    public void read (at.nacs.ex4theenglishgentleman.Newspaper newspaper) {
        monocle.read(newspaper);
        read=true;
    }

    public boolean hadAGoodDay() {
        return smoked&&read;
    }
}
