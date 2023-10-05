import javax.swing.JFrame;
public class GameSettings extends JFrame{
    GameSettings(){
        this.add(new GameInterface());
        this.Title("SnakeGame");
        this.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }     
}