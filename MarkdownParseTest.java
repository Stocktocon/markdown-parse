import static org.junit.Assert.*; //imports the Assert type tests
import org.junit.*; //imports the all of the junit methods and classes and so on

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;
public class MarkdownParseTest {
    @Test//indicates where a test is for the tester
    public void addition() {//test method header
        assertEquals(2, 1 + 1);//an actual test that chects if the two parameters are equals
    }
    @Test
    public void testTestFile() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();
        returnArray.add("https://something.com");
        returnArray.add("some-page.html");

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile2() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();
        returnArray.add("https://something.com");
        returnArray.add("some-page.html");

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile3() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile4() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile5() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile6() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile7() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();

        assertEquals(returnArray, links);
    }

    @Test
    public void testTestFile8() throws IOException, NoSuchFileException{
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> returnArray = new ArrayList<>();
        returnArray.add("a link on the first line");

        assertEquals(returnArray, links);
    }
}
