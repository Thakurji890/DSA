import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();
        for(Signal signal : Signal.values()) {
            if((number & ( 1 << signal.ordinal())) != 0) {
                handshake.add(signal);
            }
        }
        if((number & 16) != 0) {
            Collections.reverse(handshake);
        }
        return handshake;
    }

}
