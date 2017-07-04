package hp.example.com.androidlistviewitemsclicked;



        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import hp.example.com.ListItemActivity1;
        import hp.example.com.ListItemActivity2;

class ListViewItemClickEventExample  extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_item_click_event);


        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Android ListView Item 1", "Android ListView Item 2",
                "Simple List View In Android", "List View onClick Event","Android List View OnItemClickListener",
                "Open New Activity When ListView item Clicked", "List View onClick Source Code", "List View Array Adapter Item Click",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(),ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}