package com.haley.member;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haley.member.dao.MemberDao;
import com.haley.member.domain.Member;


@Controller
public class HomeController {
	
	@Autowired
	DataSource ds;
	
	@Autowired
	MemberDao dao;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
				
		return "home";
	}
	
	@RequestMapping(value = "join.go", method = RequestMethod.GET)
	public String toJoin(Model model) {
		
		// ȸ�� ���� �������� �̵���
		return "join";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Member member, @RequestParam("id") String id, @RequestParam("pw") String pw,
			HttpSession session) {
		
		// join.jsp���� ����ڰ� �Է��� ������ ����
		
		member.setId(id);
		member.setPw(pw);
		
		System.out.println(dao.insert(member));
		System.out.println(dao.selectAll());
		
		session.setAttribute("member_id", member.getId());
		session.setAttribute("member_pw", member.getPw());
		
		
		return "complete";
	}
	
	@RequestMapping(value="complete.go", method = RequestMethod.GET)
	public String complete() {
		return "home";
	}
	
	@RequestMapping(value="checkId", method = RequestMethod.GET)
	public String checkId(Member member, @RequestParam("id") String id) {
		
		// id �ߺ� Ȯ�� �ϴ� ��� �ֱ�
		System.out.println(dao.selectId(id));
		
		return "join";
	}
	
	
}
