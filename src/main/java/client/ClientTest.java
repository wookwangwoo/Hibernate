package client;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class ClientTest {
    public static void main(String[] args) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {

            String sql = "SELECT version()";
            String result = (String) session.createNativeQuery(sql).getSingleResult();
            System.out.println("mysql version is:::");

        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
