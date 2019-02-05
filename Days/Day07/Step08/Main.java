public class Main {
    public static void main(String[] args) {
	Music rap = new Rap("DRAKE","GOD'S PLAN");
	Player<Music> player = Player.listenToTheMusic(rap);
	System.out.println("player: music title: " + player.playSong().getTitle());
	System.out.println("player: music artist: " +player.playSong().getArtist());
    }
}