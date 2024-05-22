package bach.info.org.jreleaser;

/**
 * JReleaser early-access (1.13.0-SNAPSHOT)
 *
 * @see <a href="https://github.com/jreleaser/jreleaser/releases/tag/early-access">Release Notes</a>
 */
public interface JReleaser {
  String RELEASES = "https://github.com/jreleaser/jreleaser/releases";
  String VERSION = "early-access";
  String PROPERTIES = // language=properties
      """
      org.jreleaser.tool=${RELEASES}/download/${VERSION}/jreleaser-tool-provider-${VERSION}.jar\
      #SIZE=49421716&SHA-256=567f68097281b4b19051c9addb9966e466c7914d32eef80ac26c516cf18bffbf
      """
          .replace("${RELEASES}", RELEASES)
          .replace("${VERSION}", VERSION);
}
