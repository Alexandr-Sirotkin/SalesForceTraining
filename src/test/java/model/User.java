package model;

public class User {

  private String URL;
  private String LOGIN;
  private String PASSWORD;

  public User(String URL, String LOGIN, String PASSWORD) {
    this.URL = URL;
    this.LOGIN = LOGIN;
    this.PASSWORD = PASSWORD;
  }

  public User() {
  }

  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public String getLOGIN() {
    return LOGIN;
  }

  public void setLOGIN(String LOGIN) {
    this.LOGIN = LOGIN;
  }

  public String getPASSWORD() {
    return PASSWORD;
  }

  public void setPASSWORD(String PASSWORD) {
    this.PASSWORD = PASSWORD;
  }
}
