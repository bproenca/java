package br.com.bcp.rest.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProduceMime;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/translate")
public class DicResource {

	private Map<String, String> dic;

	public DicResource() {
		dic = new HashMap<String, String>();
		dic.put("livro", "book");
		dic.put("carro", "car");
	}

	@GET
	@ProduceMime({ "application/json" })
	@Path("{word}")
	public JSONObject translateWord(@PathParam("word") String word)
			throws JSONException {
		String wordInEnglish = this.dic.get(word);
		return new JSONObject().put("portuguese", word).put("english",
				wordInEnglish);
	}

	@GET
	@ProduceMime({ "application/json" })
	public JSONObject getWords() throws JSONException {
		JSONObject object = new JSONObject();

		for (Entry<String, String> entry : this.dic.entrySet()) {
			object.put(entry.getKey(), entry.getValue());
		}

		return object;
	}
}