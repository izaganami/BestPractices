package com.hatim.org.design.patterns.stategy;

import org.junit.Test;

import com.hatim.org.design.patterns.stategy.cards.CardOperator;
import com.hatim.org.design.patterns.stategy.cards.MasterCard;
import com.hatim.org.design.patterns.stategy.cards.PaypalCard;

import junit.framework.Assert;

public class AmazonBoughtItemsTest {

	@Test
	public void testPayWithCard() {
		AmazonBoughtItems amazonBoughtItems = new AmazonBoughtItems();
		
		CardOperator masterCard = new MasterCard();
		amazonBoughtItems.setCardoperator(masterCard);
		Assert.assertEquals("Drone bought with MasterCard", amazonBoughtItems.payWithCard("Drone"));

		CardOperator payPal = new PaypalCard();
		amazonBoughtItems.setCardoperator(payPal);
		Assert.assertEquals("Drone bought with Paypal", amazonBoughtItems.payWithCard("Drone"));
	}

}
