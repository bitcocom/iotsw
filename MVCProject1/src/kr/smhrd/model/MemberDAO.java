package kr.smhrd.model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 기존 JDBC문제점?=>MyBatis
public class MemberDAO { // MemberMapper(interface)	
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
	public int memberDelete(int num) {
		SqlSession session=sqlSessionFactory.openSession();
		int cnt=session.delete("memberDelete", num);// 1, 0
		session.commit(); //완료
		session.close(); // 반납
		return cnt;
	}
	public int memberInsert(MemberVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		int cnt=session.insert("memberInsert", vo);// 1, 0
		session.commit(); //완료
		session.close(); // 반납
		return cnt;
	}	
	public MemberVO memberContent(int num) {
		SqlSession session=sqlSessionFactory.openSession();
		MemberVO vo=session.selectOne("memberContent", num);
		session.close(); // 반납
		return vo;		
	}
	public int memberUpdate(MemberVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		int cnt=session.update("memberUpdate", vo);
		session.commit();
		session.close();
		return cnt;
	}
}




