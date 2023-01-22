package View;

import Model.User;
import Controller.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class subgiaodien extends JFrame{

    //khai báo biến tao tự định nghĩa

    UserService userService;
    User user;
    DefaultTableModel defaultTableModel;

    // thiết lập dữ liệu setDada ở biến khai báo toàn bộ, có thể tái sử dụng tiết kiệm công sức viết code
    //setData này để chứa hàm load dữ liệu từ bảng bên Mysql qua table trên giao diện gui Swing
    private void setData(List<User> users){
        for(User user: users){
            defaultTableModel.addRow(new Object[]{user.getId(), user.getName(), user.getPhone(), user.getUsername(), user.getPassword(),user.getAbout(),
                    user.getRole(), user.getFavourites()});
        }
    }




    // của phần draw tự định nghĩa
    private JTable UserTabe;
    private JPanel panel_submain;
    private JButton button_refesh;
    private JLabel label_ID;
    private JTextField field_ID;
    private JTextField field_ten;
    private JLabel label_Ten;
    private JTextField field_Phone;
    private JLabel label_Phone;
    private JTextField field_UserName;
    private JLabel label_UserName;
    private JTextField field_Matkhau;
    private JLabel label_Password;
    private JLabel label_About;
    private JLabel label_Role;
    private JLabel label_Favourites;
    private JCheckBox musicCheckBox;
    private JCheckBox movieCheckBox;
    private JTextArea area_Gioithieu;
    private JRadioButton adminRadioButton;
    private JRadioButton userRadioButton;
    private JButton button_Back;
    private JButton button_Add;
    private JButton button_Delete;
    private JButton button_Update;


    /*start contructor*/
    public subgiaodien() {
        userService = new UserService();
        user = new User();
        this.init();
        this.setVisible(true);

        // thiết lập chạy JFRAME trên GUI form của java Swing
        this.setContentPane(panel_submain);
        this.pack();


        // setdata


        // chức năng refesh lại dữ liệu truyền vào
        button_refesh.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    defaultTableModel.setRowCount(0);
                    List<User> users = UserService.getAllUsers();

                    /*load dữ liệu theo cách cũ*/
    //                for(User user: users){
    //                    defaultTableModel.addRow(new Object[]{user.getId(), user.getName(), user.getPhone(), user.getUsername(), user.getPassword(),user.getAbout(),
    //                            user.getRole(), user.getFavourites()});
    //                }

                    /*load theo cách mới*/
                    setData(userService.getAllUsers());
                }
            });



        // chức năng back quay lại giao diện chính
            button_Back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // gọi lại giao diện chính của mình
                    new giaodienhienthi().setVisible(true);
                    // thực hiện ẩn giao diện này đi để hiện lại giao diện chính
                    dispose();

                }
            });




        /* chức năng Insert sữ liệu(thêm dòng dữ liệu) người dùng - nhận lệnh insert của sql trong controller/UserDAO(phần xây dưnựng tg tác JDBC và câu lệnh sql tương tác statement)
        * ở chức nang này sẽ nhận dữ liệu từ người dùng nhập vào và tiến hành add vào sql bên mysql và hiên thị ln table trên giao diện
        * */

            button_Add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    user.setId(Integer.parseInt(field_ID.getText()));
                    user.setName(field_ten.getText());
                    user.setPhone(field_Phone.getText());
                    user.setUsername(field_UserName.getText());
                    user.setPassword(field_Matkhau.getText());
                    user.setAbout(area_Gioithieu.getText());

                    //code cho mục chọn click radio và checkbox
                    String role = "";
                    if(adminRadioButton.isSelected()){
                        role += "Admin";
                    }else if(userRadioButton.isSelected()){
                        role += "User";
                    }
                    user.setRole(role);

                    String sothich = "";
                    if(musicCheckBox.isSelected()){
                        sothich += "Music";
                    }else if(movieCheckBox.isSelected()){
                        sothich += "Movie";
                    }
                    user.setFavourites(sothich);

                    userService.addUser(user);
                }
            });



          // thực hiện chức năng delete dữ liệu khi muốn xóa dòng nào đó
            button_Delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int row = UserTabe.getSelectedRow();
                    // nếu người dùng chưa chọn dòng nào thì báo lỗi (-1 là chưa c dòng nào đc chọn)
                    if(row ==-1){
                        // show thông báo lỗi chưa chọn, cần tiềm hiểu JOption.ERROR_Mesage??????
                        JOptionPane.showMessageDialog(subgiaodien.this, "Vui lòng chọn User trước","Lỗi",JOptionPane.ERROR_MESSAGE);
                    }else{
                        // ngc lại thì show nhắc nhở trc khi xóa cho người dùng thêm quyền trc khi xóa
                        int confirm = JOptionPane.showConfirmDialog(subgiaodien.this, "Bạn có cắc muốn xóa không?");
                        // nếu người dùng bấm vào yes thì
                        if(confirm == JOptionPane.YES_NO_OPTION){
                                int UserId = Integer.valueOf(String.valueOf(UserTabe.getValueAt(row,0)));
                                userService.DeleteUser(UserId);

                                //refesh dữ liệu sau khi xóa để nó lk với ethod refesh đã khai báo trc đó
                                defaultTableModel.setRowCount(0);
                               setData(userService.getAllUsers());

                        }
                    }
                }
            });



       // Thực hiện chức năng Update dữ liệu
        button_Update.addActionListener(new ActionListener() {
            @Override"ban cos chac an muons xoa khong?
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
/*end contrcutor*/




    // method hiển thi init(): thiết lập bổ trợ cho giao diện jkéo thả đã định trước
    public void init(){
        this.setTitle("table them moi quan ly thu vien");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // thiết lập table tren JFrame
        defaultTableModel = new DefaultTableModel()
        {
            // tiến hành thiết lập không cho người dùng sữa dữ liệu trên table thông qua nhấp chuột vào sữa
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        UserTabe.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("Name");
        defaultTableModel.addColumn("Phone");
        defaultTableModel.addColumn("UserName");
        defaultTableModel.addColumn("Password");
        defaultTableModel.addColumn("About");
        defaultTableModel.addColumn("Role");
        defaultTableModel.addColumn("Favorites");


        // them hien thi thong tin bang user sql len table
        /*cách cũ*/
//        List<User> users = UserService.getAllUsers();
//        for(User user: users){
//            defaultTableModel.addRow(new Object[]{user.getId(), user.getName(), user.getPhone(), user.getUsername(), user.getPassword(),user.getAbout(),
//                    user.getRole(), user.getFavourites()});
//        }


        /*cách mới khai báo biến toàn cục trc contrucor, khi cần thì gọi ra thui*/
            setData(userService.getAllUsers());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


//end class subgiaodien
}
