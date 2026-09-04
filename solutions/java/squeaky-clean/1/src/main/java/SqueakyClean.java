class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;

        for(int i = 0 ; i < identifier.length() ; i++) {
            char ch = identifier.charAt(i);

            if(ch == ' ')
                builder.append("_");
            else if(ch == '-')
                capitalizeNext = true;
            else if(ch == '4')
                builder.append('a');
            else if(ch == '3')
                builder.append('e');
            else if(ch == '0')
                builder.append('o');
            else if(ch == '1')
                builder.append('l');
            else if(ch == '7')
                builder.append('t');
            else if(Character.isLetter(ch)){
                if(capitalizeNext){
                    builder.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                }
                else 
                    builder.append(ch);
                
                    
            }        
        }
        return builder.toString();
        
    }
}
