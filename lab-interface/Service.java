public class Service implements Store
{  
    private String format;
    private int duration;

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void sell() {
        System.out.println("Selling Service");
    }

    @Override
    public void warranty() {
        System.out.println("Warranty Service");
    }
    

    
    
}
