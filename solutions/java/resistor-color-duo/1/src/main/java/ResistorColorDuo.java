import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {

    private final List<String> colors = Arrays.asList(
        "black", "brown", "red", "orange", "yellow", 
        "green", "blue", "violet", "grey", "white"
    );

    int value(String[] inputColors) {
        int firstDigit = colors.indexOf(inputColors[0]);
        int secondDigit = colors.indexOf(inputColors[1]);

        return (firstDigit * 10) + secondDigit;
    }
}