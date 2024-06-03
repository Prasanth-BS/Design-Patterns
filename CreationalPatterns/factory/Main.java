public class Main {
    public static void main(String args[]) {
        String howToDeliver = "Road";

        if(howToDeliver.equals("Road")) {
            RoadLogistics logisitics = new RoadLogistics();
            logisitics.transport();
        }
        else {
            SeaLogistics logisitics = new SeaLogistics();
            logisitics.transport();
        }

    }
}