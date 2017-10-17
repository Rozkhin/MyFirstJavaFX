package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

public class Controller {


    public Spinner<Integer> n1spiner;
    public Spinner<Integer> n2spiner;
    public Spinner<Integer> n3spiner;
    public Spinner<Integer> n4spiner;
    public TableView<Turn> ResultTable;
    int nr=0;
    public void DoGo(ActionEvent actionEvent) {
       nr++;
       Turn t=new Turn();
        t.setN1(n1spiner.getValue());
        t.setN2(n2spiner.getValue());
        t.setN3(n3spiner.getValue());
        t.setN4(n4spiner.getValue());
        t.setNr(nr);

        ResultTable.getItems().add(t);
    }
}
