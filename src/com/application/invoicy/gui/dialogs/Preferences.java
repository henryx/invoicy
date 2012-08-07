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

import javax.swing.JFrame;

/**
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class Preferences {
    private com.application.invoicy.gui.skel.dialogs.Preferences skel;

    public Preferences(JFrame aFrame) {
        this.skel = new com.application.invoicy.gui.skel.dialogs.Preferences(aFrame, true);
    }
    
    public void setVisible(boolean isVisible) {
        this.skel.setVisible(isVisible);
    }
}