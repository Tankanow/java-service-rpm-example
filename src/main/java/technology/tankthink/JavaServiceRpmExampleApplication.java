package technology.tankthink;

import technology.tankthink.health.VersionHealthCheck;
import technology.tankthink.resources.VersionResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by adam_tankanow on 5/21/14.
 */
public class JavaServiceRpmExampleApplication extends Application<JavaServiceRpmExampleConfiguration> {


  public static void main(String... args) throws Exception {
    new JavaServiceRpmExampleApplication().run(args);
  }


  @Override
  public void initialize(Bootstrap<JavaServiceRpmExampleConfiguration> bootstrap) {

  }

  @Override
  public void run(JavaServiceRpmExampleConfiguration config, Environment environment) throws Exception {
    final VersionResource resource = new VersionResource(config.getVersion());
    environment.jersey().register(resource);
    environment.healthChecks().register("version", new VersionHealthCheck(config.getVersion()));
  }
}
