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

package org.icefaces.samples.showcase.example.ace.slider;

import java.io.Serializable;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = SliderAsyncInputBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class SliderAsyncInputBean implements Serializable {
    public static final String BEAN_NAME = "sliderAsyncInput";
	public String getBeanName() { return BEAN_NAME; }
    private int sliderValue = 0;
    private boolean render = false;

    public void sliderValueChanged(ValueChangeEvent e)
    {
        if((Integer)e.getNewValue() == 9)
        {
            render = true;
        }
        else
        {
            render = false;
        }
    }

    public int getSliderValue() {
        return sliderValue;
    }

    public void setSliderValue(int sliderValue) {
        this.sliderValue = sliderValue;
    }

    public boolean isRender() {
        return render;
    }

    public void setRender(boolean render) {
        this.render = render;
    }
}