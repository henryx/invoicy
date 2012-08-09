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

package com.application.invoicy.gui.signals.dialogs;

import com.application.invoicy.Const;
import com.application.invoicy.gui.skel.dialogs.Preferences;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class PrefsActionOk implements ActionListener {
    private Preferences skel;
    private boolean pressed;

    public PrefsActionOk(Preferences skel) {
        this.skel = skel;
        this.pressed = false;
    }
    
    private void createCfg() throws FileNotFoundException, IOException {
        Properties prop;

        Const.USER_DIR.mkdirs();
        
        prop = new Properties();
        prop.setProperty("dbtype", "none");
        
        prop.store(new FileOutputStream(Const.CFG_FILE), null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            this.createCfg();
            this.pressed = true;
            this.skel.setVisible(false);
            this.skel.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrefsActionOk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PrefsActionOk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isPressed() {
        return this.pressed;
    }
}
