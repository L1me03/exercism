public class CarsAssemble {

    public double productionPerOneHour = 221;
    
    public double productionRatePerHour(int speed) {

        double ratio;
        
        if(speed <= 10 && speed > 9){
            ratio = 0.77;
        }else if(speed <= 9 && speed > 8){
            ratio = 0.8;
        }else if(speed <= 8 && speed > 4){
            ratio = 0.9;
        }else{
            ratio = 1;
        }

        return speed * productionPerOneHour * ratio;
    }

    public int workingItemsPerMinute(int speed) {
        int productionPerOneMinute = (int) (productionRatePerHour(speed) / 60);

        return productionPerOneMinute;
    }
}
