/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.CooperateDao;
import kugouMusic.entity.Cooperate;

/**
 * @author 秋林
 *
 */
@Service
public class CoopernateService implements CooperateDao {
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public List<Cooperate> getAllCooperateInfo(){
		SqlSession session=sqlsessionFactory.openSession();
		CooperateDao cd	=session.getMapper(CooperateDao.class);
	    List<Cooperate> clist=cd.getAllCooperateInfo();
	    session.close();
		return clist;
		
	}
}
