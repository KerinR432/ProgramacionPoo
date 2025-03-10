package POOAvanzadoUD7.Interfaces;

public class Reliquia {
    private int year;

    public Reliquia(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+ "Reliquia{" +
                "year=" + year +
                '}';
    }
}
