public class RoadLogistics {

    public void transport() {
        System.out.println("Packing the goods in boxes");
        ITransport transport = new RoadTransport();
        transport.deliver();
    }
}