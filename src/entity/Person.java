/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Jeanette
 */
@Entity
public class Person
{

    @Id
    private long id;
    private String firstname;
    private String lastname;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;
    private int age;
    private boolean isMarried;
    @OneToOne
    private Grade grade;
    @JoinColumn(name = "Supervise", referencedColumnName = "id")
    @ManyToOne
    private Person person;

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isIsMarried()
    {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried)
    {
        this.isMarried = isMarried;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Grade getGrade()
    {
        return grade;
    }

    public void setGrade(Grade grade)
    {
        this.grade = grade;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    
    
}
