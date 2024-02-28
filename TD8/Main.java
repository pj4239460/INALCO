public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.setTime(10, 30);
        System.out.println(timer.getTime());
    }
}

class Timer {
    private Time time;

    public void setTime(int hours, int minutes) {
        this.time = new Time(hours, minutes);
    }

    public String getTime() {
        return time.hours + ":" + time.minutes;
    }

    class Time {
        private int hours;
        private int minutes;

        public Time(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
        }
    }
}