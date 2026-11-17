import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class DiamondPrinter {

    List<String> printToList(char a) {
        int n = a - 'A';
        List<String> diamond = new ArrayList<>(2 * n + 1);

        for(int i = 0; i <= n ; i++) {
            diamond.add(buildRow(n, i));
        }

        for(int i = n - 1; i >= 0 ; i--) {
            diamond.add(diamond.get(i));
        }
        return diamond;
    }

    private String buildRow(int n , int i) {
        char[] row = new char[2 * n + 1];
        Arrays.fill(row, ' ');

        char letter = (char) ('A' + i);
        row[n - i] = letter;
        row[n + i] = letter;

        return new String(row);
    }
    

}
