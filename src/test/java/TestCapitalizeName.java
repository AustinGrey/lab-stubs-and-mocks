import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

import util.StringProcessor;

public class TestCapitalizeName {

    @Test
    public void testCapitalizeName(){
        // Setup
        StringProcessor processor = new StringProcessor();

        // Run
        String name1 = "john doe";
        String name2 = "JANE DoE";

        String name1Result = processor.capitalizeName(name1);
        String name2Result = processor.capitalizeName(name2);

        // Verify
        assertEquals("John Doe", name1Result);
        assertEquals("Jane Doe", name2Result);
    }
}
