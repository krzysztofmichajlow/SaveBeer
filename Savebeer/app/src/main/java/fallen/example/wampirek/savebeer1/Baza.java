package fallen.example.wampirek.savebeer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fallen.example.wampirek.savebeer.R;

public class Baza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.baza);
    }

 public void loadnewbeer(View view){
      startActivity(new Intent(Baza.this, newbeer.class));
 }
}
