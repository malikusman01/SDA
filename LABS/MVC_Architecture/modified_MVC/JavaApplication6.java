
package main;

import controller.Controller;
import model.Model;
import view.View;


public class JavaApplication6 {


    public static void main(String[] args) {
    
            Model model = new Model();
            View view = new View();
            Controller c = new Controller(model , view);
        
                c.setData(":    Hello,  MVC :");
        c.updateView();
    
    
    
    }
}
