package id.sch.bdg.smkn4.pwpb.cardviewandrecyclerview;

public class Mail {
    private String inisial, name, title, content, time;
    private int imgBackground;

    public Mail(String inisial, String name, String title, String content, String time, int imgBackground) {
        this.inisial = inisial;
        this.name = name;
        this.title = title;
        this.content = content;
        this.time = time;
        this.imgBackground = imgBackground;
    }

    public String getInisial() {
        return inisial;
    }

    public void setInisial(String inisial) {
        this.inisial = inisial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImgBackground() {
        return imgBackground;
    }

    public void setImgBackground(int imgBackground) {
        this.imgBackground = imgBackground;
    }
}
