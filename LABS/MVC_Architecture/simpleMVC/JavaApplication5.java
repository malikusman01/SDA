package javaapplication5;

class Model {
   
    private String data;
    
    public String getData(){
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }}


class View {
    public void printData(String data) {
          System.out.println("data" + data);      
        

    }}

class Controller {
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
    }}

public class JavaApplication5 {

    public static void main(String[] args) {
    
            Model model = new Model();
            View view = new View();
            Controller c = new Controller(model , view);
        
                c.setData(":    Hello, SIMPLE MVC :");
        c.updateView();
    }}

