package basic;

import org.testng.annotations.Test;

/* FlightBookingTest
 * 1.Signup
 * Login
 * SearchForThe flight
 * SAvethe ticket
 * Lougout
 */

public class FlightBookingTest
{
	@Test (priority=1)
	public void Login()
	{
		System.out.print("Login");	
	}
	@Test (priority=2)
	public void SearchForTheFlight()
	{
		System.out.print("Search for the flight");	
	}
	@Test (priority=3)
	public void BooktheFlight()
	{
		System.out.print("Book the flight");	
	}
	@Test (priority=4)
	public void SavetheTicket()
	{
		System.out.print("SAve the Ticket");	
	}
	@Test (priority=5)
	public void Logout()
	{
		System.out.print("Logout");	
	}
}
