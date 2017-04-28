package razorthink.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import razorthink.models.User;
import javax.transaction.Transactional;

/**
 * Created by sethulakshmi on 24/4/17.
 */

@Repository
@Transactional
public class UserDao
{
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

    //save user
    public void save(User user)
    {
        getSession().save(user);
    }

    //delete user
    public void delete(User user)
    {
        getSession().delete(user);
    }
}





