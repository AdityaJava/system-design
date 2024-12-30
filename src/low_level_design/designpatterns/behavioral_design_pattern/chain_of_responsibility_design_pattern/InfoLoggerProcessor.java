package low_level_design.designpatterns.behavioral_design_pattern.chain_of_responsibility_design_pattern;

public class InfoLoggerProcessor extends LogProcessor {

    public InfoLoggerProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("Info" + ":" + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
