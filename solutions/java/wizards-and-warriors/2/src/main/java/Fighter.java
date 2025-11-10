class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        return (fighter.isVulnerable()) ? 10 : 6;
    }
}

class Wizard extends Fighter{

   private boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable(){
        return !spellPrepared;
    }


    @Override
    public int getDamagePoints(Fighter fighter){
        return (spellPrepared) ? 12 : 3;
    }
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

}
