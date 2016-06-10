package servlet;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String name;
    
    @Persistent
    private String userId;
    
    @Persistent
    private String pass;

    @Persistent
    private String mail;
    
    @Persistent
    private String tell;
    
    @Persistent
    private String address;

    public LinkData(String name, String userId,String pass,String mail,String tell,String address) {
        super();
        this.name = name;
        this.userId = userId;
        this.userId = pass;
        this.userId = mail;
        this.userId = tell;
        this.userId = address;
    }
 
    public Long getMyform() {
        return id;
    }
 
    /*public void setMyform(String myform) {
        this.myform = myform;
    }*/
 
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
 
    public String getuserId() {
        return userId;
    }
 
    public void setuserId(String userId) {
        this.userId = userId;
    }
    
    public String getpass() {
        return pass;
    }
 
    public void setpass(String pass) {
        this.pass = pass;
    }
    
    public String getumail() {
        return mail;
    }
 
    public void setmail(String mail) {
        this.mail = mail;
    }
    
    public String gettell() {
        return tell;
    }
 
    public void settell(String tell) {
        this.tell = tell;
    }
    
    public String getaddress() {
        return address;
    }
 
    public void address(String address) {
        this.address = address;
    }
    
}
