public class Main {
    public static void main(String[] args) {
	Key k = new Key("keyReword");

	Game g = new Game("GameOne",null,k) {

		@Override
		    public Key reward() {
		    return getKeyReward();
		}

		@Override
		    public boolean play(Key k,String input) {
		    System.out.println(input);
		    return false;
		}

		@Override
		    public boolean canPlay(Key k) {
		    if (getKeyCondition() == null){
			return true;
		    }
		    if (k.equals(getKeyCondition())){
			return true;
		    }
		    return false;
		}
	    };

	System.out.println(g.reward().getName());
	System.out.println(g.play(k,"input string"));
	System.out.println(g.canPlay(k));
    }
}