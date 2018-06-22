/**
 * 
 */
package kugouMusic.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kugouMusic.dao.ImgDao;
import kugouMusic.entity.Img;

/**
 * @author 秋林
 *
 */
@Service
public class ImgService implements ImgDao{
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	public List<Img> getImgInfo(){
		SqlSession session=sqlsessionFactory.openSession();
		ImgDao id=session.getMapper(ImgDao.class);
	    List<Img> imglist =id.getImgInfo();
	    session.close();
		return imglist;
	}
}
