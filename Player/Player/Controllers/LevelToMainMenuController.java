package Player.Controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Player.Boundaries.LevelView;
import Player.Boundaries.MainMenuView;
import Player.Entities.Level;

public class LevelToMainMenuController implements ActionListener{
	
	LevelView from;
	MainMenuView to;
	
	public LevelToMainMenuController(LevelView f, MainMenuView t){
		from = f;
		to = t;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		from.setVisible(false);
		
		Level theLevel = from.getLevel();
		int levelNum = theLevel.getLevelNum();
		boolean returnVal = theLevel.saveHighScore();
		if (returnVal == true) {
			to.updateHighScore(levelNum);
			to.unlockLevel(levelNum+1);
		}
		theLevel.setScore(0);
		
		
		theLevel.getLogic().stopTimer();
		
		to.setVisible(true);
		theLevel.reconstruct();
		
		to.reinitLevel(levelNum);
		from.clearLevel();
		
	}

}
