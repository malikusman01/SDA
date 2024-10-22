package observer.eventsmanagement.lab3task2;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
