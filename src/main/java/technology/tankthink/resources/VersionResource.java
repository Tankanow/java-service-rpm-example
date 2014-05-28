package technology.tankthink.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import technology.tankthink.api.Version;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by adam_tankanow on 5/21/14.
 */
@Path("/java-service-rpm-example/version")
@Produces(MediaType.APPLICATION_JSON)
public class VersionResource {
  private final String version;

  public VersionResource(String version) {
    this.version = version;
  }

  @GET
  @Timed
  public Version getVersion(@QueryParam("name") Optional<String> name) {
    return new Version(version);
  }
}
