class Command {
    private Snapshot backup;

    public void makeBackup(Editor editor) {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restore();
        }
    }
}