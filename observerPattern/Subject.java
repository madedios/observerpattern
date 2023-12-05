public interface  Subject {
    public void addSubscriber(Observer subscriber, String category);
    public void removeSubscriber(Observer subscriber, String category);
    public void nofifySubscribers(String category, String news);
}
