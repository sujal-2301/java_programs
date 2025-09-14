public class LogLevels {
    
    public static String message(String logLine) {
        return (logLine.trim()).split("\\s+", 2)[1];
    }

    public static String logLevel(String logLine) {
        logLine = logLine.trim();
        String firstPart = logLine.split("\\s+", 2)[0];
        String removedBracket = firstPart.substring(1, firstPart.length()-2);
        String lowerCase = removedBracket.toLowerCase();
        return lowerCase;
    }

    public static String reformat(String logLine) {
        String trail = message(logLine);
        String lead = logLevel(logLine);
        return (trail + " (" + lead + ")");
    }
}
