package dao;

import config.HibernateUtil;
import model.Country;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CountryDAO {

    public void insertCountry(Country country) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(country);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public Country getCountryById(String id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Country.class, id);
        }
    }

    public List<Country> getAllCountries() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Country", Country.class).list();
        }
    }

    public void updateCountry(Country country) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.merge(country);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public void deleteCountry(String id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Country country = session.get(Country.class, id);
            if (country != null) {
                tx = session.beginTransaction();
                session.remove(country);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
