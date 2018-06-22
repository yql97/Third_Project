/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.SongDao;
import kugouMusic.entity.Song;

/**
 * @author 秋林
 *
 */
@Service
public class SongService implements SongDao{
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public List<Song> getAllSongInfo(String name){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongInfo(name);
	}
	public List<Song> getAllSong(){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSong();
	}
	public List<Song> getAllSongHeat(){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongHeat();
	}
	public List<Song> getAllSongRadio(){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongRadio();
	}
	public List<Song> getAllSongOriginal(){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongOriginal();
	}
	public List<Song> getAllSongMV(){
		SqlSession session=sqlsessionFactory.openSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongMV();
	}
	
}
