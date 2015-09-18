/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Employee;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import facade.Facade;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        s.setId(2);
        s.setAge(18);
        Date d = formatter.parse("18-10-1994");
        s.setBirthDate(d);
        s.setFirstname("Jeanette");
        s.setLastname("Møller");
        s.setIsMarried(false);
        System.out.println(f.addStudent(s));
        
        Employee e = new Employee();
        e.setId(1);
        e.setFirstname("Mette");
        e.setLastname("Møller");
        System.out.println(f.addEmployee(e));
        
        PhDStudent ps = new PhDStudent();
        ps.setId(3);
        e.setFirstname("Lard");
        e.setLastname("Møller");
        System.out.println(f.addStudent(ps));
        
        Person p = new Person();
        p.setId(4);
        p.setFirstname("Hanne");
        p.setLastname("Jensen");
        System.out.println(f.addPerson(p));
        
        s.setLastname("Borring-møller");
        System.out.println(f.editStudent(s));
        
        e.setFirstname("Anette");
        System.out.println(f.editEmployee(e));
        
        Date d2 = formatter.parse("6-10-1994");
        ps.setBirthDate(d2);
        System.out.println(f.editPhDStudent(ps));
        
        p.setAge(51);
        System.out.println(f.editPerson(p));
        
        System.out.println(f.findPerson(4));
    }
}
