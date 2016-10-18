class Chick implements Animal 
{
    private String myType;
    private String mySound;
    public Chick(String type, String sound, String soundtwo)
    {
        myType = type;
        if (Math.random() < 0.5)
        	mySound = sound;
        else
        	mySound = soundtwo;
	}
	public String getSound(){return mySound;}
	public String getType(){return myType;}
}
