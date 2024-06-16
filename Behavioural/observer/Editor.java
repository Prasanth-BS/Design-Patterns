package Behavioural.observer;

import java.io.File;

class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        // file.write(); // Assuming this method exists in File class
        events.notify("save", file.getName());
    }
}