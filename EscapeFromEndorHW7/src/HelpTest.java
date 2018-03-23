import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author sthib
 *
 */
class HelpTest {

	/**
	 * Test method for {@link HelpCommand#getCommandText()}.
	 */
	@Test
	void testGetCommandText() {
		String commandtext = HelpCommand.getInstance().getCommandText();
		assertEquals("help", commandtext);
	}

	/**
	 * Test method for {@link HelpCommand#doCommand()}.
	 */
	@Test
	void testDoCommand() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link HelpCommand#matchCommand(java.lang.String)}.
	 */
	@Test
	void testMatchCommand() {
		assertTrue(HelpCommand.getInstance().matchCommand("help"));
		assertFalse(HelpCommand.getInstance().matchCommand("anything else"));
	}

}
