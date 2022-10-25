package hio.controller;

import java.util.Scanner;

import hio.domain.HioMember;
import service.HioMemberLoginService;

public class HioMemberLoginController implements HioMemberLoginInterface{

	HioMember hioMember = new HioMember();
	Scanner sc = new Scanner(System.in);
	
	public int memberLogin() {
			int result = -1;
			
			System.out.println("------------------------------------------------");
			System.out.println("--------------------- 로그인 ---------------------");
			System.out.print("회원 아이디 입력 >>");
			String memberId = sc.nextLine();
			System.out.print("회원 비밀번호 입력 >>");
			String memberPwd = sc.nextLine();

			
			hioMember.setMemberId(memberId);
			hioMember.setMemberPwd(memberPwd);
			
			result = new HioMemberLoginService().memberLogin(hioMember);
			
			return result;
	}
	
}
