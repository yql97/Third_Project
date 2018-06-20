/**
 * 
 */
package kugouMusic.dao;

import java.util.List;

import kugouMusic.entity.Song;

/**
 * @author 秋林
 *
 */
public interface SongDao {
	public List<Song> getAllSongInfo(String name);//根据名字
	public List<Song> getAllSong();//推荐
	public List<Song> getAllSongHeat();//热度歌曲
	public List<Song> getAllSongRadio();//电台歌曲
	public List<Song> getAllSongOriginal();//歌曲原创人
	public List<Song> getAllSongMV();//歌曲mv
}
