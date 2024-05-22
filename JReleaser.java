package bach.info.org.jreleaser;

/**
 * JReleaser 1.12.0
 *
 * @see <a href="https://github.com/jreleaser/jreleaser/releases/tag/v1.12.0">Release Notes</a>
 */
public interface JReleaser {
  String RELEASES = "https://github.com/jreleaser/jreleaser/releases";
  String VERSION = "1.12.0";
  String PROPERTIES = // language=properties
      """
      org.jreleaser=${RELEASES}/download/v${VERSION}/jreleaser-tool-provider-${VERSION}.jar\
      #SIZE=49421454&SHA-256=1c5b7f26cb27253dd205d877e55d57e013c88652aa15f7e7185e11fa2012fc2c
      """
          .replace("${RELEASES}", RELEASES)
          .replace("${VERSION}", VERSION);
}
