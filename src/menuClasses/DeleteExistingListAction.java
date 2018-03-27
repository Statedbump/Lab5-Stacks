package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteExistingListAction implements Action{
	public void execute(Object args) {
		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nAdding a new list of Integer values to the system:\n"); 
		dm.showListsNames();
		String listName = io.getInput("\nEnter name of the list to delete: "); 
		dm.removeList(listName);; 
	}
}
