/**
 * 
 */
package kugouMusic.entity;

import java.io.Serializable;

/**
 * @author 秋林
 *
 */
public class Song implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int songID;
	private String songName;
	private String songSinger;
	private String songImg;
	private String songWords;
	private String songURL;
	private int areaID;
	public Song() {
		super();
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getSongID() {
		return songID;
	}
	public void setSongID(int songID) {
		this.songID = songID;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongSinger() {
		return songSinger;
	}
	public void setSongSinger(String songSinger) {
		this.songSinger = songSinger;
	}
	public String getSongImg() {
		return songImg;
	}
	public void setSongImg(String songImg) {
		this.songImg = songImg;
	}
	public String getSongWords() {
		return songWords;
	}
	public void setSongWords(String songWords) {
		this.songWords = songWords;
	}
	public String getSongURL() {
		return songURL;
	}
	public void setSongURL(String songURL) {
		this.songURL = songURL;
	}
	public int getAreaID() {
		return areaID;
	}
	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}
	@Override
	public String toString() {
		return "Song [songID=" + songID + ", songName=" + songName + ", songSinger=" + songSinger + ", songImg="
				+ songImg + ", songWords=" + songWords + ", songURL=" + songURL + ", areaID=" + areaID + "]";
	}
	public Song(int songID, String songName, String songSinger, String songImg,
			String songWords, String songURL, int areaID) {
		super();
		this.songID = songID;
		this.songName = songName;
		this.songSinger = songSinger;
		this.songImg = songImg;
		this.songWords = songWords;
		this.songURL = songURL;
		this.areaID = areaID;
	}
}
