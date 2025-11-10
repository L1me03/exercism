class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {      
       
        if(!knightIsAwake){
            return true;
        }
        return false;        
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == false && archerIsAwake == false & prisonerIsAwake == false){
            return false;
        }else{
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      if(petDogIsPresent == true && archerIsAwake == false){
          return true;
      }else if(prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
          return true;
      }else{
          return false;
      }
}
}
