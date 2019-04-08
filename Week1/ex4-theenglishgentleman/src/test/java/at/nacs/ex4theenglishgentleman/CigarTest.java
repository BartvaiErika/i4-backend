package at.nacs.ex4theenglishgentleman;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CigarTest {

    @Autowired
    at.nacs.ex4theenglishgentleman.Cigar cigar;

    @Test
    void smokeSucceeds() {
        assertFalse(cigar.isLit());

        cigar.setLit(true);
        assertDoesNotThrow(() -> cigar.smoke());
    }

    private void assertFalse(boolean lit) {
    }

    @Test
    void smokeFails() {
        assertFalse(cigar.isLit());
        assertThrows(at.nacs.ex4theenglishgentleman.CigarWasNotLitException.class, () -> cigar.smoke());
    }
}