/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.invoicy;

import java.io.File;

/**
 *
 * @author enrico
 */
public class Const {
    
    public final static File USER_DIR = new File(System.getProperty("user.home")
                + System.getProperty("file.separator")
                + ".inv");
    
    public final static File CFG_FILE = new File(USER_DIR.getAbsolutePath()
                + System.getProperty("file.separator")
                + "settings.cfg");
}
