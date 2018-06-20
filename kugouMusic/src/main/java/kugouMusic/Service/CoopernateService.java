/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import kugouMusic.dao.CooperateDao;
import kugouMusic.entity.Cooperate;

/**
 * @author 秋林
 *
 */
public class CoopernateService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public List<Cooperate> getAllCooperateInfo(){
		SqlSession session=sqlService.getSession();
		CooperateDao cd	=session.getMapper(CooperateDao.class);
	    List<Cooperate> clist=cd.getAllCooperateInfo();
	    session.close();
		return clist;
		
	}
}
