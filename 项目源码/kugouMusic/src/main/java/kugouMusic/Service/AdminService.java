/**
 * 
 */
package kugouMusic.Service;

import org.apache.ibatis.session.SqlSession;

import kugouMusic.dao.AdminDao;
import kugouMusic.entity.Admins;

/**
 * @author 秋林
 *
 */
public class AdminService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public Admins getAllAdminInfo(String name, String pwd) {
		SqlSession session=sqlService.getSession();
		AdminDao ad	=session.getMapper(AdminDao.class);
	    Admins a=ad.getAllAdminInfo(name, pwd);
	    session.close();
		return a;
	}
}
