public class PayByCreditCard extends Bank implements PayStrategy {
    CreditCard creditCard;
    String pinCode;

    public PayByCreditCard() {
    }

    public PayByCreditCard(CreditCard creditCard, String pinCode) {
	this.creditCard = creditCard;
	this.pinCode = pinCode;
    }

    public boolean pay(int price) {
	if (creditCard == null) {
	    System.out.println("Card is not present!");
	    return(false);
	}
	if (creditCard.getAttempts() >= 3) {
	    System.out.println("Card is blocked!");
	    return(false);
	}

	if (pinCode != null && pinCode.equals(creditCard.getPinCode())) {
	    if (!pay(creditCard.getAccountId(), price)) {
		return(false);
	    }
	    else {
		System.out.println("Payment successful!");
		return(true);
	    }
	}
	else {
	    System.out.println("Wrong pincode");
	    creditCard.setAttempts(creditCard.getAttempts() + 1);
	    return(false);
	}
    }
}