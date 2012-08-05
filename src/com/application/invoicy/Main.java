/*
 * Copyright 2012 Enrico Bianchi <enrico.bianchi@ymail.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.application.invoicy;

import java.io.File;

/**
 * Project       Inventory
 * Description   An inventory management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m;
        
        m = new Main();
        
        if(m.isFirstStartup()) {
            
        }
    }

    private boolean isFirstStartup() {
        File userDir;
        File cfgFile;
        
        userDir = new File(System.getProperty("user.home")
                + System.getProperty("file.separator")
                + ".inv");
        
        cfgFile = new File(System.getProperty("user.home")
                + System.getProperty("file.separator")
                + ".inv"
                + System.getProperty("file.separator")
                + "settings.cfg");

        if(userDir.exists() && userDir.isDirectory()) {
            if(cfgFile.exists() && cfgFile.isFile()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
