package example;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GeoUtilTest {

	@Test
	public void testDistance() throws Exception {
		GeoUtil geoUtil = new GeoUtil();
		assertThat(geoUtil.distance(1d, 2d, 3d, 4d), is(10d));

	}
}
