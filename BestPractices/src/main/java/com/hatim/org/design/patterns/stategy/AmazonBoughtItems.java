package com.hatim.org.design.patterns.stategy;

import com.hatim.org.design.patterns.stategy.cards.CardOperator;

public class AmazonBoughtItems {
	
	private CardOperator cardoperator;
	
	public String payWithCard(String item){
		return item+" bought with " + cardoperator.getCardName();		
	}

	public CardOperator getCardoperator() {
		return cardoperator;
	}

	public void setCardoperator(CardOperator cardoperator) {
		this.cardoperator = cardoperator;
	}
	
	
	
	
	
	
	
	/*	 public String payWithMasterCard(String item){
		return item+" bought with MasterCard";		
	}
	
	public String payWithPaypal(String item){
		return item+" bought with Paypal";		
	}
	*/

}
