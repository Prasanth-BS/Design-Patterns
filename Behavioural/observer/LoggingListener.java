package Behavioural.observer;

import java.io.File;

class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename, String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    public void update(String filename) {
        // log.write(replace('%s', filename, message)); // Assuming this method exists in File class
        System.out.println(message.replace("%s", filename));
    }
}