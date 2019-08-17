package br.com.bcp.rest.resource;

import java.io.IOException;

import junit.framework.Assert;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

/**
 * @author bruno.proenca
 * 
 */
public class DicResourceTest {

	private static HttpServer server = null;

	private HttpClient client = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		server = HttpServerFactory.create("http://localhost:8080/");
		server.start();
		System.out.println("Server started ....");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		server.stop(0);
		System.out.println("Server stopped ....");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		client = new HttpClient();
	}

	/**
	 * Test method for
	 * {@link br.com.bcp.rest.resource.DicResource#translateWord(java.lang.String)}
	 * 
	 * @throws IOException
	 * @throws HttpException
	 * @throws JSONException
	 */
	@Test
	public void testTranslateWord() throws HttpException, IOException,
			JSONException {
		String url = "http://localhost:8080/translate/livro";
		GetMethod get = new GetMethod(url);
		client.executeMethod(get);

		String response = get.getResponseBodyAsString();
		JSONObject jsonObject = new JSONObject(response);
		Assert.assertEquals("livro", jsonObject.get("portuguese"));
		Assert.assertEquals("book", jsonObject.get("english"));

		System.out.println(jsonObject);
	}

	/**
	 * Test method for {@link br.com.bcp.rest.resource.DicResource#getWords()}
	 * 
	 * @throws IOException
	 * @throws HttpException
	 * @throws JSONException
	 */
	@Test
	public void testGetWords() throws HttpException, IOException, JSONException {
		String url = "http://localhost:8080/translate";
		GetMethod get = new GetMethod(url);
		client.executeMethod(get);

		String response = get.getResponseBodyAsString();
		JSONObject jsonObject = new JSONObject(response);
		Assert.assertEquals("book", jsonObject.get("livro"));
		Assert.assertEquals("car", jsonObject.get("carro"));

		System.out.println(jsonObject);
	}

}
