class Acronym {
    private final String acronym;
        
    Acronym(String phrase) {
        StringBuilder sb = new StringBuilder();

        String cleanedPhrase = phrase.replace("-"," ");
        String[] words = cleanedPhrase.split("\\s+");

        for(String word : words) {
            String trimmedWord = word.replaceAll("^[^a-zA-Z]+", "");
            if(!trimmedWord.isEmpty()) {
                sb.append(Character.toUpperCase(trimmedWord.charAt(0)));
            }
        }
        
        this.acronym = sb.toString();
    }

    String get() {
        return acronym;
    }

}
