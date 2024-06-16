package Behavioural.observer;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

// The base publisher class includes subscription management code and notification methods[^1^][1].
class EventManager {
    private HashMap<String, List<EventListener>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.getOrDefault(eventType, new ArrayList<>());
        users.add(listener);
        listeners.put(eventType, users);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        if (users != null) {
            users.remove(listener);
        }
    }

    public void notify(String eventType, String data) {
        List<EventListener> users = listeners.get(eventType);
        if (users != null) {
            for (EventListener listener : users) {
                listener.update(data);
            }
        }
    }
}