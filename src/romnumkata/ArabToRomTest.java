package romnumkata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.EnumSet;

import org.junit.jupiter.api.Test;

public class ArabToRomTest {

	@Test
	void symbols() {
		assertThat(arabToRom(1), is("I"));
		assertThat(arabToRom(5), is("V"));
	}

	@Test
	void additions() {
		assertThat(arabToRom(2), is("II"));
		assertThat(arabToRom(3), is("III"));
		assertThat(arabToRom(6), is("VI"));
		assertThat(arabToRom(11), is("XI"));
	}

	@Test
	void substractions() {
		assertThat(arabToRom(4), is("IV"));
		assertThat(arabToRom(9), is("IX"));
	}

	private static enum Numeral {
		X(10), IX(9), V(5), IV(4), I(1);
		private int value;

		private Numeral(int value) {
			this.value = value;
		}
	}

	private String arabToRom(int arab) {
		return EnumSet.allOf(Numeral.class).stream().filter(n -> arab >= n.value)
				.map(n -> n.name() + arabToRom(arab - n.value)).findFirst().orElse("");
	}

}
