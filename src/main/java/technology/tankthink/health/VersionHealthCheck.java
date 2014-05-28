package technology.tankthink.health;

import com.codahale.metrics.health.HealthCheck;
import org.apache.commons.lang.StringUtils;

/**
 * Created by adam_tankanow on 5/21/14.
 */
public class VersionHealthCheck extends HealthCheck {

  private final String version;

  public VersionHealthCheck(String version) {
    this.version = version;
  }

  @Override
  protected Result check() throws Exception {
    if (StringUtils.isBlank(version)){
      return Result.unhealthy("version is empty!");
    }
    return Result.healthy();
  }
}
