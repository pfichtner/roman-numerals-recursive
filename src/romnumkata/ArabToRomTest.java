package romnumkata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.EnumSet;
import java.util.stream.Stream;

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

	@Test
	void canConvert4() {
		assertThat(arabToRom(4), is("IV"));
	}

	@Test
	void canConvert9() {
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
		Stream<String> map = EnumSet.allOf(Numeral.class).stream().filter(n->arab >= n.value).map(n->n.name() + arabToRom(arab - n.value));
		String result = map.findFirst().orElse("");
		for (Numeral n : Numeral.values()) {
			if (arab >= n.value) {
				return n.name() + arabToRom(arab - n.value);
			}
		}
		return "";
	}

}
