package org.jreleaser.bach.info;

/** JReleaser 1.12.0 */
public interface JReleaser {
  String RELEASES = "https://github.com/jreleaser/jreleaser/releases/download";
  String VERSION = "1.12.0";
  String MODULES = // language=properties
      """
      org.jreleaser=${RELEASES}/v${VERSION}/jreleaser-tool-provider-${VERSION}.jar\
      #SIZE=49421454&SHA-256=1c5b7f26cb27253dd205d877e55d57e013c88652aa15f7e7185e11fa2012fc2c
      """
          .replace("${RELEASES}", RELEASES)
          .replace("${VERSION}", VERSION);
}
