/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kugouMusic.dao.RecordDao;
import kugouMusic.entity.Record;

/**
 * @author 秋林
 *
 */
public class RecordService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public boolean recordInfo(Record red) {
		SqlSession session=sqlService.getSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		boolean status =rd.recordInfo(red);
		return status;
	}
	
	public List<Record> getAllRecordInfo(){
		SqlSession session=sqlService.getSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		      List<Record> rlist=rd.getAllRecordInfo();
		return rlist;
	}
	
	public int getAllRecordcount(String name) {
		SqlSession session=sqlService.getSession();
		RecordDao rd=session.getMapper(RecordDao.class);
		int t= rd.getAllRecordcount(name);
		return t;
	}
	
}
