        public class StandardDeviation {
    
        public static double getdata (int [] data) {
        
        int sum = 0;
            
        for (int count : data) {
        
        sum += count;
        }  
        
        return sum;
        }
        
        
        public static double getAverage (int [] data) {
        
            double sum = getdata(data);
            
            int count = data.length;
        
           double average = sum / count;
        
        return average;
        
        }
        
        public static double getMeanDeviation (int [] data) {
        
        double meanDeviation = 0;
        
        double squareMeanDeviation = 0;
        
        double mean = getAverage(data);
        
        for (int count = 0; count < data.length; count++) {
        
         meanDeviation += data[count] - mean;
        
         squareMeanDeviation += meanDeviation * meanDeviation;
        
        }
        
        return meanDeviation;
        }
        
        public static double getVariance (int [] data) {
        
        int count = data.length;
        
        double meanDeviation = 0;
        
        double squareMeanDeviation = 0;
        
        double mean = getAverage(data);
        
        for (int index = 0; index < data.length; index++) {
        
         meanDeviation += data[index] - mean;
        
         squareMeanDeviation += meanDeviation * meanDeviation;
        
        }
        
        double variance = squareMeanDeviation / count;
        
        return variance;
        
        }
        
//        public static double getStandardDeviation (double standardDeviation, double variance) {
//        
//        
//               
//        standardDeviation = Math.sqrt(variance); 
//        
//        double standard = Math.round(standardDeviation * 100.0) / 100.0;
//        
//        return  variance;
//        
//        }
        
         public static double getStandardDeviation (int [] data) {
        
       double variance = getVariance(data);
               
        double standardDeviation = Math.sqrt(variance); 
        
       double standard = Math.round(standardDeviation * 100.0) / 100.0;
        
        return  standard;
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        



