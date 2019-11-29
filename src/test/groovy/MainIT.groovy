import static org.junit.jupiter.api.Assertions.assertTrue

import org.junit.jupiter.api.Test

import io.spotnext.groovynative.Main

public class MainIT {

	@Test
	void test() {
		Main.main(null)
		assertTrue(true)
	}
}
