package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-09.
 */

public class Referee implements ScorePublisher {

    private List<ScoreSubscriber> subscribers;
    private Integer scoreTeamA;
    private Integer scoreTeamB;

    public Referee() {
        this.subscribers = new LinkedList<>();
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    @Override
    public void addSubscriber(ScoreSubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added");
    }

    @Override
    public void removeSubscriber(ScoreSubscriber subscriber) {
        if (subscribers.remove(subscriber)){
            System.out.println("Subscriber removed");
        }
    }

    @Override
    public void inform() {
        for (ScoreSubscriber subscriber : subscribers) {
            subscriber.updateScore(scoreTeamA, scoreTeamB);
        }
        System.out.println("Subscribers informed");
    }

    public void setGoal(String team) {
        if (team.equals("A")) {
            ++scoreTeamA;
            inform();
        }
        if (team.equals("B")) {
            ++scoreTeamB;
            inform();
        }
    }
}
