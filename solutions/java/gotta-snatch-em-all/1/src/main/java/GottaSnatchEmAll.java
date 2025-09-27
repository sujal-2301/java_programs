import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set <String> set = new HashSet<>();
        for(String ele : cards){
            set.add(ele);
        }
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
        
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean flag = false;
        for(String myele : myCollection){
            if(!theirCollection.contains(myele)){
                flag = true;
                break;
            }
        }
        if(flag == false){return flag;}
        flag = false;
        for(String theirele : theirCollection){
            if(!myCollection.contains(theirele)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if(collections == null){
            return new HashSet<>();
        }
        else if (collections.size() == 1){
            return new HashSet<>(collections.get(0));
        }
        Set<String> ans = new HashSet<>();
        for(String ele : collections.get(0)){
            if(collections.get(1).contains(ele)){ans.add(ele);} 
        }
        return ans;
        
           

    }

    static Set<String> allCards(List<Set<String>> collections) {
        if(collections == null){
            return new HashSet<>();
        }
        else if (collections.size() == 1){
            return new HashSet<>(collections.get(0));
        }
        Set<String> ans = new HashSet<>();
        for(Set<String> set : collections){
        for(String ele : set){
            ans.add(ele);
        }}
        return ans;
    }
}
