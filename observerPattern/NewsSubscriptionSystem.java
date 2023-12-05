public class NewsSubscriptionSystem {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("User1");
        Subscriber subscriber2 = new Subscriber("User2");

        subscriber1.subscribe(newsAgency, "Politics");
        subscriber2.subscribe(newsAgency, "Technology");

        newsAgency.nofifySubscribers("Politics", "Political Breaking News!");
        newsAgency.nofifySubscribers("Technology", "Tech Update!");

        subscriber1.unsubscribe(newsAgency, "Politics");

        newsAgency.nofifySubscribers("Politics", "Another Political Update!");
        newsAgency.nofifySubscribers("Technology", "Another Tech Update!");
    }
}