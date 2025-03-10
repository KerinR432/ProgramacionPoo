package POOAvanzadoUD7.Interfaces;

public class paloma extends Aves{
    private String color;
    public paloma(String especies, String vuela,String color) {
        super(especies, vuela);
        this.color=color;
    }
    //setters

    public void setColor(String color) {
        this.color = color;
    }
    //getters

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +"paloma{" +
                "color='" + color + '\'' +
                '}';
    }
}
