package itschoolsamsung.pyatnashki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

class FinishActivity extends GameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }

    public void Exite(View view) {
        finish();
    }

    public void Restart(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
