package technology.tankthink.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by adam_tankanow on 5/21/14.
 */
public class Version {

  @NotBlank private final String version;

  public Version(String version) {
    this.version = version;
  }

  @JsonProperty
  public String getVersion() {
    return version;
  }
}
