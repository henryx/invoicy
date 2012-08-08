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
 * Project       Invoicy
 * Description   An invoice management system
 * 
 * @author Enrico Bianchi <enrico.bianchi@ymail.com>
 */
public class Const {
    
    public final static File USER_DIR = new File(System.getProperty("user.home")
                + System.getProperty("file.separator")
                + ".inv");
    
    public final static File CFG_FILE = new File(USER_DIR.getAbsolutePath()
                + System.getProperty("file.separator")
                + "settings.cfg");
    
    public final static int BTN_NONE = -1;
    public final static int BTN_OK = 0;
    public final static int BTN_CANCEL = 1;
}
