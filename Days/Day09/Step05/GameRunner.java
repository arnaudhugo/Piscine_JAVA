public class GameRunner {
    private String input;
    private Key keyToPlay;

    public GameRunner() {
    }

    public GameRunner(Key key, String input) {
	this.input = input;
	this.keyToPlay = key;
    }

    public boolean playGame(Game game) {
	return(game.play(keyToPlay, input));
    }
}