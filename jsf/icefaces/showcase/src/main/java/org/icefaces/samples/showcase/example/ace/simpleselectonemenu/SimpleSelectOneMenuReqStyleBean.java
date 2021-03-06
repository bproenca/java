/*
 * Copyright 2004-2014 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.icefaces.samples.showcase.example.ace.simpleselectonemenu;

import java.io.Serializable;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name= SimpleSelectOneMenuReqStyleBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class SimpleSelectOneMenuReqStyleBean implements Serializable
{
    public static final String BEAN_NAME = "simpleSelectOneMenuReqStyleBean";
	public String getBeanName() { return BEAN_NAME; }

    private String selectedText1, selectedText2;
    private String reqColor = "redRS";
    private String optColor = "greenRS";

    public String getSelectedText1() { return selectedText1; }
    public String getSelectedText2() { return selectedText2; }
    
    public String getReqColor() {
        return reqColor;
    }
    
    public String getOptColor() {
        return optColor;
    }
    
    public void setSelectedText1(String selectedText1) { this.selectedText1 = selectedText1; }
    public void setSelectedText2(String selectedText2) { this.selectedText2 = selectedText2; }
    
    public void setReqColor(String reqColor) {
        this.reqColor = reqColor;
    }
    
    public void setOptColor(String optColor) {
        this.optColor = optColor;
    }
    
	private boolean useTheme = false;

    public boolean getUseTheme() {
        return useTheme;
    }

    public void setUseTheme(boolean useTheme) {
        this.useTheme = useTheme;
    }
}
