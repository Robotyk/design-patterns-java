package observer;

/**
 * Created by Robotyk on 2018-06-09.
 */
public interface ScorePublisher {

    void addSubscriber(ScoreSubscriber subscriber);
    void removeSubscriber(ScoreSubscriber subscriber);
    void inform();
}
