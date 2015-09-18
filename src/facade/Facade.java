/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Employee;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Jeanette
 */
public class Facade
{

    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public Student addStudent(Student s)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
            return em.find(Student.class, s.getId());

        } finally
        {
            em.close();
        }
    }

    public Employee addEmployee(Employee e)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
            return em.find(Employee.class, e.getId());
        } finally
        {
            em.close();
        }
    }

    public PhDStudent addStudent(PhDStudent ps)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(ps);
            em.getTransaction().commit();
            return em.find(PhDStudent.class, ps.getId());
        } finally
        {
            em.close();
        }
    }

    public Person addPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return em.find(Person.class, p.getId());
        } finally
        {
            em.close();
        }
    }

    public Student findStudent(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(Student.class, i);
        } finally
        {
            em.close();
        }
    }

    public Employee findEmployee(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(Employee.class, i);
        } finally
        {
            em.close();
        }
    }

    public PhDStudent findPhDStudent(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(PhDStudent.class, i);
        } finally
        {
            em.close();
        }
    }

    public Person findPerson(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            return em.find(Person.class, i);
        } finally
        {
            em.close();
        }
    }

    public void deleteStudent(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            Student s = em.find(Student.class, i);
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }

    public void deleteEmployee(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            Employee s = em.find(Employee.class, i);
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }

    public void deletePhDStudent(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            PhDStudent s = em.find(PhDStudent.class, i);
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }

    public void deletePerson(long i)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            Person s = em.find(Person.class, i);
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }

    public Student editStudent(Student s)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
            return em.find(Student.class, s.getId());
        } finally
        {
            em.close();
        }
    }

    public Employee editEmployee(Employee e)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();
            return em.find(Employee.class, e.getId());
        } finally
        {
            em.close();
        }
    }

    public PhDStudent editPhDStudent(PhDStudent ps)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(ps);
            em.getTransaction().commit();
            return em.find(PhDStudent.class, ps.getId());
        } finally
        {
            em.close();
        }
    }

    public Person editPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            return em.find(Person.class, p.getId());
        } finally
        {
            em.close();
        }
    }
}
