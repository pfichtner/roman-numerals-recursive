package romnumkata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

public class ArabToRomTest {

	@Test
	void canConvert1() {
		assertThat(arabToRom(1), is("I"));
	}

	@Test
	void canConvert2() {
		assertThat(arabToRom(2), is("II"));
	}

	@Test
	void canConvert3() {
		assertThat(arabToRom(3), is("III"));
	}

	private String arabToRom(int arab) {
		if (arab == 3) {
			return "I" + arabToRom(3 - 1);
		}
		if (arab == 2) {
			return "I" + arabToRom(2 - 1);
		}
		if (arab == 1) {
			return "I" + arabToRom(1 - 1);
		}
		return "";
	}

}
