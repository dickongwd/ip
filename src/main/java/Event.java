public class Event extends Task {
    String from;
    String to;

    public Event(String desc, String from, String to) {
        super(desc);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("[D]%s (from: %s to: %s)", super.toString(), from, to);
    }
}