package devoc.bridge;



        import android.app.Activity;
        import android.app.LauncherActivity;
        import android.os.Bundle;
        import android.content.Intent;
        import android.os.Handler;

/**
 * Created by Ankit on 05-06-2016.
 */
public class Splash extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, 3000);

    }

}
