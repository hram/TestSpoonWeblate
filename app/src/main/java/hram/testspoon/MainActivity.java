package hram.testspoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = ((EditText) findViewById(R.id.edit_value1)).getText().toString();
                String str2 = ((EditText) findViewById(R.id.edit_value2)).getText().toString();
                int value1 = Integer.valueOf(str1);
                int value2 = Integer.valueOf(str2);
                ((TextView) findViewById(R.id.text_result)).setText("" + (value1 + value2));
            }
        });
    }
}
