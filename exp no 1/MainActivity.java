package np.com.bimalkafle.loginapp;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
private EditText usernameInput;
private EditText passwordInput;
private Button loginBtn;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
usernameInput = findViewById(R.id.username_input);
passwordInput = findViewById(R.id.password_input);
loginBtn = findViewById(R.id.login_btn);
loginBtn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String username = usernameInput.getText().toString();
String password = passwordInput.getText().toString();
Log.i("Test Credentials", "Username: " + username + " and Password: " + password);
}
});
}
}
