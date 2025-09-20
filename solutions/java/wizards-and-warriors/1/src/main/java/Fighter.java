class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }
    public String toString(){
        return "Fighter is a Warrior";
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean spell = false;
    boolean isVulnerable(){
        return !spell;
    }
    int getDamagePoints(Fighter fighter){
        return spell ? 12 : 3;
    }
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        spell = true;
    }
}