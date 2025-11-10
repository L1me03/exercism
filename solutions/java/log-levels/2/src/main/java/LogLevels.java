public class LogLevels {
    
    public static String message(String logLine) {
        String[] list = logLine.split(":",2);

        return list[1].trim();
    }

    public static String logLevel(String logLine) {
        
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');

        String level = logLine.substring(start, end);

        return level.toLowerCase();
    }

    public static String reformat(String logLine) {

        String[] list = logLine.split(":",2);

        String firstPart = list[1].trim();

        String secondPart = list[0]
            .replace("[", "(")
            .replace("]",")")
            .toLowerCase();

        return firstPart + " "+ secondPart;
    }
}
