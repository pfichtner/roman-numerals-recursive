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
			return "III";
		}
		if (arab == 2) {
			return "II";
		}
		return "I";
	}

}
