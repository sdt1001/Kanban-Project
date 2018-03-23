import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.junit.Before;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ QuitCommand.class })

class QuitPMTest {

	public QuitPMTest() {}
	
	private QuitCommand instance;
	
	@Before
	public void setUp( ) {
		instance = QuitCommand.getInstance();
	}
	@Test
	public void trueTest() throws Exception {
		boolean result = Whitebox.invokeMethod(instance, "returnsTrue");
		assertTrue(result);
	}


	@Test
	public void falseTest() throws Exception {
		boolean result = Whitebox.invokeMethod(instance, "returnsFalse");
		assertFalse(result);
	}

}
