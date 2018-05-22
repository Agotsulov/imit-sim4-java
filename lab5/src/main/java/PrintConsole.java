public class PrintConsole implements Executable{

    private String message;

    public PrintConsole(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println(message);
    }
}
