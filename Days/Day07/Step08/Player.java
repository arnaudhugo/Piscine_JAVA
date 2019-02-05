public class Player<T> {
    private T song;

    public Player() {
    }

    public T getSong() {
	return(this.song);
    }

    public void setSong(T song) {
	this.song = song;
    }

    public T playSong() {
	return(this.song);
    }

    public void addSong(T t) {
        this.song = t;
    }

    public static Player<Music> listenToTheMusic(Music type) {
	Player<Music> n = new Player();
	n.setSong(type);
	return(n);
    }
}