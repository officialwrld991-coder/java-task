import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoTest {

    @Test
    
    public void testThatAmountReturnsValidAmount(){
        double amount = 20000.00;
        double expectedAmount = 20000.00;
        double actualAmount = OshoFreePromo.getAmount(amount);
        assertEquals(expectedAmount, actualAmount);
    } 
    
    
    @Test
    
    public void testThatAmountReturnsInValidAmount(){
        int amount = -800;
        double expectedAmount = 0;
        double actualAmount = OshoFreePromo.getAmount(amount);
        assertEquals(expectedAmount, actualAmount);
    } 
    
     @Test
    
    public void testThatDiscountProvidedIsValid(){
        int amount = 4000;
        int discount = 0;
        double expectedDiscount = 4000;
        double actualDiscount = OshoFreePromo.getDiscountedPrice(discount, amount);
        assertEquals(expectedDiscount, actualDiscount);
    } 
    
       
    @Test
    
    public void testThatTenpercentDiscountedPriceProvideAccurateAmount(){
        int amount = 13000;
        int discount = 10;
        double expectedDiscount = 11700;
        double actualDiscount = OshoFreePromo.getDiscountedPrice(discount, amount);
        assertEquals(expectedDiscount, actualDiscount);
        
    } 
    
     @Test
    
    public void testThatTwentyPercentDiscountedPriceProvideAccurateAmount(){
        int amount = 25000;
        int discount = 20;
        double expectedDiscount = 20000;
        double actualDiscount = OshoFreePromo.getDiscountedPrice(discount, amount);
        assertEquals(expectedDiscount, actualDiscount);
        
    }
    
     @Test
    
    public void testThatThirtyFivePercentDiscountedPriceProvideAccurateAmount (){
        int amount = 40000;
        int discount = 35;
        double expectedDiscount = 26000;
        double actualDiscount = OshoFreePromo.getDiscountedPrice(discount, amount);
        assertEquals(expectedDiscount, actualDiscount);
        
    } 
    
    
      @Test
    
    public void testThatTenPercentAValidPromoCodeIsEntered (){
        String promo = "STARTER10";
        double expectedPromoCode = 0.1;
        double actualPromoCode = OshoFreePromo.getPromoCode(promo);
        assertEquals(actualPromoCode, expectedPromoCode);
        
    } 
    
      @Test
    
    public void testThatTwentyPercentAValidPromoCodeIsEntered (){
        String promo = "OSHOFREE35";
        double expectedPromoCode = 0.35;
        double actualPromoCode = OshoFreePromo.getPromoCode(promo);
        assertEquals(actualPromoCode, expectedPromoCode);
        
    } 
    
      @Test
    
    public void testThatThirtyFivePercentAValidPromoCodeIsEntered (){
        String promo = "BIGBOY20";
        double expectedPromoCode = 0.2;
        double actualPromoCode = OshoFreePromo.getPromoCode(promo);
        assertEquals(expectedPromoCode, actualPromoCode);
        
    } 
    
    
    
    
    
    
    
    
    }

