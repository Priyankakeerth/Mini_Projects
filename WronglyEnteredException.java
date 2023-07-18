package projects.org;

public class WronglyEnteredException extends Exception {
	int read;
	WronglyEnteredException(int reading)
	{
		read=reading;
		
	}
}
