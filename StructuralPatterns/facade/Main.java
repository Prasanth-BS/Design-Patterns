public class Main {
    public static void main(String args[]) {

        String code = "some code"
        HostingService hostingService = new HostingService(code);
        hostingService.deploy();
        
         
    }
}