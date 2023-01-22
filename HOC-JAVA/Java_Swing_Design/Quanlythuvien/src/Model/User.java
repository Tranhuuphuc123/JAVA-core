package Model;
// model đóng vai trò thiết lập cơ sở get and set để nhận và thiết đăt set(nhập) dữ liệu truyền vào từ người dùng nhập..
public class User {
    private int id;
    private String name;

    private String Phone;
    private String username;
    private String password;
    private String role;
    private String favourites;
    private String about;



    // contructor
    public User() {

    }

    // get and set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFavourites() {
        return favourites;
    }

    public void setFavourites(String favourites) {
        this.favourites = favourites;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
