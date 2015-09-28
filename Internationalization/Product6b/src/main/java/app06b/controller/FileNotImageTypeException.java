package app06b.controller;

public class FileNotImageTypeException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The file is not an Image.";
	}

}
