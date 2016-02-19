package services.recipe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestServices {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRecipe() {
		return "Test questions will be returned here";
	}
}
