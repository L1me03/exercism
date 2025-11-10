public class LogLine  {

    String logLine;
    private String enumLog;
    private String messageLog;

    
    public LogLine(String logLine) {
        this.logLine = logLine;

        String[] log = logLine.split(":",2);
        this.enumLog = log[0].replace("[", "").replace("]", "");
        this.messageLog = log[1].trim();

    }


    public LogLevel getLogLevel() {
        switch(enumLog) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF":   return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        switch(getLogLevel()){
            case TRACE: return "1" + ":" + messageLog;
            case DEBUG: return "2" +  ":" + messageLog;
            case INFO:  return "4" + ":" + messageLog;
            case WARNING: return "5" + ":" + messageLog;
            case ERROR: return "6" + ":" + messageLog;
            case FATAL: return "42" + ":" +messageLog;
            default: return "0" + ":" + messageLog;
        }
    }
}
