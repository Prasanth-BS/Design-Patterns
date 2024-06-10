public class Compiler {
    String code;

    public compiler(String code) {
        this.code = code;
    }

    public String compile() {
        System.out.println("Compiling the code and generating byte code");
        return "Byte Code";
    }
}
