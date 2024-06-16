class Editor {
    private String text;
    private int curX;
    private int curY;
    private int selectionWidth;

    // Setters for the state variables
    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    // Method to create a snapshot of the current state
    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }
}