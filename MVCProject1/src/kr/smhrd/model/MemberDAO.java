package kr.smhrd.model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 기존 JDBC문제점?=>MyBatis
public class MemberDAO {	
	private static SqlSessionFactory sqlSessionFactory;	
	// 초기화 블럭
	static {
		try {
			String resource = "kr/smhrd/mybatis/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory =
			new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	//-------------------------------------------------------
	public List<MemberVO> memberList() {
		SqlSession session=sqlSessionFactory.openSession();
		List<MemberVO> list=session.selectList("memberList");
		session.close(); // 반납
		return list;
	}
}