package signin

import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.TextField
import signin.util.Data


class Controller implements Initializable{

    Data sql = new Data()

    public TextField user
    public TextField password
    public Button letsGo


    @Override
    void initialize(URL url, ResourceBundle resourceBundle) {
        letsGo.setDefaultButton(true)
    }

    void checkUserPass() {
        def name = user.getText()
        def pass = password.getText()

        if(sql.checkUserPass(name, pass)){
            println('Congratulations it worked!')
        }

        //clean up
        user.setText("")
        password.setText("")
    }
}
