package br.com.bcp;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.Reader;

/**
 * Show how to execute Ruby script inside Java
 * 
 * @author bruno.proenca
 */
public class ScriptEval {

    private ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

    private ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("jruby");

    /**
     * Run ruby script
     *
     * @param script
     * @return The value returned from the execution of the script
     * @throws ScriptException
     */
    public Object runScript(String script) throws ScriptException {
	Object result = scriptEngine.eval("return " + script);
	System.out.println(script + " = " + result);
	return result;
    }

    /**
     * Run ruby script file
     *
     * @param scriptFile
     * @return The value returned from the execution of the script
     * @throws ScriptException
     */
    public Object runScript(Reader scriptFile) throws ScriptException {
	Object result = scriptEngine.eval(scriptFile);
	System.out.println("Script file result = " + result);
	return result;
    }
}