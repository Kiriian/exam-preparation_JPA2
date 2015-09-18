/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Person;
import entity.Student;
import facade.Facade;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jeanette
 */
public class Tester
{
    

    public static void main(String[] args) throws ParseException
    {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exam-preparation_JPA2PU");
        Facade f = new Facade(emf);
        
        Student s = new Student();
        s.setAge(18);
        Date d = formatter.parse("18-10-1994");
        s.setBirthDate(d);
        s.setFirstname("Jeanette");
        s.setLastname("Møller");
        s.setIsMarried(false);
        System.out.println(f.addPerson(s));
    }
}
