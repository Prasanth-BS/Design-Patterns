public class Main {
    public static void main(String args[]) {
        String dataFromApi = "Json data";

        WeatherReport weatherReport = new WeatherReport(dataFromApi);
        weatherReport.generateReport();

        String xmlData = "Xml Data";
        WeatherReport weatherReportAdapter = new WeatherReportAdapter(xmlData);
        weatherReportAdapter.generateReport();
        
    }
}