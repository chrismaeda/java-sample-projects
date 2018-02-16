package samples;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestResourceConfig extends ResourceConfig 
{
    private static Logger logger = LoggerFactory.getLogger(RestResourceConfig.class);

    public RestResourceConfig()
    {
	logger.info("Creating RestResourceConfig");
	packages("samples");
    }
}
