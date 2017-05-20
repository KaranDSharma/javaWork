package APClass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class CounterTest extends Application
{
	private Stage stage;
	Scene myScene;
	FlowPane rootNode;
	Button plus;
	Label tab1;
	Button minus;
	Label tab2;
	Button gone;
	Label prompt;
	TextField textField2;
	Label inc;
	int displayValue = 0;
	Label increment;
	Label decrement;
	Label clear;;
	Counter cnt = new Counter();
	
	@Override
	public void start(Stage myStage)
	{
		myStage.setTitle("Counter");
		rootNode = new FlowPane();
	    myScene = new Scene(rootNode, 300, 200);

		
		increment = new Label("Increment \t\t");
		decrement = new Label("decrement\t\t");
		clear = new Label("clear\n\n\n");
		
		plus = new Button("Increment");
		tab1 = new Label("\t");
		minus = new Button("Decrement");
		tab2 = new Label("\t");
		gone = new Button("Clear");
		prompt = new Label("Insert a number: ");
		textField2 = new TextField("0");
		
		rootNode.getChildren().add(prompt);
		rootNode.getChildren().addAll(textField2);
		rootNode.getChildren().addAll(increment, decrement, clear);
		rootNode.getChildren().addAll(plus, tab1, minus, tab2, gone);
		inc = new Label();
		
		inc.setText("0");
      	rootNode.getChildren().add(inc);
		myStage.setScene(myScene);
		myStage.show();
		cnt.setValue(Integer.parseInt(textField2.getText()));
		
		textField2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				cnt.setValue(Integer.parseInt(textField2.getText()));
            	inc.setText(Integer.toString(cnt.getValue()));	
			}
		});
		
        plus.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	cnt.increment();
            	inc.setText(Integer.toString(cnt.getValue()));
            }
       });
        
        minus.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	cnt.decrement();
            	inc.setText(Integer.toString(cnt.getValue()));
            }
       });
        
        gone.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	cnt.setValue(0);
            	inc.setText(Integer.toString(cnt.getValue()));
            }
       });
	}

	public static void main(String args [])
	{
		launch(args);
	}	
	
}
