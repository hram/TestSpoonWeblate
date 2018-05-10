package hram.testspoon.package1;

import android.content.Intent;
import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import hram.testspoon.BaseTest;
import hram.testspoon.MainActivity;
import hram.testspoon.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class Test1 extends BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Before
    public void setUp() {
        mRule.launchActivity(new Intent());
    }

    @Test
    public void sum_1_1() {

        onView(withText("Пример сложения двух чисел"))
                .check(matches(isDisplayed()));

        onView(withId(R.id.edit_value1))
                .perform(typeText("1"));

        screenshot(mRule.getActivity(), "enter1");

        onView(withId(R.id.edit_value2))
                .perform(typeText("1"));

        screenshot(mRule.getActivity(), "enter1plus1");

        onView(withId(R.id.button))
                .perform(click());

        screenshot(mRule.getActivity(), "1plus1result2");

        onView(withId(R.id.text_result))
                .check(matches(withText("2")));
    }
}
