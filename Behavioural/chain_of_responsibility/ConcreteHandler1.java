package Behavioural.chain_of_responsibility;

class ConcreteHandler1 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (canHandle(request)) {
            // Handle the request.
        } else if (next != null) {
            next.handleRequest(request);
        }
    }

    private boolean canHandle(Request request) {
        // Logic to determine if the request can be handled by this handler.
        return false; // Placeholder for actual condition.
    }
}