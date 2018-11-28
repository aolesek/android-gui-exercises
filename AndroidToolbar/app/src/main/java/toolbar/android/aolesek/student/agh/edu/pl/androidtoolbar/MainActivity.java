package toolbar.android.aolesek.student.agh.edu.pl.androidtoolbar;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Context context = getApplicationContext();

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast settingsToast = Toast.makeText(context, "Sorry, can't help with that...", Toast.LENGTH_SHORT);
                settingsToast.show();
                return true;

            case R.id.action_favorite:
                Toast favToast = Toast.makeText(context, "Mmm, my favorite...", Toast.LENGTH_SHORT);
                favToast.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
