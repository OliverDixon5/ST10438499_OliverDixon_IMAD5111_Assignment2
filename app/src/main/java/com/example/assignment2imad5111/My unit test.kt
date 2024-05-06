package com.example.assignment2imad5111

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun testMainActivityButton() {
        // Start the MainActivity
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        // Check if the button is displayed and clickable
        onView(withId(R.id.goToActivityMain2Button)).check(matches(isDisplayed()))
        onView(withId(R.id.goToActivityMain2Button)).perform(click())

        // Check if MainActivity2 is displayed
        onView(withId(R.id.activity2Layout)).check(matches(isDisplayed()))

        // Close the MainActivity
        scenario.close()
    }

    @Test
    fun testMainActivity2Buttons() {
        // Start MainActivity2
        val scenario = ActivityScenario.launch(MainActivity2::class.java)

        // Check if buttons and image view are displayed
        onView(withId(R.id.feedButton)).check(matches(isDisplayed()))
        onView(withId(R.id.playButton)).check(matches(isDisplayed()))
        onView(withId(R.id.cleanButton)).check(matches(isDisplayed()))
        onView(withId(R.id.placeholderImage)).check(matches(isDisplayed()))

        // Perform clicks on each button and check if counters are incremented
        onView(withId(R.id.feedButton)).perform(click())
        onView(withId(R.id.hungerCount)).check(matches(withText("1")))

        onView(withId(R.id.playButton)).perform(click())
        onView(withId(R.id.happyCount)).check(matches(withText("1")))

        onView(withId(R.id.cleanButton)).perform(click())
        onView(withId(R.id.cleanCount)).check(matches(withText("1")))

        // Close MainActivity2
        scenario.close()
    }
}
