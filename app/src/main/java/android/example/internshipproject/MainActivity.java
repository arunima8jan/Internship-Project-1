package android.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView myText,myText1;
    int value;
    EditText eName;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText=(TextView)findViewById(R.id.text_number);
        myText1=(TextView)findViewById(R.id.name);
        eName=(EditText)findViewById(R.id.name_edit);
    }
    public void Click(View view)
    {
        value=Integer.parseInt(myText.getText().toString());
        value=value+1;
        myText.setText(""+value);
        msg=eName.getText().toString();
        myText1.setText("Hello "+msg);
    }
    public void Reset(View view)
    {
        myText.setText(""+0);
    }
}
