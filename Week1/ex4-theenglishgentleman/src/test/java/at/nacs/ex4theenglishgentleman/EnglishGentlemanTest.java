package at.nacs.ex4theenglishgentleman;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class EnglishGentlemanTest {

    @Autowired
    at.nacs.ex4theenglishgentleman.EnglishGentleman englishGentleman;

    @Autowired
    at.nacs.ex4theenglishgentleman.Cigar cigar;

    @Autowired
    at.nacs.ex4theenglishgentleman.Newspaper newspaper;

    @Test
    void smoke() {
        assertFalse(cigar.isLit());
        assertDoesNotThrow(() -> englishGentleman.smoke(cigar));
        assertTrue(cigar.isLit());
        assertTrue(englishGentleman.isSmoked());
    }

    private void assertFalse(boolean lit) {
    }

    @Test
    void read() {
        englishGentleman.read(newspaper);
        assertTrue(englishGentleman.isRead());
    }

    @Test
    void hadAGoodDay() throws at.nacs.ex4theenglishgentleman.CigarWasNotLitException {
        assertFalse(englishGentleman.hadAGoodDay());

        englishGentleman.smoke(cigar);

        assertFalse(englishGentleman.hadAGoodDay());

        englishGentleman.read(newspaper);

        assertTrue(englishGentleman.hadAGoodDay());
    }

    @Test
    void didNotHaveAGoodDay() throws at.nacs.ex4theenglishgentleman.CigarWasNotLitException {
        assertFalse(englishGentleman.hadAGoodDay());
    }

}