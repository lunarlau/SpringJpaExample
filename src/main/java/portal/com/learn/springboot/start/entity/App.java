package portal.com.learn.springboot.start.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class App implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String appkey;
    private String name;

    protected App(){}

    public App(String appkey,String name){
       this.appkey = appkey;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("%s:%s",appkey,name);
    }
}
