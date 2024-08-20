package filtradoPalabras;
import  javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage escenario) throws Exception{
        InterfazFiltrado raiz = new InterfazFiltrado();
        Scene escena = new Scene(raiz,500,800);
        escenario.setScene(escena);
        escenario.setTitle("Filtrador de palabras");
        escenario.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
