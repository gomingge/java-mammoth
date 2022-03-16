package org.zwobble.mammoth.internal.documents;

import java.util.Optional;

public class ParagraphIndent {
    private final Optional<String> start;
    private final Optional<String> end;
    private final Optional<String> firstLine;
    private final Optional<String> hanging;
    private final Optional<String> align;

    public ParagraphIndent(Optional<String> start, Optional<String> end, Optional<String> firstLine, Optional<String> hanging, Optional<String> align) {
        this.start = start;
        this.end = end;
        this.firstLine = firstLine;
        this.hanging = hanging;
        this.align = align;
    }

    public Optional<String> getStart() {
        return start;
    }

    public Optional<String> getEnd() {
        return end;
    }

    public Optional<String> getFirstLine() {
        return firstLine;
    }

    public Optional<String> getHanging() {
        return hanging;
    }

    public Optional<String> getAlign() {
        return align;
    }
}
