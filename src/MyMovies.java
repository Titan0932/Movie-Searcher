import javafx.application.Application;
import javafx.stage.Stage;




public class MyMovies extends Application {
    // Called automatically to start the application (you must write this)
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Pane(), 300, 100); // Set window size
        primaryStage.setTitle("My Window"); // Set window title
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    To initialize variables
    public static void init(){}


    public static void main(String args[]){
        launch(args); // Initialize/start
    }

}
