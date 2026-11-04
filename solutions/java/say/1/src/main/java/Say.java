public class Say {

    private final String[] LESS_THAN_20 = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    private final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private final String[] SCALE = {
        "", "thousand", "million", "billion"
    };

    public String say(long number) {
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999");
        }

        if (number == 0) {
            return "zero";
        }

        String result = "";
        long temp = number;
        int scaleIndex = 0;

        while (temp > 0) {
            int chunk = (int) (temp % 1000);
            if (chunk > 0) {
                String chunkText = convertChunk(chunk);
                if (!SCALE[scaleIndex].isEmpty()) {
                    chunkText += " " + SCALE[scaleIndex];
                }
                result = result.isEmpty() ? chunkText : chunkText + " " + result;
            }
            temp /= 1000;
            scaleIndex++;
        }

        return result;
    }

    private String convertChunk(int number) {
        StringBuilder sb = new StringBuilder();

        // Hundreds place
        if (number >= 100) {
            sb.append(LESS_THAN_20[number / 100]).append(" hundred");
            number %= 100;
            if (number > 0) {
                sb.append(" ");
            }
        }

        // Tens and ones places
        if (number >= 20) {
            sb.append(TENS[number / 10]);
            if (number % 10 > 0) {
                sb.append("-").append(LESS_THAN_20[number % 10]);
            }
        } else if (number > 0) {
            sb.append(LESS_THAN_20[number]);
        }

        return sb.toString();
    }
}