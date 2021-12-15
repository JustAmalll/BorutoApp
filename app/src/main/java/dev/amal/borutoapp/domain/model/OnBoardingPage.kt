package dev.amal.borutoapp.domain.model

import androidx.annotation.DrawableRes
import dev.amal.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are then we have a great news for you!"
    )

    object Second : OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "Find your favourite heroes and learn some of the things that you didn't know about."
    )

    object Third : OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "Check out your hero's power and see how mush are they strong comparing to other."
    )
}
