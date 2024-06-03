public class SeaLogistics {
    
    public void transport() {
        System.out.println("Packing the goods in containers.")
        ITransport transport = new SeaTransport();
        transport.deliver();
    
    }
}