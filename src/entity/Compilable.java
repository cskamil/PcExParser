package entity;

import parser.Language;

/**
 * Created by cskamil on 14-Jul-17.
 */
public interface Compilable {
    String getId();
    String getSourceCode();
    String getFileName();
    Language getLanguage();
    String getActivityName();
    String getUserInput();
}
