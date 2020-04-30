package kr.ac.mjc.sungbin.java.exceptions;

public class WalletTest {
	
	public static void main(String[] args) {
		try {
			Wallet wallet = new Wallet(-10); // 잔고가 100인 지갑 생성
			int balance = wallet.pay(133);
			System.out.println("잔고는 " + balance);
		} catch (WalletException | PaymentException e) {
			e.printStackTrace();
			// TODO: 지갑 생성에 실패할때나 지불에 실패할 경우 처리
		} 
	}

}
