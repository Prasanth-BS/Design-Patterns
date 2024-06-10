public class HostingService {
    public String code;

    public HostingServices(String code) {
        this.code = code;
    }

    public void deploy() {
        Compiler compiler = new Compiler(this.code);
        String byteCode = compiler.compile()
        Builder builder = new Builder(byteCode);
        String build = builder.generateBuild();
        System.out.println("Deploying in cloud");

    }
}