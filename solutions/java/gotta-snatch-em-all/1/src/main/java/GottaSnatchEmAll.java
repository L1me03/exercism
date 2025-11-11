import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>();
        set.addAll(cards);
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.isEmpty()){
            return false;
        }
        else if(theirCollection.isEmpty()){
            return false;
        }
        else if (!myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection)) {
            return true;}
        
        return false;
    
    }
    

    static Set<String> commonCards(List<Set<String>> collections) {
        
        if (collections.isEmpty()) {
        return new HashSet<>();}

        Set<String> common = new HashSet<>(collections.get(0));

        for(Set<String> i : collections){
            common.retainAll(i);
        }
        return common;
        
    }

    static Set<String> allCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
        return new HashSet<>();}

        Set<String> allCards = new HashSet<>();
        
        for (Set<String> collection : collections) {
        allCards.addAll(collection);
        }return allCards;
    
    }

}

