import java.io.File;
import java.io.IOException;

/**
 * Created by bcp on 01/06/17.
 */
public class TestTempDir {

    public static void main(String[] args) throws IOException {
	final File tempFile = File.createTempFile("pre", "pos");
	tempFile.deleteOnExit();
	System.out.println(tempFile.getAbsolutePath());

	//sun.misc.IOUtils.createTempFile()
    }
}
