/**
 * 
 */
package kugouMusic.dao;

import java.util.List;

import kugouMusic.entity.Record;
/**
 * @author 秋林
 *
 */
public interface RecordDao {
	public boolean recordInfo(Record red);//添加
	public List<Record> getAllRecordInfo();
	public int getAllRecordcount(String name);
}
