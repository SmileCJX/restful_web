package pers.caijx.restful.domain;

/**
 * Created by caijx on 2018/7/1/001.
 */
public class Greeting {

    private final long id;

    private final String  content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
