import java.util.Arrays;
import java.util.List;
class ResistorColorTrio {
    private static final List<String> COLORS = Arrays.asList(
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    );
    
    String label(String[] colors) {
        int mainValue = COLORS.indexOf(colors[0]) * 10 + COLORS.indexOf(colors[1]);
        int zeros = COLORS.indexOf(colors[2]);

        long ohms = mainValue * (long) Math.pow(10, zeros);

        if (ohms >= 1_000_000_000) {
            return (ohms / 1_000_000_000) + " gigaohms";
        } else if (ohms >= 1_000_000) {
            return (ohms / 1_000_000) + " megaohms";
        } else if (ohms >= 1_000) {
            return (ohms / 1_000) + " kiloohms";
        } else {
            return ohms + " ohms";
        }
    }
}
