public class LogLine {
    public String str;
    public LogLine(String logLine) {
         this.str = logLine;
    }

    public LogLevel getLogLevel() {
         String log = str.split(" ")[0];
        int n = log.length();
        log = log.substring(1, n-2);
        switch(log){
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
                
        }
    }

    public String getOutputForShortLog() {
        LogLevel loglvl = getLogLevel();
        int num = 0;
        switch(loglvl){
            case LogLevel.UNKNOWN :
                num = 0;
                break;
            case LogLevel.TRACE:
                num = 1;
                break;
            case LogLevel.DEBUG:
                num = 2;
                break;
            case LogLevel.INFO:
                num = 4;
                break;
            case LogLevel.WARNING:
                num = 5;
                break;
            case LogLevel.ERROR:
                num = 6;
                break;
            case LogLevel.FATAL:
                num = 42;
                break;
        }
        String message = this.str.split(":")[1];
        message = message.substring(1, message.length());
        return "" + num + ":"+message;
    }
}
