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

package org.icefaces.samples.showcase.example.ace.ajax;

import java.io.Serializable;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name= AjaxCallbacksBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AjaxCallbacksBean implements Serializable
{
    public static final String BEAN_NAME = "ajaxCallbacksBean";
	public String getBeanName() { return BEAN_NAME; }

	private boolean value1 = true;
	private boolean value2 = true;
	private boolean value3 = true;

    public boolean getValue1() {
        return value1;
    }

    public void setValue1(boolean value1) {
        this.value1 = value1;
    }

    public boolean getValue2() {
        return value2;
    }

    public void setValue2(boolean value2) {
        this.value2 = value2;
    }

    public boolean getValue3() {
        return value3;
    }

    public void setValue3(boolean value3) {
        this.value3 = value3;
    }
}