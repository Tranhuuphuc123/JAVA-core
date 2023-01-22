package Controller;

import Model.User;

import java.util.List;

// no chua nhung xu ly du lieu
/*
*  diem khac nhau giua DAO va Serviec:
*  DAO: lam viec truc tiep voi co so du lieu thong qua jdbc va cac cau lenh truy van
*  Service: thong qua DAO de lay du lieu tu DAO data acess object len(là dữ liệu thông qua người dùng nhập và đc add, delte, update vào mysql thông qua câu lệnh sql)
* đã được thêm vào bên phần View -> dùng câu lệnh sql bên UserDAO  -> add vào serviece -> ánh xạ lên mysql -> đẩy ngc hiển thị trn giao diện.s
* */
public class UserService {

    private static UserDAO userdao;

    // contructor
    public UserService(){

        userdao = new UserDAO();

    }


    // method truy vấn dữ liệu .. lấy đc thông tin của dữ liệu (select * from tabel ấy... từ method getAllusers bên DAO)
    public static List<User> getAllUsers(){
        return userdao.getAllUsers();
    }


    // method thêm moi(dùng câu lệnh insert into table ..), khi nhập dl từ giao diện addmethod này sẽ ánh xạ lên mysql.
    public void addUser(User user){
        userdao.addUser(user);
    }

    // add method DeleteUser bên DAO qua nhận dữ liệu bền service
    public void  DeleteUser(int id){
        userdao.DeleteUser(id);
    }

}
