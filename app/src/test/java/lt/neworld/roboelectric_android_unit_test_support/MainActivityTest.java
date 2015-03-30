package lt.neworld.roboelectric_android_unit_test_support;

import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.fest.assertions.api.ANDROID.assertThat;

@RunWith(MyTestRunner.class)
public class MainActivityTest {
    @Test
    public void testInit() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        TextView text = (TextView) activity.findViewById(R.id.text);
        assertThat(text).containsText(R.string.hello_world).isVisible();
    }
}