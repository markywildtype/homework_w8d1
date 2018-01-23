package example.codeclan.com.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class WordCountActivity extends AppCompatActivity {

    EditText words;
    Button button;
    TextView wordCount;
    TextView individualWords    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        words = findViewById(R.id.entertext);
        button = findViewById(R.id.button);
        wordCount = findViewById(R.id.wordcount);
        individualWords = findViewById(R.id.individualwords);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        String sentence = words.getText().toString();
        WordCount sentenceToCount = new WordCount(sentence);
        String answer = "That is " + sentenceToCount.countWords() + " words";
        wordCount.setText(answer);
        HashMap<String, Integer> countByWord = sentenceToCount.countIndividualWordInstances();
        individualWords.setText(countByWord.toString());
    }


}
