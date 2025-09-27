package Entities;

public class Video extends Lesson{
    private String url;
    private int seconds;

    public Video(){
        super();
    }

    public Video(String title, String url, int seconds){
        super(title);
        this.url=url;
        this.seconds=seconds;
    }

    public void setUrl(String url){
        this.url=url;
    }

    public String getUrl(){
        return this.url;
    }

    public void setSeconds(int seconds){
        this.seconds=seconds;
    }
    public int getSeconds(){
        return this.seconds;
    }

    @Override
    public int duration() {
        return seconds;
    }
}
