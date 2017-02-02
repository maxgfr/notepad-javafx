package big_memento;

import java.util.List;

public class Macro implements Command {

    private final List<Command> parts;
    public Macro(List<Command> parts) {
        this.parts = parts;
    }

    @Override public void execute() {
        this.parts.forEach(c -> c.execute());
    }
}
