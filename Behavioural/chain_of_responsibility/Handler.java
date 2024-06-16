package Behavioural.chain_of_responsibility;

interface Handler {
    void setNext(Handler handler);
    void handleRequest(Request request);
}