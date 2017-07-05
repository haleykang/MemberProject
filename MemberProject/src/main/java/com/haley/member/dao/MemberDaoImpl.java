package com.haley.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haley.member.domain.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sqlSession;

	@Override
	public int insert(Member member) {
		// TODO Auto-generated method stub
		
		/*Map<String, Object> resultData = new HashMap<String, Object>();
		resultData.put("insertCode", member.getCode());
		*/
		
		int result = sqlSession.insert("member.insert",member);
		int code;
		if(result == 1) {
			System.out.println("insert() �Ϸ�");
			
			
			
		} else {
			System.out.println("insert ����");
		}
		
		return result;
	}
	
	

	@Override
	public Member selectId(String id) {
		// TODO Auto-generated method stub
		
		Member member = sqlSession.selectOne("member.selectId",id);
		if(member == null) {
			
			System.out.println("��� ������ ���̵� �Դϴ�.");
			
		} else {
			
			System.out.println("�̹� ������� ���̵� �Դϴ�.");
			
		}
		
		return member;
	}



	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		
		
		return sqlSession.selectList("member.selectAll");
	}

	@Override
	public Member selectOne(int code) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.selectOne",code);
	}

	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return sqlSession.update("member.update", member);
	}

	@Override
	public int delete(int code) {
		// TODO Auto-generated method stub
		return sqlSession.delete("member.delete",code);
	}

}
