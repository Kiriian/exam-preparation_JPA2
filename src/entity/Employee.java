/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;

/**
 *
 * @author Jeanette
 */
@Entity
public class Employee extends Person
{
    int soSecNr;
    float wage;
    String taxClass;

    public int getSoSecNr()
    {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr)
    {
        this.soSecNr = soSecNr;
    }

    public float getWage()
    {
        return wage;
    }

    public void setWage(float wage)
    {
        this.wage = wage;
    }

    public String getTaxClass()
    {
        return taxClass;
    }

    public void setTaxClass(String taxClass)
    {
        this.taxClass = taxClass;
    }
    
    
}
