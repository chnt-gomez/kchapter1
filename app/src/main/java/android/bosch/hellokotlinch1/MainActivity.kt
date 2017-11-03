package android.bosch.hellokotlinch1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Kotlin adds null safety operations.
         */
        // TODO: 02/11/2017 (4): Make a nullable variable
        //This wont compile:
        var notNullArtist: Artist = null //No need of ;


        // TODO: 02/11/2017 (5): Make a smart cast to prevent unnecessary ifs
        if (notNullArtist != null){
            // TODO: 02/11/2017 (6): Print the artist
        }

        // TODO: 02/11/2017 (6): Assume that artist will never be null. Use !! operator and print it

        // TODO: (7) Use elvis operator to give an alternative in case the object is null

        /*
        Lambda expressions
         */
        // TODO: (8) import the layout to get all widgets (no more findViewById())

        // TODO: (9) add a click listener to the button in the @layout.activity_main resource

    }




}
