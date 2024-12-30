package low_level_design.designpatterns.behavioral_design_pattern.chain_of_responsibility_design_pattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLoggerProcessor(new DebugLoggerProcessor(new ErrorLoggerProcessor(null)));

        logObject.log(LogProcessor.INFO, "Just for Info");
        logObject.log(LogProcessor.ERROR, "Error");
        logObject.log(LogProcessor.DEBUG, "Debugging");
    }
}
