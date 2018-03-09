package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


/**
 * UI controller for events and initializing components.
 */
public class ConverterController {
    @FXML
    TextField textfield1;
    @FXML
    TextField textfield2;
    @FXML
    ComboBox<Length> comboBox1;
    @FXML
    ComboBox<Length> comboBox2;

    private static final double MILETOKM = 1.60934;

    private static final double KMTOMILE = 0.621371;

    /**
     * Convert a distance from one unit to another.
     * @param event
     */
    public void handleConvert(ActionEvent event){
        // read values from textfield(s)
        String text1 = textfield1.getText().trim();
        String text2 = textfield2.getText().trim();

        // read unit from comboBox(s)
        Length unit1 = comboBox1.getValue();
        Length unit2 = comboBox2.getValue();


        if(text1.isEmpty()){
            try{
                double t2 = Double.parseDouble(text2);
                double actualV1 = t2 * unit2.getValue();
                double toValue1 = actualV1/unit1.getValue();
                textfield1.setText(String.valueOf(toValue1));
            }catch(IllegalArgumentException ex){
                System.out.println("Invalid number format");
            }
        }
        else if(text2.isEmpty()){
            try{
                double t1 = Double.parseDouble(text1);
                double actualV2 = t1 * unit1.getValue();
                double toValue2 = actualV2/unit2.getValue();
                textfield2.setText(String.valueOf(toValue2));
            }catch(IllegalArgumentException ex){
                System.out.println("Invalid number format");
            }
        }


    }

    /**
     * Method for clearing the textfield
     * @param event
     */
    public void handleClear(ActionEvent event){
        // re-assinging the textfield to be empty
        textfield1.setText("");
        textfield2.setText("");
    }

    @FXML
    public void initialize(){
        System.out.println("Running initialize");
        if(comboBox1 != null){
            comboBox1.getItems().addAll(Length.values());
            comboBox1.getSelectionModel().select(0); // select an item to show
        }
        if(comboBox2 != null){
            comboBox2.getItems().addAll(Length.values());
            comboBox2.getSelectionModel().select(1); // select an item to show
        }
    }

}
