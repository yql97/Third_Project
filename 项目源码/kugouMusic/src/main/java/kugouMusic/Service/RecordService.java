/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.RecordDao;
import kugouMusic.entity.Record;

/**
 * @author 秋林
 *
 */
@Service
public class RecordService implements RecordDao{
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public boolean recordInfo(Record red) {
		SqlSession session=sqlsessionFactory.openSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		boolean status =rd.recordInfo(red);
		return status;
	}
	
	public List<Record> getAllRecordInfo(){
		SqlSession session=sqlsessionFactory.openSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		      List<Record> rlist=rd.getAllRecordInfo();
		return rlist;
	}
	
	public int getAllRecordcount(String name) {
		SqlSession session=sqlsessionFactory.openSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		int t= rd.getAllRecordcount(name);
		return t;
	}
	
}
