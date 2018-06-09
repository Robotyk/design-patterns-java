package observer;

/**
 * Created by Robotyk on 2018-06-09.
 */
public class Scoreboard implements ScoreSubscriber {

    private Integer scoreTeamA;
    private Integer scoreTeamB;

    public Scoreboard() {
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    public Scoreboard(ScorePublisher publisher) {
        this();
        publisher.addSubscriber(this);
    }

    @Override
    public void updateScore(Integer scoreTeamA, Integer scoreTeamB) {
        this.scoreTeamA = scoreTeamA;
        this.scoreTeamB = scoreTeamB;
        presentScore(scoreTeamA, scoreTeamB);
    }

    private void presentScore(Integer scoreTeamA, Integer scoreTeamB) {
        System.out.println("Team A score equals: " + scoreTeamA + "\nTeam B score equals: " + scoreTeamB);
    }
}
