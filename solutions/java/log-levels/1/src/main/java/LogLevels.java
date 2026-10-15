public class LogLevels {
    
    public static String message(String logLine) {
        // Split at "]: " to separate the tag from the message, then trim whitespace
        return logLine.split("]: ")[1].trim();
    }

    public static String logLevel(String logLine) {
        // Split at "]: " to isolate the tag, remove the opening "[", and make lowercase
        return logLine.split("]: ")[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        // Combine the results of the other two methods
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}