package kr.ac.mjc.sungbin.java.exceptions;

public class Wallet {
	
	/**
	 * 잔고
	 */
	private int balance = 0;

	/**
	 * 잔고를 초기화하는 컨스트럭터
	 */
	public Wallet(int balance) throws WalletException {
		if (balance < 0)
			throw new WalletException("잔고는 0보다 커야 합니다.");
		
		this.balance = balance;
	}

	/**
	 * 지불. 잔고를 차감하고 차감한 잔고를 리턴한다.
	 * 
	 * @throws PaymentException 잔고가 부족할 경우 발생한다.
	 */
	public int pay(int amount) throws PaymentException {
		if (balance < amount)
			throw new PaymentException("잔고가 부족합니다.");

		return balance -= amount;
	}

}
