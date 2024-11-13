package valikmed.autocomplete;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutoCompleteTest {
    private AutoComplete ac;

    @BeforeEach
    void before() {
        ac = new AutoComplete();
        ac.elements = List.of("Pandora", "Pinterest", "Paypal", "Pg&e",
                "Project free tv", "Priceline", "Press democrat", "Progressive",
                "Project runway", "Proactive", "Programming", "Progeria", "Progesterone",
                "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank", "Bowl,",
                "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe");
    }

    @Test
    void complatByContaning_Found() {
        var elements = ac.complatByContaning("ject");
        assertTrue(elements.contains("Project free tv"));
        assertTrue(elements.contains("Project runway"));
        assertFalse(elements.contains("Reprobe"));
        assertFalse(elements.contains("Print"));
    }

    void complatByContaning_NotFound() {
        var elements = ac.complatByContaning("Art");
        assertTrue(elements.isEmpty());
    }

    @Test
    void complatByPrefix_Found() {
        var elements = ac.complateByPrefix("pri");
        assertTrue(elements.contains("Priceline"));
        assertTrue(elements.contains("Print"));
        assertFalse(elements.contains("Programming"));
        assertFalse(elements.contains("Project runway"));
    }

}