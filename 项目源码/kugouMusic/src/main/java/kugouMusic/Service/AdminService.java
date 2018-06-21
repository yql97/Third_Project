/**
 * 
 */
package kugouMusic.Service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.AdminDao;
import kugouMusic.entity.Admins;

/**
 * @author 秋林
 *
 */
@Service
public class AdminService implements AdminDao{
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public Admins getAllAdminInfo(String name, String pwd) {
		SqlSession session=sqlsessionFactory.openSession();
		AdminDao ad	=session.getMapper(AdminDao.class);
	    Admins a=ad.getAllAdminInfo(name, pwd);
	    session.close();
		return a;
	}
}
