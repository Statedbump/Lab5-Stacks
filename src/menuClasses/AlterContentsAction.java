package menuClasses;

import dataManager.DMComponent;

public class AlterContentsAction implements Action {
	public void execute(Object args) { 
		DMComponent dm = (DMComponent) args; 
		dm.getMenuStack().push(AlterListContentMenu.getMainMenu());
	}
}
