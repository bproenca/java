/**
 * 
 */
package br.com.bcp;

import static junit.framework.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import javax.script.ScriptException;

import org.jruby.RubyArray;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bruno.proenca
 * 
 */
public class ScriptEvalTest {

	private ScriptEval script;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("--------------------------------");
		script = new ScriptEval();
	}

	/**
	 * Test method for {@link br.com.bcp.ScriptEval#runScript(java.lang.String)}
	 * 
	 * @throws ScriptException
	 */
	@Test
	public void testRunScript() throws ScriptException {
		assertEquals("Hello World", script.runScript("'Hello World'"));
		assertEquals("3", script.runScript("1+2").toString());
		assertEquals("199", script.runScript("-199.abs").toString());
		assertEquals("11", script.runScript("'ice is nice'.length").toString());
		assertEquals("1", script.runScript("'ruby is cool.'.index('u')").toString());
		assertEquals(" '?acdeinsty",
				script.runScript("\"Nice Day Isn't It?\".downcase.split(\"\").uniq.sort.join"));
		assertEquals("Fixnum", script.runScript("1.class.name"));

		RubyArray array = (RubyArray) script.runScript("[5, 4, 3, [2, 1, 0]].flatten.reverse");
		for (int i = 0; i < 6; i++) {
			assertEquals(Integer.toString(i), array.get(i).toString());
		}

	}

	/**
	 * Test method for {@link br.com.bcp.ScriptEval#runScript(java.io.Reader)}
	 * 
	 * @throws ScriptException
	 * @throws FileNotFoundException
	 */
	@Test
	public void testRunScriptFile() throws ScriptException, FileNotFoundException {
		RubyArray array = (RubyArray) script.runScript(new InputStreamReader(ScriptEvalTest.class
				.getResourceAsStream("/bla.rb")));
		assertEquals(3, array.size());
	}
}
