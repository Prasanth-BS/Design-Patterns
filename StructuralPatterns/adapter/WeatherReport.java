public class WeatherReport {

    String data;
    public WeatherReport(String jsondata) {
        this.data = jsondata;
    }

    public void generateReport(String jsonData) {
        System.out.println("Parsing json data");
        System.out.println("Report generated");
    }
}