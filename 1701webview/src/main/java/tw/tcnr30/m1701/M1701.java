package tw.tcnr30.m1701;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class M1701 extends AppCompatActivity {

    private WebView webView;
    private static final String MAP_URL = "file:///android_asset/20210305_maskmap.html";// 自建的html檔名
    private static final String MAP_URL2 = "file:///android_asset/rock.html";// 自建的html檔名
    private int s=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m1701);
        setupViewComponent();
    }

    private void setupViewComponent() {
        webView=(WebView)findViewById(R.id.wv);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(MAP_URL);
    }

    //***********************************************
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //選擇用哪一個layout
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                this.finish();
                break;
            case R.id.rock:
                webView.loadUrl(MAP_URL2);
                break;
            case R.id.mask:
                webView.loadUrl(MAP_URL);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}