package client;


import entities.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Date;

public class ClientTest {
    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {

            Employee employee = getEmployee();

            session.beginTransaction();
            //session.save(employee);
            Integer id = (Integer) session.save(employee);

            session.getTransaction().commit();

        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    private static Employee getEmployee(){
        Employee employee = new Employee();
        employee.setName("우광우");
        employee.setEmail("wookw123@naver.com");
        employee.setSalary(80000.00);
        employee.setJoining_date(new Date());
        return employee;
    }
}
