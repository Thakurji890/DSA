public class LogLine {
    private final String level;
    private final String message;

    public LogLine(String logLine) {
        this.level = logLine.substring(1, 4);
        this.message = logLine.substring(7);
    }

    public LogLevel getLogLevel() {
        switch (level) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncodedValue() + ":" + message;
    }
}