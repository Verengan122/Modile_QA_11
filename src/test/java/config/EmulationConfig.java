package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/emulation.properties"})
public interface EmulationConfig extends Config {

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("serverUrl")
    String serverUrl();

    @Key("appUrl")
    String appUrl();

    @Key("appPath")
    String appPath();

}
