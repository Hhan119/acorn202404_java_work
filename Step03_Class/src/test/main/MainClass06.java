package test.main;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		Member mem1=new Member();
		Member mem2=new Member();
		Member mem3=new Member();
		
		// mem1 객체에 1번 회원의 정보 담기 
		mem1.num=1;
		mem1.name="김구라";
		mem1.addr="노량진";
		
		// mem2 객체에 2번 회원의 정보를 담아 보세요
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="행신동";
		
		//mem1.showInfo();
		//mem2.showInfo();
		mem3.showInfo();
	}
}









