public class Builder {
    String byteCode;

    public Builder(String byteCode) {
        this.byteCode = byteCode;
    }

    public String generateBuild() {
        System.out.println("Generating build from the byte code");
        return "build generated";
    }
}
