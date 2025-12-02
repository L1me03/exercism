class Darts {
    int score(double xOfDart, double yOfDart) {
        
        double d = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);

        if(d <= 1){
            return 10;
        }else if(d > 1 && d <= 5){
            return 5;
        }else if(d > 5 && d <= 10){
            return 1;
        }else{
            return 0;
        }
    }
}
