package duke.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents an event with a start and end.
 */
public class Event extends Task {
    private final LocalDate from;
    private final LocalDate to;

    public Event(String desc, LocalDate from, LocalDate to) {
        super(desc);
        this.from = from;
        this.to = to;
    }

    @Override
    public String encode() {
        return String.format("E|%s /from %s /to %s", super.encode(), from, to);
    }

    @Override
    public String toString() {
        return String.format("[E]%s (from: %s to: %s)",
                super.toString(),
                from.format(DateTimeFormatter.ofPattern("MMM dd yyyy")),
                to.format(DateTimeFormatter.ofPattern("MMM dd yyyy")));
    }
}
