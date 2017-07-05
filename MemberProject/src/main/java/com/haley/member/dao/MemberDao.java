package com.haley.member.dao;

import java.util.List;
import java.util.Map;

import com.haley.member.domain.Member;

public interface MemberDao {
	
	// CRUD
	
	// 1. insert
	public int insert(Member member);
	
	// 2. selectAll()
	public List<Member> selectAll();
	
	// 3. selectOne()
	public Member selectOne(int code);
	
	// 3-1. selectId()
	public Member selectId(String id);
	
	// 4. update()
	public int update(Member member);
	
	// 5. delete()
	public int delete(int code);
	
	
	
	

}
