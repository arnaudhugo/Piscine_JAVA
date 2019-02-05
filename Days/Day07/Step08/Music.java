public class Music {
    protected String artist;
    protected String title;

    public Music() {
    }

    public Music(String artist, String title) {
	this.artist = artist;
	this.title = title;
    }

    public String getArtist() {
	return(this.artist);
    }

    public void setArtist(String artist) {
	this.artist = artist;
    }

    public String getTitle() {
	return(this.title);
    }

    public void setTitle(String title) {
	this.title = title;
    }
}