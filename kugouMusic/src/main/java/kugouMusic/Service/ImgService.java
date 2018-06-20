/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import kugouMusic.dao.ImgDao;
import kugouMusic.entity.Img;

/**
 * @author 秋林
 *
 */
public class ImgService {
	MyBatisSqlService sqlService=new MyBatisSqlService();
	public List<Img> getImgInfo(){
		SqlSession session=sqlService.getSession();
		ImgDao id=session.getMapper(ImgDao.class);
	    List<Img> imglist =id.getImgInfo();
	    session.close();
		return imglist;
	}
}
