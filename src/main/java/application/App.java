package application;

import controllers.CrudEstudianteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Escuela;
import utils.Paths;

public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {


        FXMLLoader loader = new FXMLLoader( getClass().getResource(Paths.GESTIONAR_ESTUDIANTES_VIEW));

        AnchorPane pane = loader.load();

        CrudEstudianteController controller = loader.getController();
        controller.setEscuela(new Escuela("mi escuela"));
        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }




    //CRUD

    //CREATE, READ, UPDATE, DELETE
}
