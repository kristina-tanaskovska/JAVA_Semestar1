import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Buttons {
    static List<Object> games =new ArrayList<>();

    generalButton_METHODS methods = new generalButton_METHODS();
    int n = Window.n;
    JPanel panel = new JPanel(new GridLayout(n, n));
    List<Button> buttonList = new ArrayList<Button>(n*n);

    public JPanel BUTTONS(int values[], boolean istrue){
        Menu.array = values;
        for (int i = 0; i<n*n; i++){
            Button button = new Button(i, n, values[i], istrue);
            buttonList.add(button);
            panel.add(button.button);
        }
        return panel;
    }


}

