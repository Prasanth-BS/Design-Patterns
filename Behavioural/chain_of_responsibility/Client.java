package Behavioural.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setNext(h2);

        Request request = new Request(); // Assume this is a defined class with request details.
        h1.handleRequest(request);
    }
}