package ro.ase.cts.refactoring.phase3;

import ro.ase.cts.refactoring.exceptions.InvalidValueException;

public class SalesStrategy {
	
	public static final int FIDELITY_YEARS_THRESHOLD = 10;
	public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
	public static final float NORMAL_DISCOUNT = 0.1f;
	
	public static float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
	}
	
	public static float getPriceWithDicount(float initialPrice, float discount, float fidelityDiscount) {
		return (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
	}
	
	public float ComputeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueException();
		}
		
	    float finalResult = 0;
	    float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration); 
	    
	    switch(productType) {
	    case NEW:
		    finalResult = initialPrice;
	    	break;
	    case DISCOUNTED:
	    	finalResult = getPriceWithDicount(initialPrice, ProductType.DISCOUNTED.getDiscount(), fidelityDiscount);
	    	break;
	    case LIMITED_STOCK:
		    finalResult = getPriceWithDicount(initialPrice, ProductType.LIMITED_STOCK.getDiscount(), fidelityDiscount);
	    	break;
	    case LEGACY:
			finalResult = getPriceWithDicount(initialPrice, ProductType.LEGACY.getDiscount(), fidelityDiscount);
			break;
	    default:
	    	throw new UnsupportedOperationException("Type not managed");
	    }

		return finalResult;
	}
}
