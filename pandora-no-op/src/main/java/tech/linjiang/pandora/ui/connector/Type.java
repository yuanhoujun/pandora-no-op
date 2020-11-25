package tech.linjiang.pandora.ui.connector;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Huang Ming 2020-11-25 11:11
 */

@Retention(RetentionPolicy.SOURCE)
public @interface Type {
    int NET = 0x01;
    int FILE = 0x02;
    int HIERARCHY = 0x03;
    int BASELINE = 0x05;
    int SELECT = 0x06;
    int CONFIG = 0x07;
    int BUG = 0x08;
    int HISTORY = 0x09;
    int ROUTE = 0x10;
    int PERMISSION = 0x11;
}
