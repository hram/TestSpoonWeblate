package hram.testspoon;

import android.content.Intent;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test1 extends BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Before
    public void setUp() {
        mRule.launchActivity(new Intent());
    }

    @Test
    public void sum_3_3() throws Exception {

        onView(withId(R.id.edit_value1))
                .perform(typeText("3"));

        screenshot(mRule.getActivity(), "enter3");

        onView(withId(R.id.edit_value2))
                .perform(typeText("3"));

        screenshot(mRule.getActivity(), "enter3plus3");

        onView(withId(R.id.button))
                .perform(click());

        screenshot(mRule.getActivity(), "3plus3result6");

        onView(withId(R.id.text_result))
                .check(matches(withText("6")));
    }
}
