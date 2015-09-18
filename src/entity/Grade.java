/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Jeanette
 */
@Entity
public class Grade
{
    @Id
    private long id;
    private String name;
    private int values;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getValue()
    {
        return values;
    }

    public void setValue(int value)
    {
        this.values = value;
    }
    
    
}
