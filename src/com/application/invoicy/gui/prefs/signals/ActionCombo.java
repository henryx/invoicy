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

package com.application.invoicy.gui.prefs.signals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class ActionCombo implements ActionListener {

    private JComboBox dbCombo;
    private JTextField hostField;
    private JTextField portField;

    /**
     * @param hostField the hostField to set
     */
    public void setHostField(JTextField hostField) {
        this.hostField = hostField;
    }

    /**
     * @param dbCombo the dbCombo to set
     */
    public void setDbCombo(JComboBox dbCombo) {
        this.dbCombo = dbCombo;
    }

    /**
     * @param portField the portField to set
     */
    public void setPortField(JTextField portField) {
        this.portField = portField;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (this.dbCombo.getSelectedIndex() != 0) {
            this.hostField.setEditable(true);
            this.portField.setEditable(true);
            this.portField.setText("3050");
        } else {
            this.hostField.setEditable(false);
            this.portField.setEditable(false);
            this.portField.setText("");
        }
    }
}
