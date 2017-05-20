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
public class LoanCalculator extends Application
{
	private Stage stage;
	Scene myScene;
	FlowPane rootNode;
	Label tab1;
	Label tab3;
	Label tab4;
	Label tab5;
	Label tab2;
	Label prompt;
	TextField textField;
	TextField textField2;
	TextField textField3;
	TextField textField4;
	TextField textField5;
	Label inc;
	Label inc2;
	int displayValue = 0;
	Label increment;
	Label decrement;
	Label clear;
	Label admem;
	Label clrmem;
	Button calculate;
	
	//Counter cnt = new Counter();
	MemoryCounter memCnt = new MemoryCounter();
	
	@Override
	public void start(Stage myStage)
	{
		myStage.setTitle("Loan Calculator");
		rootNode = new FlowPane();
	    myScene = new Scene(rootNode, 300, 200);

		
		increment = new Label("Annual Interest Rate \t\t");
		decrement = new Label("Number of Years \t\t");
		clear = new Label("Loan Amount \t\t");
		admem = new Label("Monthly Payment \t\t");
		clrmem = new Label("Total Payment \t\t");
		tab1 = new Label("\n");
		tab2 = new Label("\n");
		tab3 = new Label("\n");
		tab4 = new Label("\n");
		tab5 = new Label("\n");
		calculate = new Button("Calculate");


		
		textField = new TextField("0");
		textField2 = new TextField("0");
		textField3 = new TextField("0");
		textField4 = new TextField("0");
		textField5 = new TextField("0");

		rootNode.getChildren().addAll(increment, textField, tab1);
		rootNode.getChildren().addAll(decrement, textField2, tab2);
		rootNode.getChildren().addAll(clear, textField3, tab3);
		rootNode.getChildren().addAll(admem, textField4, tab4);
		rootNode.getChildren().addAll(clrmem, textField5, tab5);
		rootNode.getChildren().add(calculate);
		


		

	
		myStage.setScene(myScene);
		myStage.show();
		memCnt.setValue(Integer.parseInt(textField2.getText()));
		
	
	}

	public static void main(String args [])
	{
		launch(args);
	}	
	
}
