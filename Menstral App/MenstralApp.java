    public class MenstralApp {
    
    public static boolean validEmail(String email) {
    if (email.length() <= 8){
    return false;
    }
    
     return true;
        }
        
   public static boolean validPassword(String password) {
    if (password.length() <= 8){
    return false;
    }
   
     return true;
        }
        
     int round = 0;   
     public static int validCycleLength (int cycle) {
     if (round >= 20 || round <= 35){
     return round;
     }
    return 0;
        } 
        
        
   int period = 0;
    public static int periodDay (int period) {
     period += period + 7;
     return period;    
    }
    
    public static int ovulationDate (int ovulation) {
     int date = round - 14;
     return date;
    }
        

    public static int fertileWindow (int fertile) {
     int set = round - 19;
     return set;
    }    
        
          
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
