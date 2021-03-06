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

package org.icefaces.samples.showcase.example.ace.dataExporter;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;

import org.icefaces.samples.showcase.dataGenerators.utilityClasses.DataTableData;
import org.icefaces.samples.showcase.example.ace.dataTable.Car;

@ManagedBean(name= ExcludeFromExport.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class ExcludeFromExport implements Serializable {
    public static final String BEAN_NAME = "excludeFromExport";
	public String getBeanName() { return BEAN_NAME; }
    
    private ArrayList<Car> cars;
    private String type;
    
    /////////////---- CONSTRUCTOR BEGIN
    public ExcludeFromExport() 
    {
        initializeLocalVariables();
    }
    
    /////////////---- PRIVATE METHODS BEGIN
    private void initializeLocalVariables() {
        this.cars = new ArrayList<Car>(DataTableData.getDefaultData());
        this.type = "csv";
        
    }
    /////////////---- GETTERS & SETTERS BEGIN
    public ArrayList<Car> getCars() { return cars; }
    public void setCars(ArrayList<Car> cars) { this.cars = cars; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
