import static org.junit.Assert.*;
import org.junit.*;


public class DocSearchTest{

	@Test
	public void testHandleRequest() {
		URI input1 = new URI("https://ucsd-cse15l-f22.github.io/week/week3/");
		DocSearchServer.handleRequest(input1);
		assertArrayEquals();
	}

}
