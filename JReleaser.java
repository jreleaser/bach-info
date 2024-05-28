package run.info.org.jreleaser;

import run.bach.ModuleLocator;

/**
 * JReleaser 1.12.0
 *
 * @see <a href="https://github.com/jreleaser/jreleaser/releases/tag/v1.12.0">Release Notes</a>
 */
public interface JReleaser {
  String RELEASES = "https://github.com/jreleaser/jreleaser/releases";
  String VERSION = "1.12.0";

  String URI = RELEASES + "/download/v" + VERSION + "/jreleaser-tool-provider-" + VERSION + ".jar";
  ModuleLocator MODULES = ModuleLocator.of("org.jreleaser.tool", URI);
}
