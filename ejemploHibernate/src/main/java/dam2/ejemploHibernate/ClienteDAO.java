package dam2.ejemploHibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class ClienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Cliente findCliente(Integer id) {
        return entityManager.find(Cliente.class, id);
    }

    public void saveCliente(Cliente cliente) {
        entityManager.persist(cliente);
    }

    public void deleteCliente(Integer id) {
        Cliente cliente = findCliente(id);
        if (cliente != null) {
            entityManager.remove(cliente);
        }
    }

    // Otros métodos de CRUD...
}

