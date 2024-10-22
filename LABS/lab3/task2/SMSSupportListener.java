package observer.eventsmanagement.lab3task2;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private final int MAX_SMS_LENGTH = 160; // Define the maximum SMS length

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String message = "Someone has performed " + eventType + " operation with the following file: " + file.getName();

        if (message.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: SMS exceeds " + MAX_SMS_LENGTH + " characters. Please define a valid default SMS.");
        } else {
            sendSMS(message);
        }
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
