package sg.edu.rp.c346.id20014241.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText, tvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.add(0,0,0, "English");
        getMenuInflater().inflate(R.menu.menu_main, menu); // inflate, meaning to use the menu_main in menu
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.englishSelection){
            tvTranslatedText.setText("Hello");
            tvTranslatedText2.setText("Bye");
        }
        else if (item.getItemId() == R.id.chineseSelection){
            tvTranslatedText.setText("你好");
            tvTranslatedText2.setText("再见");
        }
        else if (item.getItemId() == R.id.malaySelection){
            tvTranslatedText.setText("Hello");
            tvTranslatedText2.setText("selamat tinggal");
        }
        else if (item.getItemId() == R.id.tamilSelection){
            tvTranslatedText.setText("வணக்கம்");
            tvTranslatedText2.setText("வருகிறேன்");
        }
        else if (item.getItemId() == R.id.italianSelection){
            tvTranslatedText.setText("Ciao");
            tvTranslatedText2.setText("Addio");
        }
        return super.onOptionsItemSelected(item);
    }
}