public class Pupil {
    ScholarSchedule schedule;

    public Pupil() {
    }

    public ScholarSchedule getSchedule() {
	return(this.schedule);
    }

    public void setSchedule(ScholarSchedule schedule) {
	this.schedule = schedule;
    }

    public void wakeUp() {
	if (this.getSchedule().getDayOfWeek() == DayOfWeek.SUNDAY)
	    System.out.println("I can sleep more!");
	else
	    System.out.println("I have to go to school!");
    }
}