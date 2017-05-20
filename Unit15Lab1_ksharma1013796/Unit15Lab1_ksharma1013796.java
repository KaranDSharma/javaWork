package APClass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Unit15Lab1_ksharma1013796 extends Application
{
	Label firstVal;
	Label secVal;
	Label sum;
	TextField t1;
	TextField t2;
	TextField t3;
	Label newLine;
	Label newLine2;
	Label newLine3;
	Button calculate;
	int val1, val2, val3;
	
	public void start (Stage myStage)
	{
		myStage.setTitle("Simple Calculator");
		FlowPane rootNode = new FlowPane(10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 300, 200);
		
		firstVal = new Label("First Value\t\t");
		secVal = new Label("Second Value\t\t");
		sum = new Label("Sum\t\t\t\t");
		newLine = new Label("\n");
		newLine2 = new Label("\n");
		newLine3 = new Label("\n");

		t1 = new TextField("");
		t2 = new TextField("");
		t3 = new TextField("");
		
		t1.setOnAction(new firstValue());
		t2.setOnAction(new secondValue());	
		t3.setEditable(false);
		
		calculate = new Button("Calculate");
		
		calculate.setOnAction(new Sum());
		
		rootNode.getChildren().addAll(firstVal, t1, newLine);
		rootNode.getChildren().addAll(secVal, t2, newLine2);
		rootNode.getChildren().addAll(sum, t3, newLine3);
		rootNode.getChildren().addAll(calculate);
		
		myStage.setScene(myScene);
		myStage.show();
		
		
	}
	
	class firstValue implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			val1 = Integer.parseInt(t1.getText());
			t2.requestFocus();
		}
	}
	
	class secondValue implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			val2 = Integer.parseInt(t2.getText());
			calculate.requestFocus();
		}
	}
	
	class Sum implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			val3 = val1 + val2;
			t3.setText(Integer.toString(val3));
		}
	}
	
	public static void main(String args [])
	{
		launch(args);
	}	
}
