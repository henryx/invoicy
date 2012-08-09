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

import com.application.invoicy.gui.dialogs.Preferences;

/**
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Preferences prefs;
        Main m;

        m = new Main();

        if(!m.isFirstStartup()) {
            prefs = new Preferences(null);
            prefs.setVisible(true);

            if (prefs.getBtnPressed() != Const.BTN_OK) {
                System.exit(1);
            }
        }
    }

    private boolean isFirstStartup() {
        if(Const.USER_DIR.exists() && Const.USER_DIR.isDirectory()) {
            if(Const.CFG_FILE.exists() && Const.CFG_FILE.isFile()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
