package romnumkata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class ArabToRomTest {

	@Test
	void canConvert1() {
		assertThat(arabToRom(1), is("I"));
	}

	private Object arabToRom(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
