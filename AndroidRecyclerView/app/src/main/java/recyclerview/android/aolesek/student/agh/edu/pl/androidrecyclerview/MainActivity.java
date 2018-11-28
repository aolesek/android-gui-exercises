package recyclerview.android.aolesek.student.agh.edu.pl.androidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static int DATA_SET_SIZE = 1000;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(getSampleData());
        mRecyclerView.setAdapter(mAdapter);
    }

    private String[] getSampleData() {
        List<String> sampleData = new ArrayList<>(DATA_SET_SIZE);
        for (int i = 0; i < DATA_SET_SIZE; i++) {
            sampleData.add(String.format("Element %d\nDescription of %d element\nInteresting facts about %d element life", i, i, i));
        }
        return sampleData.toArray(new String[0]);
    }
}
