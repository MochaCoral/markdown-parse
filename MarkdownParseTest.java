import static org.junit.Assert.*; //import junit assert methods
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testGetLinks() throws IOException {
        String[] arr = {"https://something.com", "some-page.html", "hello"};
        Path fileName = Path.of("test-file-2.md");
        String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks("test-file-2.md"), arr.toString(), List.of("https://something.com", "some-page.html", "hello"));
    }
}
