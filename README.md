Android-Intents
===============

Having multiple activities in an Android application is almost absolutely necessary to construct a good user experience for users.  You can only do so much in a single activity before you run out of screen real estate.

We've learned about activites so far, but we really haven't dove too deep into how multiple activities interact with eachother.

In Android, we are able to control this interaction through [Intents](http://developer.android.com/guide/components/intents-filters.html).

For this lab, we'll be using intents to change activities, and also to send data between those activities.

Instructions
------

- Fork + Clone the repo
- Open the project up in Android Studio via the import tool
- Head on over to `app/src/main/java/com.flatironschool.intents/activities` and you'll find three activities `FirstActivity` `SecondActivity` and `ThirdActivity`.
- Open up `FirstActivity` and you'll find the empty method `onContinueButtonClick` that needs to be implemented. Here we intend on moving from this activity to `SecondActivity`.  No other data needs to be passed along.
  * This method is fired off when you click the button in the first activity.  Don't worry about the details about how that's happening, as it's all been abstracted out for you as this lab is only concerned with Intents.
- After you've successfully been able to move from the first activity to the second activity, open up `SecondActivity`.  You'll be presented with a similar situation and find an empty method `continueOnClick`.
  * In this method we intend to move to the `ThirdActivity` but we want to pass along some data.
  * Use the `ThirdActivity.EXTRA_ANYTHING_TEXT` and `ThirdActivity.EXTRA_COLOR` as keys for the extras to be passed.
  * Use the data passed in the parameters `anythingInput` and `colorInput` as the values.

