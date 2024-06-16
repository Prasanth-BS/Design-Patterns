public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command();

        // Simulate user actions
        editor.setText("Hello, World!");
        editor.setCursor(10, 10);
        editor.setSelectionWidth(5);

        // Create backup before changes
        command.makeBackup(editor);

        // Changes to the editor
        editor.setText("Hello, Memento!");

        // Undo the changes
        command.undo();
    }
}