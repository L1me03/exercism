class SqueakyClean {
    static String clean(String identifier) {
        if(identifier == null){
            return ("Can't be null");
        }
        
        identifier = replaceWhitespace(identifier);
        identifier = convertKebabToCamel(identifier);
        identifier = convertToNormalText(identifier);
        identifier = removeDigits(identifier);
        
        return identifier;
        
    }

    
    private static String replaceWhitespace(String text) {
    return text.replace(' ', '_');
    }


     private static String convertKebabToCamel(String text) {
        StringBuilder builder = new StringBuilder();
        boolean makeUpperCaseNext = false;

        for (char ch : text.toCharArray()) {
            if (ch == '-') {
                makeUpperCaseNext = true;
            } else {
                if (makeUpperCaseNext) {
                    builder.append(Character.toUpperCase(ch));
                    makeUpperCaseNext = false;
                } else {
                    builder.append(ch);
                }
            }
        }

        return builder.toString();
    }

    private static String convertToNormalText(String text){
        return text
            .replace('4','a')
            .replace('3','e')
            .replace('0','o')
            .replace('1','l')
            .replace('7','t');
    }

    private static String removeDigits(String text){
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
         char c = text.charAt(i);
            if (Character.isLetter(c) || c == '_') {
                builder.append(c);
            }
        }return builder.toString();
            
        }
}
