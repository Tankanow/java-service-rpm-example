package technology.tankthink;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by adam_tankanow on 5/21/14.
 */
public class JavaServiceRpmExampleConfiguration extends Configuration {

  @NotEmpty private String name;
  @NotEmpty private String version;

  @JsonProperty
  public String getName() {
    return name;
  }

  @JsonProperty
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty
  public String getVersion() {
    return version;
  }

  @JsonProperty
  public void setVersion(String version) {
    this.version = version;
  }


}
