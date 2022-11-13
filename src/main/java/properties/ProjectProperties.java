package properties;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:project-config.properties")
public interface ProjectProperties extends Config {

    @Key("homepage.url")
    String getHomepageUrl();
}
