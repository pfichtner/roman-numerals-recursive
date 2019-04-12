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

	@Test
	void canConvert5() {
		assertThat(arabToRom(5), is("V"));
	}

	@Test
	void canConvert6() {
		assertThat(arabToRom(6), is("VI"));
	}

	@Test
	void canConvert11() {
		assertThat(arabToRom(11), is("XI"));
	}

	private static enum Numeral {
		X(10);
		private int value;

		private Numeral(int value) {
			this.value = value;
		}
	}

	private String arabToRom(int arab) {
		Numeral n = Numeral.X;
		if (arab >= n.value) {
			return n.name() + arabToRom(arab - n.value);
		}
		if (arab >= 5) {
			return "V" + arabToRom(arab - 5);
		}
		if (arab >= 1) {
			return "I" + arabToRom(arab - 1);
		}
		return "";
	}

}
