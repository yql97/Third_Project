/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kugouMusic.dao.UserDao;
import kugouMusic.entity.Users;

/**
 * @author 秋林
 *
 */
public class UserService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public List<Users> getAllUserInfo(){
		SqlSession session=sqlService.getSession();
		UserDao ud	=session.getMapper(UserDao.class);
		List<Users> ulist=ud.getAllUserInfo();
		return ulist;
	}
	public Users getAllUserInfoById(String name) {
		SqlSession session=sqlService.getSession();
		UserDao ud	=session.getMapper(UserDao.class);
		  Users  u=ud.getAllUserInfoById(name);
		  return u;
	}
	public boolean updateUserInfo(Users u) {
		SqlSession session=sqlService.getSession();
		UserDao ud	=session.getMapper(UserDao.class);
		   boolean status=ud.updateUserInfo(u);
		   return status;
	}
	public Users getAllUserInfoByName(String name, String pwd) {
		SqlSession session=sqlService.getSession();
		 UserDao ud	=session.getMapper(UserDao.class);
		  Users  u=ud.getAllUserInfoByName(name, pwd);
		  return u;
	}
	public boolean insertUserInfo(Users u) {
		SqlSession session=sqlService.getSession();
		UserDao ud	=session.getMapper(UserDao.class);
		   boolean status=ud.insertUserInfo(u);
		   return status;
	}
}
