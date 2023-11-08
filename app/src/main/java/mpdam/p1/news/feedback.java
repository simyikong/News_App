package mpdam.p1.news;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class feedback extends AppCompatActivity {
    RatingBar RateBarFeedback;
    TextView TVRating;
    Button BTNFeedback;
    EditText ETFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        RateBarFeedback = findViewById(R.id.RateBarFeedback);
        TVRating = findViewById(R.id.TVRating);
        BTNFeedback = findViewById(R.id.BTNFeedback);
        ETFeedback = findViewById(R.id.ETFeedback);
        BTNFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitFeedback();
            }
        });

        RateBarFeedback.setRating(0);

        RateBarFeedback.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar,float rating, boolean fromUser){
                TVRating.setText("Rated: " + rating);
            }
        });
    }

    public void submitFeedback() {
        if (ETFeedback.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your feedback", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Thank You for your feedback!", Toast.LENGTH_SHORT).show();
    }

}


