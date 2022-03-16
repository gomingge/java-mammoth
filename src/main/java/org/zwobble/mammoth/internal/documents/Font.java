package org.zwobble.mammoth.internal.documents;

import java.util.Optional;

/**
 * @Author monier
 * @Date 2022/3/15 15:42
 * @Description
 */
public class Font  {
    private final Optional<String> color;
    private final Optional<String> highlight;
    private final Optional<String> fontType;
    private final Optional<String> fontSize;

    public Font(Optional<String> color, Optional<String> highlight, Optional<String> fontType, Optional<String> fontSize) {
        this.color = color;
        this.highlight = highlight;
        this.fontType = fontType;
        this.fontSize = fontSize;
    }

    public Optional<String> getColor() {
        return color;
    }

    public Optional<String> getHighlight() {
        return highlight;
    }

    public Optional<String> getFontType() {
        return fontType;
    }

    public Optional<String> getFontSize() {
        return fontSize;
    }
}
