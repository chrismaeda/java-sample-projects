package samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Path("/echo")
public class RestEchoService
{
    private static Logger logger = LoggerFactory.getLogger(RestEchoService.class);

    @GET
    @Produces("text/plain")
    public String getHello(@QueryParam("text") String text)
    {
	logger.info("Echo request: {}", text);
        String response = "Echo: " + text;
	return response;
    }    
}
