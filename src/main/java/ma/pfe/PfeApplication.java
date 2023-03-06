package ma.pfe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PfeApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(PfeApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(PfeApplication.class);
        LOGGER.trace("start appli log 1");
        LOGGER.debug("start appli log 2");
        LOGGER.info("start appli log 3");
        LOGGER.warn("start appli log 4");
        LOGGER.error("start appli log 5");
    }
}
