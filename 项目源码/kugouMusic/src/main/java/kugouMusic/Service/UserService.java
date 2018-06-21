/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.UserDao;
import kugouMusic.entity.Users;

/**
 * @author 秋林
 *
 */
@Service
public class UserService implements UserDao{
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public List<Users> getAllUserInfo(){
		SqlSession session=sqlsessionFactory.openSession();
		UserDao ud	=session.getMapper(UserDao.class);
		List<Users> ulist=ud.getAllUserInfo();
		return ulist;
	}
	public Users getAllUserInfoById(String name) {
		SqlSession session=sqlsessionFactory.openSession();
		UserDao ud	=session.getMapper(UserDao.class);
		  Users  u=ud.getAllUserInfoById(name);
		  return u;
	}
	public boolean updateUserInfo(Users u) {
		SqlSession session=sqlsessionFactory.openSession();
		UserDao ud	=session.getMapper(UserDao.class);
		   boolean status=ud.updateUserInfo(u);
		   return status;
	}
	public Users getAllUserInfoByName(String name, String pwd) {
		SqlSession session=sqlsessionFactory.openSession();
		 UserDao ud	=session.getMapper(UserDao.class);
		  Users  u=ud.getAllUserInfoByName(name, pwd);
		  return u;
	}
	public boolean insertUserInfo(Users u) {
		SqlSession session=sqlsessionFactory.openSession();
		UserDao ud	=session.getMapper(UserDao.class);
		   boolean status=ud.insertUserInfo(u);
		   return status;
	}
}
