

package edu.connect.DAO;

import edu.connect.exception.ConnectTelServiceDAOException;
import java.util.ArrayList;
import java.util.List;


public abstract class AbstractDAO<T> {

    private Class<T> entityClass;

//  модификатор доступа ???
    public List<T> entityList = new ArrayList<>();


    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
    
    public void add(T entity) throws ConnectTelServiceDAOException {
//        if (entityList.isEmpty() ) {
//            loadCollection();
//        }
        try {
            if (entity != null && !entityList.contains(entity)){
// TODO
//  по-хорошему здесь надо генерировать id для любого объекта, в случае если стратегия генерации одинакова для всех, но пока неизвестно, как это сделать...ПОДУМАТЬ!!!!  
            entityList.add(entity);
            saveCollection(entityList);
            }
        }
        catch (Exception ex){
            throw new ConnectTelServiceDAOException(ex);
        }
    }

    public void update(T entity) throws ConnectTelServiceDAOException {
         if (entityList == null) {
//            loadCollection();
        }
        try {
            if (entity != null && entityList.contains(entity)){
                entityList.remove(entity);
                entityList.add(entity);
//                saveCollection();
            }
        }
        catch (Exception ex){
            throw new ConnectTelServiceDAOException(ex);
        }
    }

    public void delete(T entity) throws ConnectTelServiceDAOException {
        if (entityList == null) {
//            loadCollection();
        }
         try {
            if (entity != null && entityList.contains(entity)){
                entityList.remove(entity);
//                saveCollection();
            }
        }
        catch (Exception ex){
            throw new ConnectTelServiceDAOException(ex);
        }
    }

    public T find(long id) throws ConnectTelServiceDAOException {

//  TODO: хорошо подумать!!!
           return null;
    }

    public List<T> findAll() throws ConnectTelServiceDAOException {
        return new ArrayList<>(entityList);
    }
    
    public long generateId() {
        return Math.round(Math.random() * 1000000);
    }
    
    
    abstract protected void saveCollection(List<T> t) throws ConnectTelServiceDAOException;
    
    abstract protected void loadCollection() throws ConnectTelServiceDAOException;
}
