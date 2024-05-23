package bach.info.org.jreleaser;

/**
 * JReleaser 1.12.0
 *
 * @see <a href="https://github.com/jreleaser/jreleaser/releases/tag/v1.12.0">Release Notes</a>
 */
public interface JReleaser {
  String RELEASES = "https://github.com/jreleaser/jreleaser/releases";
  String NAME = "jreleaser";
  String VERSION = "1.12.0";

  String TOOL_PROVIDER_URI = // TODO Convert to use String Templates
      """
      ${RELEASES}/download/v${VERSION}/${NAME}-tool-provider-${VERSION}.jar\
      #SIZE=49421454\
      &SHA-256=1c5b7f26cb27253dd205d877e55d57e013c88652aa15f7e7185e11fa2012fc2c"""
          .replace("${RELEASES}", RELEASES)
          .replace("${NAME}", NAME)
          .replace("${VERSION}", VERSION);

  String MODULES_PROPERTIES = // language=properties
      """
      org.jreleaser.tool=${TOOL_PROVIDER_URI}
      """;
  String MODULES = MODULES_PROPERTIES.replace("${TOOL_PROVIDER_URI}", TOOL_PROVIDER_URI);

  String APPLICATION = TOOL_PROVIDER_URI;
  String APPLICATION_ASSETS = // language=properties
      """
      README.adoc=https://github.com/jreleaser/jreleaser/raw/v1.12.0/README.adoc#SIZE=6162
      """;
}
