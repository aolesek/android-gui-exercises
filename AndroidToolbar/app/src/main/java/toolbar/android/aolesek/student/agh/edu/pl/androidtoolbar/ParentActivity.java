package toolbar.android.aolesek.student.agh.edu.pl.androidtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        Button stick = (Button) findViewById(R.id.stick);
        stick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ParentActivity.this, MainActivity.class);
                ParentActivity.this.startActivity(myIntent);
            }
        });
    }
}
