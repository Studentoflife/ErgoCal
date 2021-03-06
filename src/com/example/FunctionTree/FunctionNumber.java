package com.example.FunctionTree;
import com.example.FunctionPresentation.TextRepInterface;

public final class FunctionNumber extends FunctionObjectBase{
	// Internal value holder
	private double value;
	private TextRepInterface display;
	
	// Constructor
	public FunctionNumber(TextRepInterface d, double v)
	{
		super(FunctionID.NUMBER, d);
		value = v;
	}
	
	public void resetArg(FunctionObjectBase old, FunctionObjectBase a)
	{
		throw new RuntimeException("No Arguments to Replace");
	}
	
	// FunctionObjectBase Methods
	public double calculate() throws CalculationException 
	{
		return value;
	}
	
	public void close()
	{
		super.close();
	}
	
	public int numberOfArguments()
	{
		return 0;
	}
	
	public String getTextRep()
	{
		return display.getTextRep(String.valueOf(value));
	}
	
	public void setHighlight() {
		display.setHighlight();
	}
	public void setSubHighlight() {
		display.setSubHighlight();
	}
	public void setNoHighlight() {
		display.setNoHighlight();
	}
	
	// Other Methods
	public void set(double v)
	{
		value = v;
	}
}
