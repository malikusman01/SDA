package observer.eventsmanagement.lab3task2;

import java.io.File;

public class LogOpenListener implements EventListener {
    private String logFilePath;

    public LogOpenListener(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + logFilePath + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
