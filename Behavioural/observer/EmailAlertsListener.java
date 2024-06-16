package Behavioural.observer;

class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public void update(String filename) {
        // system.email(email, replace('%s', filename, message)); // Assuming a method to send email
        System.out.println("Email sent to " + email + ": " + message.replace("%s", filename));
    }
}