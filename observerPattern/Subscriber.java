public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribe(NewsAgency newsAgency, String category) {
        newsAgency.addSubscriber(this, category);
    }

    public void unsubscribe(NewsAgency newsAgency, String category) {
        newsAgency.removeSubscriber(this, category);
    }

    @Override
    public void update(String category, String news) {
        System.out.println(name + " received breaking news in category " + category + ": " + news);
    }
}