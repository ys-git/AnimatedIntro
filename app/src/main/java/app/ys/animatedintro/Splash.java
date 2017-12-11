package app.ys.animatedintro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * Created by YS on 12-12-2017.
 */

public class Splash extends Activity {

        private static final int SPLASH_DISPLAY_TIME = 4000; // splash screen delay time

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            new Handler().postDelayed(new Runnable() {
                public void run() {

                    Intent intent = new Intent();
                    intent.setClass(Splash.this, MainActivity.class);

                    Splash.this.startActivity(intent);
                    Splash.this.finish();

                    // transition from splash to main menu
                    overridePendingTransition(R.animate.activityfadein,
                            R.animate.splashfadeout);

                }
            }, SPLASH_DISPLAY_TIME);
        }
}
