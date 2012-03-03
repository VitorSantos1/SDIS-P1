package p1.controller;

import java.io.IOException;

import p1.model.Engine;
import p1.view.AppOutput;


public class FluxControl {
    
    private AppOutput appOutputObj = new AppOutput();
    private Engine appEngine = new Engine();
    private InputCapturer lineCapturer = new InputCapturer();
    
    public void startApp() throws IOException {
	appOutputObj.printStarterScreen();
	
	this.mainCycle();
    }
    
    public void mainCycle() throws IOException {
	String answerType = new String("");
	
	while(!answerType.equalsIgnoreCase("exit")){
	    answerType = lineCapturer.insertCommand();
	    
	    if(answerType.equalsIgnoreCase("get"))
		appEngine.processingGet(answerType);
	}
	
	System.exit(0);
    }

    public static void main(String[] args) throws IOException{
	new FluxControl().startApp();
    }
}
