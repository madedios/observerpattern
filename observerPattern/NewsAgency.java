import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewsAgency implements Subject {
    private Map<String, Set<Observer>> subscribersByCategory = new HashMap<>();

    public void addSubscriber(Observer subscriber, String category) {
        subscribersByCategory.computeIfAbsent(category, k -> new HashSet<>()).add(subscriber);
    }

    public void removeSubscriber(Observer subscriber, String category) {
        subscribersByCategory.getOrDefault(category, new HashSet<>()).remove(subscriber);
    }
    public void nofifySubscribers(String category, String news) {
        Set<Observer> subscribers = subscribersByCategory.getOrDefault(category, new HashSet<>());
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }
}