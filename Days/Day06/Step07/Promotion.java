public class Promotion {
    LocalDate from;
    LocalDate to;

    public Promotion() {
    }

    public Promotion(LocalDate from, LocalDate to) {
	this.from = from;
	this.to = to;
    }

    public boolean isAvailable(LocalDate datefrom) {
	if (datefrom.isAfter(from) && datefrom.isBefore(to))
	    return(true);
	else
	    return(false);
    }
}