package ca.georgiancollege.comp3025_lesson6_v2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// add widget refs for layout controls
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    // private instance variables
    private TextView _welcomeLabel;
    private Button _clickMeButton;
    private EditText _userInputTextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // control bindings
        _welcomeLabel = (TextView) findViewById(R.id.welcomeLabel);
        _clickMeButton = (Button) findViewById(R.id.clickMeButton);
        _userInputTextBox = (EditText) findViewById(R.id.userInputTextBox);

        _clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _welcomeLabel.setText(_userInputTextBox.getText());

                // or
               // _welcomeLabel.setText(getString(R.string.welcome_string));
            }
        });
    }


}
