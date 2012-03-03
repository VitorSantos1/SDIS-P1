package p1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCapturer{
    
    public String insertCommand() throws IOException{
	InputStreamReader readingLine = new InputStreamReader(System.in);
	BufferedReader readLine = new BufferedReader(readingLine);
	String shellLine = readLine.readLine();
	
	//functions to check the line inserted
	if(shellLine.split(" ")[0].equals("get")){
	    return this.getCmd(shellLine);
	}
	else if(shellLine.split(" ")[0].equals("search")){
	    return this.searchCmd(shellLine);
	}
	else if(shellLine.split(" ")[0].equals("exit")){
	    return "exit";
	}
	else
	    return "repeat cycle";
    }

    private String searchCmd(String shellLine) {
	//Here, a verification of all the sentence must be made...
	return "search";
    }

    private String getCmd(String shellLine) {
	//Here, a verification of all the sentence must be made...
	return "get";
    }
}
