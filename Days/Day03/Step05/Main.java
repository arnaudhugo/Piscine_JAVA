public class Main {
    public static void main(String[] args) {
	ScholarSchedule schedule = new ScholarSchedule();

	schedule.setDayOfWeek(DayOfWeek.FRIDAY);
	Pupil p = new Pupil();
	p.schedule = schedule;
	p.wakeUp();
	schedule.setDayOfWeek(DayOfWeek.SUNDAY);
	p.wakeUp();
    }
}