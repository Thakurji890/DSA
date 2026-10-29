class MicroBlog {
    public String truncate(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, count = 0; i < input.length() && count < 5; count++) {
            int codePoint = input.codePointAt(i);
            sb.appendCodePoint(codePoint);
            i += Character.charCount(codePoint);
        }
        return sb.toString();
    }
}