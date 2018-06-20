/**
 * 
 */
package kugouMusic.dao;

import kugouMusic.entity.Admins;

/**
 * @author 秋林
 *
 */
public interface AdminDao {
	public Admins getAllAdminInfo(String adminName, String adminPwd);
}
