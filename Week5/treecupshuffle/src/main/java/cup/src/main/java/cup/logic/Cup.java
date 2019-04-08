package cup.src.main.java.cup.logic;

import org.springframework.stereotype.Service;

@Service
public class Cup {

    private boolean coin;

    public boolean hasCoin() {
        return coin;
    }

    public void placeCoin() {
        coin = true;
    }

    public void removeCoin() {
        coin = false;
    }

}
