/**
 * 
 */
package kugouMusic.dao;

import java.util.List;

import kugouMusic.entity.Users;


/**
 * @author 秋林
 *
 */
public interface UserDao {
	public List<Users> getAllUserInfo();//得到所有
	public Users getAllUserInfoById(String name);
	public boolean updateUserInfo(Users u);//更新
	public Users getAllUserInfoByName(String name, String pwd);
	public boolean insertUserInfo(Users u) ;//插入
	
}
