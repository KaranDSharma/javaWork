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
/*
 * Precondition: Handles only positive integers
 * 
 * Postcondition: Creates MemoryCounter instance
 */
public class MemoryCounterTest extends Application
{
	private Stage stage;
	Scene myScene;
	FlowPane rootNode;
	Button plus;
	Label tab1;
	Label tab3;
	Label tab4;
	Label tab5;
	Button minus;
	Button addmem;
	Button resetmem;
	Label tab2;
	Button gone;
	Label prompt;
	TextField textField2;
	Label inc;
	Label inc2;
	int displayValue = 0;
	Label increment;
	Label decrement;
	Label clear;
	Label admem;
	Label clrmem;
	
	//Counter cnt = new Counter();
	MemoryCounter memCnt = new MemoryCounter();
	
	@Override
	public void start(Stage myStage)
	{
		myStage.setTitle("Counter");
		rootNode = new FlowPane();
	    myScene = new Scene(rootNode, 300, 200);

		
		increment = new Label("Increment \t\t");
		decrement = new Label("decrement\t\t");
		clear = new Label("clear\t\t");
		admem = new Label("Add Memory\t\t");
		clrmem = new Label("Clear Memory\n\n\n");
		
		plus = new Button("Increment");
		tab1 = new Label("\t");
		minus = new Button("Decrement");
		tab2 = new Label("\t");
		gone = new Button("Clear");
		tab3 = new Label("\t");
		addmem = new Button("Add Memory");
		tab4 = new Label("\t");
		resetmem = new Button("Reset Memory");
		prompt = new Label("Insert a number: ");
		textField2 = new TextField("0");
		
		rootNode.getChildren().add(prompt);
		rootNode.getChildren().addAll(textField2);
		rootNode.getChildren().addAll(increment, decrement, clear);
		rootNode.getChildren().addAll(plus, tab1, minus, tab2, gone);
		rootNode.getChildren().addAll(admem, clrmem);
		rootNode.getChildren().addAll(addmem, resetmem);

		inc = new Label();
		inc2 = new Label();
		inc.setText("0");
		inc2.setText("0");
      	rootNode.getChildren().add(inc);
    	rootNode.getChildren().add(inc2);
		myStage.setScene(myScene);
		myStage.show();
		memCnt.setValue(Integer.parseInt(textField2.getText()));
		
		textField2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				memCnt.setValue(Integer.parseInt(textField2.getText()));
            	inc.setText(Integer.toString(memCnt.getValue()));	
			}
		});
		
        plus.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	memCnt.increment();
            	inc.setText(Integer.toString(memCnt.getValue()));
            }
       });
        
        minus.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	memCnt.decrement();
            	inc.setText(Integer.toString(memCnt.getValue()));
            }
       });
        
        gone.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	memCnt.setValue(0);
            	inc.setText(Integer.toString(memCnt.getValue()));
            }
       });
        
        addmem.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	memCnt.incrementMem();
            	inc2.setText(Integer.toString(memCnt.getMem()));
            }
       });
        
        resetmem.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent t){
            	memCnt.clearMem();
            	inc2.setText(Integer.toString(memCnt.getMem()));
            }
       });
	}

	public static void main(String args [])
	{
		launch(args);
	}	
	
}
