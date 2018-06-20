/**
 * 
 */
package kugouMusic.Service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 秋林
 *
 */
public class MyBatisSqlService {
	private final String resource="mybatis-config.xml";
	private SqlSessionFactory sessionFactory=null;
	public MyBatisSqlService() {
		   Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			this.sessionFactory= new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public SqlSession getSession() {
		 return sessionFactory.openSession();
	}
	
}
