package filtradoPalabras;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.*;




public class InterfazFiltrado extends BorderPane {

    private ListView<String> listaPlabras;
    // atributos de la parte inferior.
    private HBox panelInferior;
    private Label etNumLetra, etLetraInicial;
    private TextField numLetras;
    private Button btnBuscar;
    private ComboBox<String> letraInicial;

    public InterfazFiltrado(){
        listaPlabras = new ListView<String>();
        panelInferior = new HBox(5);
        etNumLetra = new Label("Letra inicial:");
        numLetras = new TextField();
        btnBuscar = new Button("Buscar");
        letraInicial = new ComboBox();
        mostrarEscena();
    }

    private void mostrarEscena() {

        panelInferior.getChildren().addAll(etNumLetra, numLetras,btnBuscar, etLetraInicial);
        this.setCenter(listaPlabras);
        this.setBottom(panelInferior);

    }


}
