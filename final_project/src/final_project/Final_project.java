package final_project;
public class Final_project {
    public static void main(String[] args) {
        //Declaración del formulario donde se encuentra el JFrame
        login frm_login = new login();
        frm_login.setVisible(true);
        //sql = sentencia para realizar la consulta
        String sql;
        frm_login.setResizable(false);
        
        frm_login.txt_username.setText(null);
        frm_login.txt_passwd.setText(null);
    }    
}
