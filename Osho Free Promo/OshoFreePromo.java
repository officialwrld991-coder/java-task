    public class OshoFreePromo { 
    
       
    public static double getAmount (double amount) {
    
    if (amount >= 1000 && amount < 5000) {
        return amount;
    }
    
    else if (amount >= 5000 && amount < 15000) {
        return amount;
    }
    
     else if (amount >= 15000 && amount < 30000){
        return amount;
    }
    
     if (amount >= 30000){
        return amount;
    }
    else return 0;
    
    }
    
  public static double getPromoCode (String promo) {
  
       switch (promo) {
       
            case "STARTER10": return 0.1;
            
            case "BIGBOY20": return 0.2;
            
            case "OSHOFREE35": return 0.35;
            
            default: return 0;
       }
    
        }
    
  public static double getDiscountedPrice (int discount, double amount) {
    
        switch (discount) {
        
            case 10: {
            double newAmount = amount - (0.1 * amount);
            return newAmount;          
            }
            
            case 20: {
            double newAmount = amount - (0.2 * amount);
            return newAmount;            
            }
            
            case 35: {
            double newAmount = amount - (0.35 * amount);
            return newAmount;           
            }
           default: {
                return amount;    
             } 
        }
        
    }
    
    }
