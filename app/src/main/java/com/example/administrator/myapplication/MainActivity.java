package com.example.administrator.myapplication;

        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

        import com.google.android.gms.appindexing.Action;
        import com.google.android.gms.appindexing.AppIndex;
        import com.google.android.gms.appindexing.Thing;
        import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private EditText text2;
    private Button JiSuan;
    private Button QingChu;
    private Button Tuichu;
    private EditText hn1;
    private EditText hn2;
    private EditText hn3;
    private EditText hn4;
    private EditText tn1;
    private EditText tn2;
    private EditText tn3;
    private EditText tn4;
    private EditText hx1;
    private EditText hx2;
    private EditText hx3;
    private EditText hx4;
    private EditText jg1;
    private EditText jg2;
    private EditText jg3;
    private EditText jg4;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JiSuan = (Button) findViewById(R.id.JiSuan);
        QingChu = (Button) findViewById(R.id.QingChu);
        Tuichu = (Button) findViewById(R.id.Tuichu);
        text2 = (EditText) findViewById(R.id.text2);
        hn1 = (EditText) findViewById(R.id.hn1);
        hn2 = (EditText) findViewById(R.id.hn2);
        hn3 = (EditText) findViewById(R.id.hn3);
        hn4 = (EditText) findViewById(R.id.hn4);
        tn1 = (EditText) findViewById(R.id.tn1);
        tn2 = (EditText) findViewById(R.id.tn2);
        tn3 = (EditText) findViewById(R.id.tn3);
        tn4 = (EditText) findViewById(R.id.tn4);
        hx1 = (EditText) findViewById(R.id.hx1);
        hx2 = (EditText) findViewById(R.id.hx2);
        hx3 = (EditText) findViewById(R.id.hx3);
        hx4 = (EditText) findViewById(R.id.hx4);
        jg1 = (EditText) findViewById(R.id.jg1);
        jg2 = (EditText) findViewById(R.id.jg2);
        jg3 = (EditText) findViewById(R.id.jg3);
        jg4 = (EditText) findViewById(R.id.jg4);

        //计算功能实现
        JiSuan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText ddd = (EditText) findViewById(R.id.text2);
                String da = ddd.getText().toString();
                int d = Integer.parseInt(da);

                EditText hnA = (EditText) findViewById(R.id.hn1);
                String shnA = hnA.getText().toString();
                int hA = Integer.parseInt(shnA);
                EditText hnB = (EditText) findViewById(R.id.hn2);
                String shnB = hnB.getText().toString();
                int hB = Integer.parseInt(shnB);
                EditText hnC = (EditText) findViewById(R.id.hn3);
                String shnC = hnC.getText().toString();
                int hC = Integer.parseInt(shnC);
                EditText hnD = (EditText) findViewById(R.id.hn4);
                String shnD = hnD.getText().toString();
                int hD = Integer.parseInt(shnD);

                EditText tnA = (EditText) findViewById(R.id.tn1);
                String stnA = tnA.getText().toString();
                int tA = Integer.parseInt(stnA);
                EditText tnB = (EditText) findViewById(R.id.tn2);
                String stnB = tnB.getText().toString();
                int tB = Integer.parseInt(stnB);
                EditText tnC = (EditText) findViewById(R.id.tn3);
                String stnC = tnC.getText().toString();
                int tC = Integer.parseInt(stnC);
                EditText tnD = (EditText) findViewById(R.id.tn4);
                String stnD = tnD.getText().toString();
                int tD = Integer.parseInt(stnD);

                EditText hxA = (EditText) findViewById(R.id.hx1);
                String shxA = hxA.getText().toString();
                int xA = Integer.parseInt(shxA);
                EditText hxB = (EditText) findViewById(R.id.hx2);
                String shxB = hxB.getText().toString();
                int xB = Integer.parseInt(shxB);
                EditText hxC = (EditText) findViewById(R.id.hx3);
                String shxC = hxC.getText().toString();
                int xC = Integer.parseInt(shxC);
                EditText hxD = (EditText) findViewById(R.id.hx4);
                String shxD = hxD.getText().toString();
                int xD = Integer.parseInt(shxD);
                double jgA=(tA-tB)+(tA-tC)+(tA-tD)+(xA-xB)*(hA+1)*(hB+1)*d+(xA-xC)*(hA+1)*(hC+1)*d+(xA-xD)*(hA+1)*(hD+1)*d;
                double jgB=(tB-tA)+(tB-tC)+(tB-tD)+(xB-xA)*(hB+1)*(hA+1)*d+(xB-xC)*(hB+1)*(hC+1)*d+(xB-xD)*(hB+1)*(hD+1)*d;
                double jgC=(tC-tA)+(tC-tB)+(tC-tD)+(xC-xA)*(hC+1)*(hA+1)*d+(xC-xB)*(hC+1)*(hB+1)*d+(xC-xD)*(hC+1)*(hD+1)*d;
                double jgD=(tD-tA)+(tD-tB)+(tD-tC)+(xD-xA)*(hD+1)*(hA+1)*d+(xD-xB)*(hD+1)*(hB+1)*d+(xD-xC)*(hD+1)*(hC+1)*d;
                String jA = String.valueOf(jgA);
                String jB = String.valueOf(jgB);
                String jC = String.valueOf(jgC);
                String jD = String.valueOf(jgD);
                jg1.setText(jA);
                jg2.setText(jB);
                jg3.setText(jC);
                jg4.setText(jD);

            }
        });
        //以上是计算功能实现

        //清除功能实现
        QingChu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text2.setText("0.5");
                hn1.setText("0");
                hn2.setText("0");
                hn3.setText("0");
                hn4.setText("0");
                tn1.setText("0");
                tn2.setText("0");
                tn3.setText("0");
                tn4.setText("0");
                hx1.setText("0");
                hx2.setText("0");
                hx3.setText("0");
                hx4.setText("0");
                jg1.setText("0");
                jg2.setText("0");
                jg3.setText("0");
                jg4.setText("0");
            }
        });
        //以上是清除功能实现

        //退出功能实现
        Tuichu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        //以上是退出功能实现

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}


