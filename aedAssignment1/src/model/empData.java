/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/** 
 *
 * @author Rucha Chotalia
 */
public class empData {
    private ArrayList<employeeData> employee;
    
    public empData() {
        this.employee= new ArrayList<employeeData>();
        
    }

    public ArrayList<employeeData> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<employeeData> employee) {
        this.employee = employee;
    }
    
    public employeeData add(){
        employeeData newdata = new employeeData();
        employee.add(newdata);
        return newdata;
    }
}
