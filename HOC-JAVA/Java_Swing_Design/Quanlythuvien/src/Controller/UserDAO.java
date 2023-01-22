prpackage Controller;
// DAO(data acess Object ) là ơi định phương thức kết nối với sql từ ngôn ngữ java
// đúng hơn nó là nơi tương tác câu lệnh mysql truy cập thông qua ngôn ngữ java của pương thức jdbc


import DAO.JDBCutil;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {



    // method reset phương thức Resuilset(lấy kết quả từ bảng dữ liệu sql) thoogn qua method jdbc
            public List<User> getAllUsers(){
                List<User> users = new ArrayList<User>();
                Connection connection = JDBCutil.ketnoiJDBC();

                String sql = "select * from user";
                try {
                    PreparedStatement preparedStatement= connection.prepareStatement(sql);
                    ResultSet rs = preparedStatement.executeQuery();

                    while (rs.next()){
                        User user = new User();
                        user.setId(rs.getInt("ID"));
                        user.setName((rs.getString("Name")));
                        user.setPhone(rs.getString("Phone"));
                        user.setUsername(rs.getString("UserName"));
                        user.setPassword(rs.getString("Password"));
                        user.setAbout(rs.getString("About"));
                        user.setRole(rs.getString("Role"));
                        user.setFavourites(rs.getString("Favourites"));



                            users.add(user);
                        }
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                return users;
            }



        // method adduser them moi
        public void addUser(User user){
            Connection connection = JDBCutil.ketnoiJDBC();
            String sql = "insert into user(ID, Name, Phone, UserName, Password, About, Role, Favourites)" +
                    "values(?,?,?,?,?,?,?,?)";

            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, user.getId());
                preparedStatement.setString(2,user.getName());
                preparedStatement.setString(3,user.getPhone());
                preparedStatement.setString(4,user.getUsername());
                preparedStatement.setString(5,user.getPassword());
                preparedStatement.setString(6,user.getAbout());
                preparedStatement.setString(7,user.getRole());
                preparedStatement.setString(8,user.getFavourites());


                int rs = preparedStatement.executeUpdate();

                System.out.println(rs);

            }catch (SQLException e){
                e.printStackTrace();
            }
        }



        // method Update User cap nhat
         public void UpdateUser(User user){
                Connection connection = JDBCutil.ketnoiJDBC();
                String sql = "update user set ID =?, Name = ?, Phone =?, UserName = ?, Password =?" +
                        "About =?, Role =?, Favourites =? where ID =?";
                try {
                    PreparedStatement preparedStatement=connection.prepareStatement(sql);
                    preparedStatement.setInt(1, user.getId());
                    preparedStatement.setString(2, user.getName());
                    preparedStatement.setString(3, user.getPhone());
                    preparedStatement.setString(4, user.getUsername());
                    preparedStatement.setString(5, user.getPassword());
                    preparedStatement.setString(6, user.getAbout());
                    preparedStatement.setString(7, user.getFavourites());

                    int rs = preparedStatement.executeUpdate();
                    System.out.println(rs);
                }catch (SQLException e){
                    e.printStackTrace();
                }
         }



       //method delete
          public void DeleteUser(int id){
                Connection connection = JDBCutil.ketnoiJDBC();
                String sql ="DELETE from user where ID = ? ";
                try {
                    PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
                    preparedStatement.setInt(1,id);
                    int rs = preparedStatement.executeUpdate();
                    System.out.println(rs);
                }catch (SQLException e){
                    e.printStackTrace();
                }

          }

       //method find
          public void FindUser(){

          }



}
