public class PangramChecker {

    public boolean isPangram(String input) {
        if(input == null)
            return false;
        String lowerInput = input.toLowerCase();
        for(char ch = 'a' ; ch <= 'z' ; ch++) {
            if(lowerInput.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

}
