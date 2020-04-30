package kr.ac.mjc.sungbin.homework.exceptions;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("로그인 창입니다.");
		String stdId = null;
		String stdPw = null;
		
		try(Scanner sc = new Scanner(System.in); Scanner s = new Scanner(System.in);) {
			System.out.print("id를 입력해주세요 : ");
			stdId = sc.next();
			System.out.println();
			System.out.print("pw를 입력해주세요 : ");
			System.out.println();
			stdPw = s.next();
			login(stdId, stdPw);
			if(stdId == "2016041062" && stdPw == "1234") {
				System.out.println("로그인 성공입니다.");
			}
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("메인 페이지로 이동합니다.");
	}
	
	public static void login(String stdId, String stdPw) throws LoginException {
		
		if(!stdId.equals("2016041062")) {
			System.out.println("아이디가 다릅니다!");
			throw new LoginException("다시 입력 바랍니다.");
		}
		if(!stdPw.equals("1234")) {
			System.out.println("비밀번호가 다릅니다.");
			throw new LoginException("다시 입력바랍니다.");
		}
		
	}

}
