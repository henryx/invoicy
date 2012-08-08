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

package com.application.invoicy.gui.dialogs;

import com.application.invoicy.gui.signals.dialogs.PrefsActionCancel;
import com.application.invoicy.gui.signals.dialogs.PrefsActionCombo;
import com.application.invoicy.gui.signals.dialogs.PrefsActionOk;
import java.util.ResourceBundle;
import javax.swing.JFrame;

/**
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class Preferences {
    private com.application.invoicy.gui.skel.dialogs.Preferences skel;
    private PrefsActionCancel actionCancel;
    private PrefsActionOk actionOk;

    public Preferences(JFrame aFrame) {
        PrefsActionCombo actionCombo;
        ResourceBundle bundle;

        this.skel = new com.application.invoicy.gui.skel.dialogs.Preferences(aFrame, true);
        bundle = ResourceBundle.getBundle("com/application/invoicy/locales");

        actionCombo = new PrefsActionCombo();
        actionOk = new PrefsActionOk();
        actionCancel = new PrefsActionCancel();

        actionCombo.setHostField(this.skel.getHostField());
        actionCombo.setDbCombo(this.skel.getDbCombo());
        actionCombo.setPortField(this.skel.getPortField());

        this.skel.getDbCombo().addItem(bundle.getString("Preferences.dbCombo.item1"));
        this.skel.getDbCombo().addItem(bundle.getString("Preferences.dbCombo.item2"));
        this.skel.getDbCombo().setSelectedIndex(0);
        
        this.skel.getDbCombo().addActionListener(actionCombo);
        this.skel.getOkButton().addActionListener(actionOk);
        this.skel.getCancelButton().addActionListener(actionCancel);
    }
    
    public void setVisible(boolean isVisible) {
        this.skel.setVisible(isVisible);
    }
    
    public String getBtnPressed() {
        if (this.actionOk.isPressed()) {
            return "ok";
        } else if (this.actionCancel.isPressed()) {
            return "cancel";
        } else {
            return "none";
        }
    }
}
