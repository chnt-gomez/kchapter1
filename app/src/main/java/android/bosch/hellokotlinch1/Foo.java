package android.bosch.hellokotlinch1;

/**
 * Created by MAV1GA on 02/11/2017.
 */

// TODO: 02/11/2017 (1): Convert this Java class into a new Kotlin class named Artist

public class Foo {

    private long id;
    private String name;
    private String url;
    private int mbid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMbid() {
        return mbid;
    }

    public void setMbid(int mbid) {
        this.mbid = mbid;
    }

    @Override
    public String toString() {
        // TODO: 02/11/2017 (2): Add a toSting() method
        return super.toString();
    }
}
