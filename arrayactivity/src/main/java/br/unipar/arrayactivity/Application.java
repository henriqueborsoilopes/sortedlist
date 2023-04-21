package br.unipar.arrayactivity;

import br.unipar.arrayactivity.ui.UI;
import br.unipar.arrayactivity.ui.exceptions.DataTypeException;
import br.unipar.arrayactivity.ui.exceptions.ValueChooseException;

public class Application {

    public static void main(String[] args) {
    	try {
    		do {
        		UI.askVectorSize();
    	    	UI.askVectorValues();
    	    	UI.showOriginalVector();
    	    	UI.executeAllSortMethods();
    	    	UI.askSortVectorOption();
    	    	UI.showExecutionTimeAllSort();
    	    	UI.showOriginalVector();
    		} while (UI.showContinuoQuestion());
    	} catch (DataTypeException e) {
    		System.out.print(e.getMessage());
    	} catch (ValueChooseException e) {
    		System.out.print(e.getMessage());
    	}
    }
}
