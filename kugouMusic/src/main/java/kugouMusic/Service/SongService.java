/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kugouMusic.dao.SongDao;
import kugouMusic.entity.Song;

/**
 * @author 秋林
 *
 */
public class SongService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public List<Song> getAllSongInfo(String name){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongInfo(name);
	}
	public List<Song> getAllSong(){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSong();
	}
	public List<Song> getAllSongHeat(){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongHeat();
	}
	public List<Song> getAllSongRadio(){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongRadio();
	}
	public List<Song> getAllSongOriginal(){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongOriginal();
	}
	public List<Song> getAllSongMV(){
		SqlSession session=sqlService.getSession();
		SongDao sd=session.getMapper(SongDao.class);
		return sd.getAllSongMV();
	}
	
}
