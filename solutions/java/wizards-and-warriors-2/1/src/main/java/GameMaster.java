public class GameMaster {

   
    public String describe(Character ch){
        return "You're a level " + ch.getLevel() + " " + ch.getCharacterClass() + " with " + ch.getHitPoints() + " hit points.";
    }
   
    public String describe(Destination d){
        return "You've arrived at " + d.getName() + ", which has " + d.getInhabitants() + " inhabitants.";
    }
   
    public String describe(TravelMethod tm){
        String end = tm == TravelMethod.HORSEBACK ? "on horseback." : "by walking.";
        return "You're traveling to your destination " + end;
    }
    
    public String describe(Character ch, Destination d, TravelMethod tm){
        return this.describe(ch) + " " + this.describe(tm) + " " + this.describe(d);
    }
    
    public String describe(Character ch, Destination d){
        return this.describe(ch) + " "+ this.describe(TravelMethod.WALKING)+ " " + this.describe(d);
    }
}
