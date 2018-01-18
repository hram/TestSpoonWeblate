package hram.testspoon;

import android.app.Activity;
import android.support.annotation.NonNull;

import com.squareup.spoon.SpoonRule;

import org.junit.Rule;

/**
 * @author Evgeny Khramov
 */

public class BaseTest {

    @Rule
    public final SpoonRule mSpoonRule = new SpoonRule();

    protected void screenshot(Activity activity, @NonNull String name) {
        try {
            mSpoonRule.screenshot(activity, name);
        } catch (Exception e) {
            // do nothing
        }
    }
}
