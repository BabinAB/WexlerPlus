package ru.levelp.myapp.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.assertNotNull;

public class PatientsTest {
    private EntityManagerFactory emf;
    private EntityManager em;

    @Before
    public void setup() {
        emf = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        em = emf.createEntityManager();
    }

    @After
    public void end() {
        em.close();
        emf.close();
    }

    @Test
    public void testCreatePatient() throws Throwable {
        Patient patient = new Patient("0000-1", "Tony Braxton");
        em.getTransaction().begin();
        try {
            em.persist(patient);
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        } finally {
            em.getTransaction().commit();
        }
    }

    @Test
    public void testCreatePatientWithIQ() throws Throwable {
        Patient patient = new Patient("0000-1", "Donald Trump");
        IntelligenceQuotient s = new IntelligenceQuotient();
        s.setName("Wexler");
        patient.setIntelligenceQuotient(s);

        em.getTransaction().begin();
        try {
            em.persist(patient);
            em.getTransaction().commit();
        } catch (Throwable t) {
            em.getTransaction().rollback();
            throw t;
        }

        Patient found = em.find(Patient.class, patient.getId());
        assertNotNull(found);
        assertNotNull(found.getIntelligenceQuotient());
    }
}
