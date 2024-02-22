package mobile.config.props;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(Config.LoadType.MERGE)
@Sources("classpath:mobile.properties")
public interface BaseConfig extends Config {

    String platformName();
    String deviceName();
    String platformVersion();
    String automationName();
    String appPackage();
    String appActivity();
    String app();
    String url();

}
