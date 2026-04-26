public class BackToSender {


    public static int wageCalculator(int successfulDelivery) {
        int wages = 0;
            
        if (successfulDelivery < 50) {
            wages = successfulDelivery * 160 + 5000;
        } else if (successfulDelivery >= 50 && successfulDelivery <= 59) {
            wages = successfulDeliveries * 200 + 5000;
        } else if (successfulDelivery >= 60 && successfulDelivery <= 69) {
            wages = successfulDelivery * 250 + 5000;
        } else if (successfulDelivery >= 70) {
            wages = successfulDelivery * 500 + 5000;
        }

        return wages;
    }
