class Leap {

    boolean isLeapYear(int year) {
        
        int firstCondition = year % 4;
        int secondCondition = year % 100;
        int thirdCondition = year % 400;
        
        if(thirdCondition == 0){
            return true;
        }else if(secondCondition == 0 && thirdCondition == 0){
            return true;
        }else if(firstCondition == 0 && secondCondition != 0){
            return true;
        }else{
            return false;
        }
    }

}
