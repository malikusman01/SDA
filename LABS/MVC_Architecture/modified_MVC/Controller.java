
package controller;

import model.Model;
import view.View;

public class Controller {
    private final Model model;
    private final View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        
    }
public void setData(String data) {
        model.setData(data);
    }
    public String getData(){
        return model.getData();
    }
    public void updateView() {
        view.printData(model.getData());
    }
}
